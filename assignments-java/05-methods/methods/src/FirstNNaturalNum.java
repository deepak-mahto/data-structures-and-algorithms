import java.util.Scanner;

public class FirstNNaturalNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number up to which you want the sum of those: ");
        int n = in.nextInt();
        int result = sumOfFirstNaturalNumbers(n);
        System.out.println("sum of first " + n + " " + "natural numbers: " + result);
    }
    static int sumOfFirstNaturalNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n ; i++) {
            sum += i;
        }
        return sum;
    }
}
