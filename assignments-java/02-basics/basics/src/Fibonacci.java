import java.util.Scanner;

//To calculate Fibonacci Series up to n numbers.
public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = 0;
        int n2 = 1;
        int n3;
        int count = in.nextInt();
        System.out.print(n1+" "+n2);
        for (int i = 2; i < count; i++) {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;

        }
    }
}
