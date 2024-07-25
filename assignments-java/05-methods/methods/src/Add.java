import javax.xml.transform.Result;
import java.util.Scanner;

public class Add {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter num1: ");
        int num1 = in.nextInt();
        System.out.print("Enter num2: ");
        int num2 = in.nextInt();
        int result = sum(num1, num2);
        System.out.print("Result: " + result);
    }
    static int sum(int n1, int n2) {
        return n1 + n2;
    }
}
