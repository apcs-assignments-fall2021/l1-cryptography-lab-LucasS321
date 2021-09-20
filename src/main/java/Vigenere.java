import java.util.Scanner;

public class Vigenere {
    public static char encryptCaesarLetter(char ch, int key) {
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            int NewKey =  (ch + key);
            if ((ch >= 'A' && ch <= 'Z')) {
                while (!((NewKey >= 'A' && NewKey <= 'Z'))) {
                    NewKey = NewKey - (26);
                }
            }
            if ((ch >= 'a' && ch <= 'z')) {
                while (!((NewKey >= 'a' && NewKey <= 'z'))) {
                    NewKey = NewKey - (26);
                }
            }
            return (char) NewKey;
        } else {
            return ch;
        }
    }

    public static char decryptCaesarLetter(char ch, int key) {
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            int NewKey =  (ch - key);
            if ((ch >= 'A' && ch <= 'Z')) {
                while (!((NewKey >= 'A' && NewKey <= 'Z'))) {
                    NewKey = NewKey + (26);
                }
            }
            if ((ch >= 'a' && ch <= 'z')) {
                while (!((NewKey >= 'a' && NewKey <= 'z'))) {
                    NewKey = NewKey + (26);
                }
            }
            return (char) NewKey;
        } else {
            return ch;
        }
    }
    public static int getLetterKey(char ch) {
        if (ch >= 'a' && ch <= 'z') {
            return (ch-'a');
        }
        if (ch >= 'A' && ch <= 'Z') {
            return (ch-'A');
        } else {
            return -1;
        }
    }
    public static String encryptVigenere(String message, String key) {
        String retmessage="";
        int keyspot = 0;
         for (int i = 0; i < message.length();i++) {
             retmessage = retmessage+encryptCaesarLetter(message.charAt(i),getLetterKey(key.charAt(keyspot)));
             if ((message.charAt(i) >= 'a' && message.charAt(i) <= 'z') || (message.charAt(i) >= 'A' && message.charAt(i) <= 'Z')) {
                 if (keyspot == key.length() - 1) {
                     keyspot = 0;
                 } else {
                     keyspot += 1;
                 }
             }
         }
         return retmessage;
    }

    public static String decryptVigenere(String message, String key) {
        String retmessage="";
        int keyspot = 0;
        for (int i = 0; i < message.length();i++) {
            retmessage = retmessage+decryptCaesarLetter(message.charAt(i),getLetterKey(key.charAt(keyspot)));
            if ((message.charAt(i) >= 'a' && message.charAt(i) <= 'z') || (message.charAt(i) >= 'A' && message.charAt(i) <= 'Z')) {
                if (keyspot == key.length() - 1) {
                    keyspot = 0;
                } else {
                    keyspot += 1;
                }
            }
        }
        return retmessage;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Would you like to \"encrypt\" or \"decrypt\" a message?");
        String command = scan.nextLine().trim().toLowerCase();

        if (command.equals("encrypt")) {
            System.out.println("Please enter your message to be encrypted: ");
            String message = scan.nextLine();
            System.out.println("Please enter the key for your message: ");
            String key = scan.nextLine().trim().toUpperCase();
            System.out.println("Here is your encrypted message: ");
            System.out.println(encryptVigenere(message, key));
        }
        else if (command.equals("decrypt")) {
            System.out.println("Please enter your message to be decrypted: ");
            String message = scan.nextLine();
            System.out.println("Please enter the key for your message: ");
            String key = scan.nextLine().trim().toUpperCase();
            System.out.println("Here is your decrypted message: ");
            System.out.println(decryptVigenere(message, key));
        }
        else {
            System.out.println("Unknown command; please type either \"encrypt\" or \"decrypt\"");
        }

        scan.close();
    }
}
