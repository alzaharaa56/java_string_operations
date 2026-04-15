public class StringWhileDemo {
    public static void main(String[] args) {
        String sentence = "Java String Operations Task 12";
        System.out.println(sentence);

        int totalLength = sentence.length();
        int counter = 0;
        int spaceCount = 0;
        int upperCaseCount = 0;

        while (counter < totalLength) {
            char ch = sentence.charAt(counter);
            System.out.println(ch);

            if (ch == ' ') {
                spaceCount++;
            }

            if (Character.isUpperCase(ch)) {
                upperCaseCount++;
            }

            counter++;
        }

        System.out.println(spaceCount);
        System.out.println(upperCaseCount);
    }
}
