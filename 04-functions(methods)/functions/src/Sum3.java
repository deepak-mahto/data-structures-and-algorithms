import java.util.Scanner;

public class Sum3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter num1: ");
        int num1 = in.nextInt();
        System.out.print("Enter num2: ");
        int num2 = in.nextInt();

        int ans = sum3(num1, num2);
        System.out.print("Sum: " + ans);
    }
    static int sum3(int a, int b) {
        return a + b;
    }
}
