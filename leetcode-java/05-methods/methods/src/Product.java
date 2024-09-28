import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter num1: ");
        int num1 = in.nextInt();
        System.out.print("Enter num2: ");
        int num2 = in.nextInt();
        int result = prod(num1, num2);
        System.out.print("Result: " + result);
    }
    static int prod(int n1, int n2) {
        return n1 * n2;
    }
}


