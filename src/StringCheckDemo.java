
public class StringCheckDemo {
    public static void main(String[] args) {

        String message = "Welcome to the Java programming world";
        System.out.println(message);


        String extracted = message.substring(15, 19);
        System.out.println(extracted);


        String updatedMessage = message.replace("world", "course");
        System.out.println(updatedMessage);


        boolean includesWord = message.contains("Java");
        System.out.println(includesWord);


        char specificChar = message.charAt(0);
        System.out.println(specificChar);


        String secondText = " Learning is fun";
        System.out.println(secondText.trim().toUpperCase());
    }
}