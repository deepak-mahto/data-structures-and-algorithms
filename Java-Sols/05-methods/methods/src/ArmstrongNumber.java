import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();

        if (isArmstrong(num)) {
            System.out.println("Armstrong number.");
        } else {
            System.out.println("Not an armstrong number.");
        }
    }
    static boolean isArmstrong(int n) {
        int sum = 0, rem, temp = n;
        while (temp > 0) {
            rem = temp % 10;
            sum += rem * rem * rem;
            temp /= 10;
        }
        return n == sum;
    }
}
