import java.util.Scanner;

public class EligibleToVote {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = in.nextInt();
        String eligibleOrNot = voteCasting(age);
        System.out.print("Eligible to cast vote or not: " + eligibleOrNot);
    }
    static String voteCasting(int age) {
        String result = "";
        if (age >= 18) {
            result += "Eligible";
        } else {
            result += "Not eligible";
        }
        return result;
    }
}
