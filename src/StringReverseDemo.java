public class StringReverseDemo {
    public static void main(String[] args) {

        String original = "Java Programming";
        System.out.println("Original String: " + original);


        int length = original.length();
        System.out.println("Total characters: " + length);


        System.out.println("Characters one by one:");
        for (int i = 0; i < length; i++) {
            System.out.println(original.charAt(i));
        }


        String reversed = "";
        for (int i = length - 1; i >= 0; i--) {
            reversed += original.charAt(i);
        }
        System.out.println("Reversed String: " + reversed);


        char target = 'a';
        int count = 0;
        for (int i = 0; i < length; i++) {
            if (original.charAt(i) == target) {
                count++;
            }
        }
        System.out.println("Character '" + target + "' appears: " + count + " times");


        System.out.println("Comparison: " + original + "  " + reversed);
    }
}
