import java.util.Scanner;

public class SumOfInputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int sum = 0;
        char let = 'x';
        while (num != let) {
            sum += num;
            num++;
        }
        System.out.println(sum);
    }
}
