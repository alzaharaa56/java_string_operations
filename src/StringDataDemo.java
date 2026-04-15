
public class StringDataDemo {
    public static void main(String[] args) {
        String sentence = "Java is a Versatile Language";
        System.out.println(sentence);

        System.out.println(sentence.toUpperCase());
        System.out.println(sentence.toLowerCase());

        int pos = sentence.indexOf("Versatile");
        System.out.println(pos);

        String sub = sentence.substring(0, 4);
        System.out.println(sub);

        boolean hasWord = sentence.contains("Language");
        System.out.println(hasWord);
    }
}