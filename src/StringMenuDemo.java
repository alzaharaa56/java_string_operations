import java.util.Scanner;

public class StringMenuDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter a sample string: ");
        String input = sc.nextLine();


        System.out.println("Menu:");
        System.out.println("1. Display length");
        System.out.println("2. Convert to uppercase");
        System.out.println("3. Convert to lowercase");
        System.out.println("4. Check if string contains a word");
        System.out.println("5. Compare with another string (equalsIgnoreCase)");


        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        sc.nextLine();


        switch (choice) {
            case 1:
                System.out.println("Length: " + input.length());
                break;
            case 2:
                System.out.println("Uppercase: " + input.toUpperCase());
                break;
            case 3:
                System.out.println("Lowercase: " + input.toLowerCase());
                break;
            case 4:
                System.out.print("Enter word to check: ");
                String word = sc.nextLine();
                System.out.println("Contains " + word + ": " + input.contains(word));
                break;
            case 5:
                System.out.print("Enter another string: ");
                String other = sc.nextLine();
                System.out.println("Equals (ignore case): " + input.equalsIgnoreCase(other));
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }

        sc.close();
    }
}

