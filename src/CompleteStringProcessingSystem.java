import java.util.Scanner;

public class CompleteStringProcessingSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sample string: ");
        String str = sc.nextLine();

        System.out.println(str);

        System.out.println(str.length());

        System.out.println("Uppercase: " + str.toUpperCase());

        System.out.println("Lowercase: " + str.toLowerCase());

        System.out.print("Enter a word to search: ");
        String word = sc.nextLine();

        System.out.println(str.contains(word));

        System.out.print("Enter another string to compare: ");
        String str2 = sc.nextLine();

        System.out.println(str.equalsIgnoreCase(str2));

        System.out.println("First character: " + str.charAt(0));


        Integer vowelCount = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            }
        }

        System.out.println("Number of vowels: " + vowelCount);

        if (str.length() > 10) {
            System.out.println("The string is long.");
        } else {
            System.out.println("The string is short.");
        }
    }
}


