public class StringOperationsDemo {
    public static void main(String[] args) {
        String customerName = "Ali ";
        System.out.println(customerName);

        System.out.println(customerName.length());
        System.out.println(customerName.toUpperCase());
        System.out.println(customerName.toLowerCase());

        String companyName = "Ahmed ";
        String combinedString = customerName.concat(companyName);
        System.out.println(combinedString);
    }
}
