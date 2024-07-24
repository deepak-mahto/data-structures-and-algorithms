import java.util.Scanner;

public class Sum2 {
    public static void main(String[] args) {
        int sum = sum2();
        System.out.println(sum);
    }
    static  int sum2() {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        return num1 + num2;
    }
}
