public class StringValidationDemo {
    public static void main(String[] args) {
        String textValue = "report_2026.pdf";
        System.out.println(textValue);

        System.out.println(textValue.startsWith("report"));

        System.out.println(textValue.endsWith(".pdf"));

        String updatedText = textValue.replace("2026", "2027");
        System.out.println(updatedText);

        String extracted = updatedText.substring(0, 6);
        System.out.println(extracted);

        System.out.println(updatedText.length());
    }
}
