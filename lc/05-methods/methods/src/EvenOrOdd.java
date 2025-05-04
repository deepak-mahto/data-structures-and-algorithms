import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = in.nextInt();
        String result = evenOrOdd(num);
        System.out.println("Result: "+ result);
    }
    static String evenOrOdd(int n) {
        String result = "";
        if (n % 2 == 0) {
            result += "even";
        } else {
            result += "odd";
        }
        return result;
    }
}
