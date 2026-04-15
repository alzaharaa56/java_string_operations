import java.util.Arrays;

public class StringProcessDemo {
    public static void main(String[] args) {
        String employeeRecord = " Ali,IT,Software Engineer ";
        System.out.println(employeeRecord);

        String cleanedRecord = employeeRecord.trim();
        System.out.println(cleanedRecord);

        String[] parts = cleanedRecord.split(",");
        for (String part : parts) {
            System.out.println(part);
        }

        String word1 = "JAVA";
        String word2 = "java";
        System.out.println(word1.equalsIgnoreCase(word2));

        String emptyString = "";
        System.out.println(emptyString.isEmpty());
    }
}
