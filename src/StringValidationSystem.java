import java.util.Scanner;

public class StringValidationSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter a sample string: ");
        String input = sc.nextLine();


        System.out.println("Original string: " + input);
        System.out.println("Length: " + input.length());
        System.out.println("Uppercase: " + input.toUpperCase());
        System.out.println("Lowercase: " + input.toLowerCase());


        System.out.print("Enter a word to search: ");
        String word = sc.nextLine();
        System.out.println("Contains " + word + ": " + input.contains(word));


        System.out.print("Enter another string for comparison: ");
        String other = sc.nextLine();
        System.out.println("Equals (ignore case): " + input.equalsIgnoreCase(other));


        if (input.length() >= 3) {
            String sub = input.substring(0, 3);
            System.out.println("Substring (first 3 chars): " + sub);
        } else {
            System.out.println("String too short for substring extraction.");
        }


        if (input.length() > 5) {
            System.out.println("The string length is greater than 5.");
        } else {
            System.out.println("The string length is 5 or less.");
        }

        sc.close();
    }
}

