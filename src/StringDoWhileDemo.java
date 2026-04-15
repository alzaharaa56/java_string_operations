public class StringDoWhileDemo {
    public static void main(String[] args) {
        String sentence = "Learning Java is Fun";
        System.out.println(sentence);

        int totalLength = sentence.length();
        int counter = 0;
        int lowercaseCount = 0;
        int spaceCount = 0;

        if (totalLength > 0) {
            do {
                char ch = sentence.charAt(counter);
                System.out.println(ch);

                if (Character.isLowerCase(ch)) {
                    lowercaseCount++;
                }

                if (ch == ' ') {
                    spaceCount++;
                }

                counter++;
            } while (counter < totalLength);
        }

        System.out.println(lowercaseCount);
        System.out.println(spaceCount);
    }
}
