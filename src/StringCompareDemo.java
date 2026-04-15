public class StringCompareDemo {
    public static void main(String[] args) {
        String word1 = "Information";
        System.out.println(word1);

        System.out.println(word1.charAt(3));
        System.out.println(word1.substring(0, 4));

        String word2 = "Technology";
        boolean isEqual = word1.equals(word2);
        System.out.println(isEqual);

        String word3 = "Information";
        System.out.println(word1.equals(word3));
    }
}
