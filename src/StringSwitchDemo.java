public class StringSwitchDemo {
    public static void main(String[] args) {
        String department = "Finance";


        System.out.println("Original string: " + department);


        switch (department) {
            case "Admin":
                System.out.println("You selected Admin department.");
                break;
            case "Finance":
                System.out.println("You selected Finance department.");
                break;
            case "HR":
                System.out.println("You selected HR department.");
                break;
            default:
                System.out.println("Department not recognized.");
        }
    }
}




