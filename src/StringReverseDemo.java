public class StringReverseDemo {
    public static void main(String[] args) {
        String str ="java StringReverseDemo";
        System.out.println(str);
        System.out.println(str.length());
        String reverseStr = "";
        Integer ecounter = 0;
        for(int i=str.length()-1; i > -1; i--){
            System.out.println(str.charAt(i));
            reverseStr += str.charAt(i);
            if(str.charAt(i)=='e'){
                ecounter++;
            }
        }
        System.out.println("Reversed str: "+ reverseStr);
        System.out.println("count of e in str: "+ ecounter);
    }
}
