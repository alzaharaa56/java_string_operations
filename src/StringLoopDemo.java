public class StringLoopDemo {
    public static void main(String[] args) {
        String sentence = "Java 2026 Programming";
        System.out.println(sentence);

        int totalChars = sentence.length();
        System.out.println(totalChars);

        int vowels = 0;
        int consonants = 0;
        int digits = 0;

        String lowerCaseStr = sentence.toLowerCase();

        for (int i = 0; i < totalChars; i++) {
            char ch = sentence.charAt(i);
            char lowerCh = lowerCaseStr.charAt(i);

            System.out.println(ch);

            if (Character.isDigit(ch)) {
                digits++;
            } else if (lowerCh >= 'a' && lowerCh <= 'z') {
                if (lowerCh == 'a' || lowerCh == 'e' || lowerCh == 'i' || lowerCh == 'o' || lowerCh == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println(vowels);
        System.out.println(consonants);
        System.out.println(digits);
    }
}
