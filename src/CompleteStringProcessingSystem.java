import java.util.Scanner;

public class CompleteStringProcessingSystem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sample string: ");
        String original = sc.nextLine();


        System.out.println("Original string: " + original);


        System.out.println("Total number of characters: " + original.length());


        System.out.println("Uppercase: " + original.toUpperCase());


        System.out.println("Lowercase: " + original.toLowerCase());


        System.out.print("Enter a word to search in the string: ");
        String searchWord = sc.nextLine();


        if (original.contains(searchWord)) {
            System.out.println("The word " + searchWord + " exists in the string.");
        } else {
            System.out.println("The word \"" + searchWord + "\" does not exist in the string.");
        }


        System.out.print("Enter another string for comparison: ");
        String compareStr = sc.nextLine();


        if (original.equalsIgnoreCase(compareStr)) {
            System.out.println("Both strings are equal (ignoring case).");
        } else {
            System.out.println("Strings are not equal.");
        }


        if (original.length() > 0) {
            System.out.println("First character of the string: " + original.charAt(0));
        }


        int vowelCount = 0;
        System.out.println("Characters in the string:");
        for (int i = 0; i < original.length(); i++) {
            char ch = original.charAt(i);
            System.out.println("Character at index " + i + ": " + ch);

            if ("AEIOUaeiou".indexOf(ch) != 1) {
                vowelCount++;
            }
        }

        System.out.println("Total number of vowels: " + vowelCount);

        if (original.length() > 10) {
            System.out.println("The string is long (length greater than 10).");
        } else {
            System.out.println("The string is short (length 10 or less).");
        }

        sc.close();
    }
}

