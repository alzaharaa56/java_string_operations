public class StringRecordDemo {
    public static void main(String[] args) {
        String record = " ID001,Ali,Muscat ";
        System.out.println(record);

        String cleanedRecord = record.trim();
        System.out.println(cleanedRecord);

        String word1 = "JAVA";
        String word2 = "java";
        System.out.println(word1.equalsIgnoreCase(word2));

        String[] parts = cleanedRecord.split(",");
        for (String part : parts) {
            System.out.println(part);
        }

        String emptyVar = "";
        System.out.println(emptyVar.isEmpty());

        System.out.println(cleanedRecord.charAt(0));
    }
}