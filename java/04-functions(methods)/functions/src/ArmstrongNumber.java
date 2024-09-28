import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();
        boolean result = isArmstrongNumber(num);
        System.out.println(result);

        for (int i = 100; i < 1000; i++) {
            if (isArmstrongNumber(i)) {
                System.out.print(i + " ");
            }
        }
    }

    static boolean isArmstrongNumber(int n) {
        int original = n;
        int sum = 0;
        while (n > 0){
            int rem = n % 10;
            n /= 10;
            sum += rem * rem * rem;
        }
        return original == sum;
    }
}
