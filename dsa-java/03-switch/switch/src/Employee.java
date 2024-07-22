import java.util.Scanner;

public class Employee {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empId = in.nextInt();
        String department = in.next();

        switch (empId) {
            case 1 -> System.out.println("Deepak Kumar");
            case 2 -> System.out.println("Ram");
            case 3 -> {
                System.out.println("Employee number 3");
                switch (department) {
                    case "IT" -> System.out.println("IT Department");
                    case "management" -> System.out.println("Management department");
                    default -> System.out.println("No department entered");
                }
            }
            default -> System.out.println("Enter correct email id");
        }
    }
}
