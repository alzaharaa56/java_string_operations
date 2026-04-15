import java.util.Scanner;

public class StringAnalysisSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter a sample string: ");
        String input = sc.nextLine();


        System.out.println("Original string: " + input);
        System.out.println("Length: " + input.length());


        System.out.print("Enter a word to search: ");
        String word = sc.nextLine();
        System.out.println("Contains " + word + ": " + input.contains(word));


        System.out.print("Enter another string for comparison: ");
        String other = sc.nextLine();
        System.out.println("Equals (ignore case): " + input.equalsIgnoreCase(other));


        if (!input.isEmpty()) {
            System.out.println("First character: " + input.charAt(0));
        } else {
            System.out.println("String is empty, no first character.");
        }


        if (input.length() > 10) {
            System.out.println("The string is long.");
        } else {
            System.out.println("The string is short.");
        }

        sc.close();
    }
}

