import java.util.Scanner;

public class CountDigit {
    public static void main(String[] args) {
        // Find out the number of times a digit come in a number
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int count = 0;
        while (num > 0) {
            int rem = num % 10;
            if (rem == 5) {
                count++;
            }
            num /= 10;
        }
        System.out.println(count);
    }
}
