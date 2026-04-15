public class StringNestedLoopDemo {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = "Oman";

        System.out.println(str1);
        System.out.println(str2);

        int len1 = str1.length();
        int len2 = str2.length();

        int matchingCount = 0;

        for (int i = 0; i < len1; i++) {
            for (int j = 0; j < len2; j++) {
                if (str1.charAt(i) == str2.charAt(j)) {
                    System.out.println(str1.charAt(i));
                    matchingCount++;
                }
            }
        }
        System.out.println(matchingCount);

        String wordA = "code";
        String wordB = "cool";
        for (int i = 0; i < wordA.length(); i++) {
            for (int j = 0; j < wordB.length(); j++) {
                if (wordA.charAt(i) == wordB.charAt(j)) {
                    System.out.println(wordA.charAt(i) + " matches " + wordB.charAt(j));
                }
            }
        }
    }
}
