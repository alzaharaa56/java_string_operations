import java.util.Scanner;

public class StringSearchModifySystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter a sample string: ");
        String input = sc.nextLine();


        System.out.println("Original string: " + input);


        System.out.print("Enter a word to search: ");
        String searchWord = sc.nextLine();
        System.out.println("Contains " + searchWord + ": " + input.contains(searchWord));


        System.out.print("Enter a word to replace: ");
        String oldWord = sc.nextLine();
        System.out.print("Enter the new replacement word: ");
        String newWord = sc.nextLine();
        String modified = input.replace(oldWord, newWord);
        System.out.println("Modified string: " + modified);


        if (modified.length() >= 4) {
            String sub = modified.substring(0, 4);
            System.out.println("Substring (first 4 chars): " + sub);
        } else {
            System.out.println("String too short for substring extraction.");
        }


        if (!modified.isEmpty()) {
            System.out.println("First character of modified string: " + modified.charAt(0));
        } else {
            System.out.println("Modified string is empty.");
        }


        if (modified.length() > 8) {
            System.out.println("The modified string has more than 8 characters.");
        } else {
            System.out.println("The modified string has 8 or fewer characters.");
        }

        sc.close();
    }
}
