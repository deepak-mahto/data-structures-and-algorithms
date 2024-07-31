import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();

        boolean result = isPalindrome(num);
        if (result) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not palindrome");
        }
    }
    static boolean isPalindrome(int n) {
        int rev = 0, temp = n;

        while (temp != 0) {
            rev = (rev * 10) + (temp % 10);
            temp /= 10;
        }
        return (rev == n);
    }
}
