
public class StringIfElseIfDemo {
    public static void main(String[] args) {

        String inputData = "IT_Dept";
        System.out.println("Original String: " + inputData);


        if (inputData.isEmpty()) {

            System.out.println("The string is empty.");
        } else if (inputData.length() < 5) {

            System.out.println("The string is short.");
        } else if (inputData.startsWith("IT")) {

            System.out.println("The string starts with IT.");
        } else if (inputData.endsWith("_Dept")) {

            System.out.println("The string ends with _Dept.");
        } else if (inputData.equalsIgnoreCase("admin")) {

            System.out.println("The string matches 'admin'.");
        } else {

            System.out.println("None of the conditions were met.");
        }
    }
}