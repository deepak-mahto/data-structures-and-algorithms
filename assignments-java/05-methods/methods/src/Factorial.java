import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();

        int factorial = factorialOfNum(num);
        System.out.println("Factorial of number is: " + factorial);
    }
    static int factorialOfNum(int n) {
        int fact = 1;

        for (int i = 1; i <= n ; i++) {
            fact *= i;
        }
        return fact;
    }
}
