import java.util.Scanner;

public class Affine {
    public static String encryptAffine(String message) {
        String newstr = "";
        for (int i = 0; i < message.length();i++) {
            char LTT = message.charAt(i);
            char LTT2 = message.charAt(i);
            if (LTT >= 'a' && LTT <= 'z') {
                LTT = (char) (LTT-'a');
            }
            if (LTT >= 'A' && LTT <= 'Z') {
                LTT = (char) (LTT-'A');
            }
            int newnum = ((3 * LTT) ) % 26;

            System.out.println(newnum);
            if (LTT2 >= 'a' && LTT2 <= 'z') {
                newstr = newstr + (char) (newnum+'a');
            } else if (LTT2 >= 'A' && LTT2 <= 'Z') {
                newstr = newstr+(char) (newnum+'A');
            } else {
                newstr = newstr + LTT2;
            }

        }

        // REPLACE THIS WITH YOUR CODE
        return newstr;
    }

    public static String decryptAffine(String message) {
        String newstr = "";
        for (int i = 0; i < message.length();i++) {
            char LTT = message.charAt(i);
            char LTT2 = message.charAt(i);
            if (LTT >= 'a' && LTT <= 'z') {
                LTT = (char) (LTT-'a');
            }
            if (LTT >= 'A' && LTT <= 'Z') {
                LTT = (char) (LTT-'A');
            }
            int newnum = ((3 * LTT) ) % 26;

            System.out.println(newnum);
            if (LTT2 >= 'a' && LTT2 <= 'z') {
                newstr = newstr + (char) (newnum+'a');
            } else if (LTT2 >= 'A' && LTT2 <= 'Z') {
                newstr = newstr+(char) (newnum+'A');
            } else {
                newstr = newstr + LTT2;
            }

        }

        // REPLACE THIS WITH YOUR CODE
        return newstr;
    }

    public static String encryptAffineKeys(String message, int key1, int key2) {
        // REPLACE THIS WITH YOUR CODE
        return message;
    }

    public static int modularInverse(int x) {
        // REPLACE THIS WITH YOUR CODE
        return -1;
    }


    public static String decryptAffineKeys(String message, int key1, int key2) {
        // REPLACE THIS WITH YOUR CODE
        return message;
    }

    // Some basic testing code
    public static void main(String[] args) {
        System.out.println("Encrypt and Decrypt Basic Tests:");
        System.out.println(encryptAffine(("Hello, World!"))); // Vmhhq, Oqzhj!
        System.out.println(decryptAffine("Vmhhq, Oqzhj!")); // Hello, World!

        System.out.println();
        System.out.println("Modular Inverse Tests:");
        System.out.println(modularInverse(9)); // 3
        System.out.println(modularInverse(3)); // 9
        System.out.println(modularInverse(23)); // 17

        System.out.println();
        System.out.println("Affine Encrypt and Decrypt with Keys Tests:");
        System.out.println(encryptAffineKeys("hello", 5, 17)); // aluuj
        System.out.println(decryptAffineKeys("aluuj", 5, 17)); // hello
    }
}
