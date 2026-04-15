public class StringAnalysisDemo {
    public static void main(String[] args) {
        String text1 = "Java Programming";
        System.out.println(text1);

        System.out.println(text1.length());

        String text2 = "java programming";
        System.out.println(text1.equals(text2));

        System.out.println(text1.indexOf("Pro"));

        System.out.println(text1.startsWith("Java"));

        System.out.println(text1.endsWith("ing"));
    }
}
