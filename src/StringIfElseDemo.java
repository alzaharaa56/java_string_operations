public class StringIfElseDemo {
public static void main(String[] args) {

    String username = "Noor";
    System.out.println("Username: " + username);


    if (username.length() > 5) {
        System.out.println("Username length is valid.");
    } else {
        System.out.println("Username is too short.");
    }


    String password = "Password153";
    if (password.equals("Password153")) {
        System.out.println("Password is correct.");
    } else {
        System.out.println("Password is incorrect.");
    }


    if (username.contains("I")) {
        System.out.println("Username contains the letter 'I'.");
    } else {
        System.out.println("Username does not contain the letter 'I'.");
    }


    if (username.isEmpty()) {
        System.out.println("Username is empty.");
    } else {
        System.out.println("Username is not empty.");
    }
}
}
