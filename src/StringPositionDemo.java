public class StringPositionDemo {
    public static void main(String[] args) {
        String textValue = "Learning Java is fun";
        System.out.println(textValue);

        int position = textValue.indexOf("Java");
        System.out.println(position);

        boolean startsWithWord = textValue.startsWith("Learning");
        System.out.println(startsWithWord);

        boolean endsWithSymbol = textValue.endsWith("!");
        System.out.println(endsWithSymbol);
    }
}
