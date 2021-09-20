import java.util.Scanner;

public class Caesar {
    // Given a String, encrypts the String with the Caesar cipher
    // and returns the encrypted String
    // Ex. encryptCaesar("Hello, World!") => "Khoor, Zruog!"
    public static String encryptCaesar(String message) {
        String newstr = "";
        for (int i = 0; i < message.length();i++) {
            char LTT = message.charAt(i);
            if ((LTT >= 'a' && LTT <= 'z') || (LTT >= 'A' && LTT <= 'Z')) {
                if (LTT == 'Z') {
                    newstr = newstr+"C";
                } else if (LTT == 'Y') {
                    newstr=  newstr+"B";
                }
                else if (LTT == 'X') {
                    newstr=  newstr+"A";
                } else if (LTT == 'z') {
                    newstr=  newstr+"c";
                } else if (LTT == 'y') {
                    newstr=  newstr+"b";
                } else if (LTT == 'x') {
                    newstr=  newstr+"a";
                } else {
                    newstr = newstr+(char) (LTT+3);
                }
            } else {
                newstr=newstr+LTT;
            }

        }
        // REPLACE THIS WITH YOUR CODE
        return newstr;
    }

    // Given a String, decrypts the String with the Caesar cipher
    // and returns the original String
    // Ex. decryptCaesar("Khoor, Zruog!") => "Hello, World!"
    public static String decryptCaesar(String message) {
        String newstr = "";
        for (int i = 0; i < message.length();i++) {
            char LTT = message.charAt(i);
            if ((LTT >= 'a' && LTT <= 'z') || (LTT >= 'A' && LTT <= 'Z')) {
                if (LTT == 'A') {
                    newstr = newstr+"X";
                } else if (LTT == 'B') {
                    newstr=  newstr+"Y";
                }
                else if (LTT == 'C') {
                    newstr=  newstr+"Z";
                } else if (LTT == 'a') {
                    newstr=  newstr+"x";
                } else if (LTT == 'b') {
                    newstr=  newstr+"y";
                } else if (LTT == 'c') {
                    newstr=  newstr+"z";
                } else {
                    newstr = newstr+(char) (LTT-3);
                }
            } else {
                newstr=newstr+LTT;
            }

        }
        // REPLACE THIS WITH YOUR CODE
        return newstr;
    }

    // Given a String and a key corresponding to a shift, encrypts
    // the String using the given key and returns the encrypted String
    // Ex. encryptCaesarKey("Hello, World!", 5) => "Mjqqt, Btwqi!".
    public static String encryptCaesarKey(String message, int key) {
        String newstr = "";
        for (int i = 0; i < message.length();i++) {
            char LTT = message.charAt(i);
            if ((LTT >= 'a' && LTT <= 'z') || (LTT >= 'A' && LTT <= 'Z')) {
                int NewKey =  (LTT + key);
                if ((LTT >= 'A' && LTT <= 'Z')) {
                    while (!((NewKey >= 'A' && NewKey <= 'Z'))) {
                        NewKey = NewKey - (26);
                    }
                }
                if ((LTT >= 'a' && LTT <= 'z')) {
                    while (!((NewKey >= 'a' && NewKey <= 'z'))) {
                        NewKey = NewKey - (26);
                    }
                }
                newstr = newstr + (char) NewKey;
            } else {
                newstr=newstr+LTT;
            }

        }
        // REPLACE THIS WITH YOUR CODE
        return newstr;
    }

    // Given a String and a key corresponding to a shift, decrypts
    // the String using the given key and returns the original String
    // Ex. decryptCaesarKey("Mjqqt, Btwqi!", 5) => "Hello, World!"
    public static String decryptCaesarKey(String message, int key) {
        String newstr = "";
        for (int i = 0; i < message.length();i++) {
            char LTT = message.charAt(i);
            if ((LTT >= 'a' && LTT <= 'z') || (LTT >= 'A' && LTT <= 'Z')) {
                int NewKey =  (LTT - key);
                if ((LTT >= 'A' && LTT <= 'Z')) {
                    while (!((NewKey >= 'A' && NewKey <= 'Z'))) {
                        NewKey = NewKey + (26);
                    }
                }
                if ((LTT >= 'a' && LTT <= 'z')) {
                    while (!((NewKey >= 'a' && NewKey <= 'z'))) {
                        NewKey = NewKey + (26);
                    }
                }
                newstr = newstr + (char) NewKey;
            } else {
                newstr=newstr+LTT;
            }

        }
        // REPLACE THIS WITH YOUR CODE
        return newstr;
    }


    // The main method is already provided for you
    // You do not need to edit this code until Part 2
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Would you like to \"encrypt\" or \"decrypt\" a message?");
        String command = scan.nextLine().trim().toLowerCase();

        if (command.equals("encrypt")) {
            System.out.println("Please enter your message to be encrypted: ");
            String message = scan.nextLine();
            System.out.println("Here is your encrypted message: ");
            System.out.println(encryptCaesar(message));
        }
        else if (command.equals("decrypt")) {
            System.out.println("Please enter your message to be decrypted: ");
            String message = scan.nextLine();
            System.out.println("Here is your decrypted message: ");
            System.out.println(decryptCaesar(message));
        }
        else {
            System.out.println("Unknown command; please type either \"encrypt\" or \"decrypt\"");
        }

        scan.close();
    }
}
