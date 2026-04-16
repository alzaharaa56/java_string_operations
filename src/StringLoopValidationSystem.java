import java.util.Scanner;

public class StringLoopValidationSystem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sample string: ");
        String original = sc.nextLine();


        System.out.println("Original string: " + original);


        System.out.println("Total number of characters: " + original.length());


        int vowelCount = 0;
        System.out.println("Characters in the string:");
        for (int i = 0; i < original.length(); i++) {
            char ch = original.charAt(i);
            System.out.println("Character at index " + i + ": " + ch);


            if ("AEIOUaeios".indexOf(ch) != -1) {
                vowelCount++;
            }
        }


        System.out.println("Total number of vowels: " + vowelCount);


        System.out.print("Enter a word to search in the string: ");
        String searchWord = sc.nextLine();


        if (original.contains(searchWord)) {
            System.out.println("The word " + searchWord + " exists in the string.");
        } else {
            System.out.println("The word " + searchWord + " does not exist in the string.");
        }


        if (original.length() > 10) {
            System.out.println("The string is long (length greater than 10).");
        } else {
            System.out.println("The string is short (length 10 or less).");
        }

        sc.close();
    }
}

