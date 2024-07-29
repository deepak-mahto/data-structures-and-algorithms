import java.lang.invoke.StringConcatFactory;
import java.util.Scanner;

//To find out whether the given String is Palindrome or not.
public class PalindromeOrNot {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.nextLine();
        String reversedString = "";
        for (int i = s1.length() - 1; i >= 0; i--) {
            reversedString = reversedString + s1.charAt(i);
        }
        if (s1.toLowerCase().equals(reversedString.toLowerCase())) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
