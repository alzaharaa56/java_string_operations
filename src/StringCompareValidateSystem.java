import java.util.Scanner;

public class StringCompareValidateSystem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sample string: ");
        String original = sc.nextLine();

        System.out.println("Original string: " + original);

        System.out.println("Total number of characters: " + original.length());

        System.out.print("Enter another string for comparison: ");
        String compareStr = sc.nextLine();

        if (original.equals(compareStr)) {
            System.out.println("Both strings are equal.");
        } else {
            System.out.println("Strings are not equal.");
        }

        System.out.print("Enter a prefix value: ");
        String prefix = sc.nextLine();

        if (original.startsWith(prefix)) {
            System.out.println("The string starts with the prefix " + prefix + ".");
        } else {
            System.out.println("The string does not start with the prefix " + prefix + ".");
        }

        System.out.print("Enter a suffix value: ");
        String suffix = sc.nextLine();

        if (original.endsWith(suffix)) {
            System.out.println("The string ends with the suffix " + suffix + ".");
        } else {
            System.out.println("The string does not end with the suffix " + suffix + ".");
        }

        if (original.length() > 8) {
            System.out.println("The string length is greater than 8.");
        } else {
            System.out.println("The string length is not greater than 8.");
        }
        sc.close();
    }
}

