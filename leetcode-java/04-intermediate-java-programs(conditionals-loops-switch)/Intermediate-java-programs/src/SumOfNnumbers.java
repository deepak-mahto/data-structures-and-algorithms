import java.util.Scanner;

public class SumOfNnumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = 0;
        int count = 0;
        while (count <= n) {
            sum += count;
            count++;
        }
        System.out.println(sum);
    }
}
