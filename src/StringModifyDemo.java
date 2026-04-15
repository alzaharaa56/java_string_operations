public class StringModifyDemo {
    public static void main(String[] args) {
        String sentence = " Java is a powerful language ";
        System.out.println(sentence);

        String trimmed = sentence.trim();
        System.out.println(trimmed);

        boolean hasWord = trimmed.contains("powerful");
        System.out.println(hasWord);

        String updatedSentence = trimmed.replace("powerful", "versatile");
        System.out.println(updatedSentence);
    }
}
