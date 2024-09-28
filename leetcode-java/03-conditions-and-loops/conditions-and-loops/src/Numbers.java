import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int productOfDigit = 1;
        int sumOfDigit = 0;
        int subtractionOfPAndS;

        while (num > 0) {
            int rem = num % 10;
            productOfDigit *= rem;
            sumOfDigit += rem;
            num /= 10;
        }
        subtractionOfPAndS = productOfDigit - sumOfDigit;
        System.out.println(subtractionOfPAndS);
    }
}
