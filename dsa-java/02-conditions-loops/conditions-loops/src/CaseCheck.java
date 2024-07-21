import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        // check weather the character is uppercase or lowercase

        Scanner in = new Scanner(System.in);
        char ch = in.next().trim().charAt(0);
        if (ch >= 'a' && ch <= 'z') {
            System.out.println("Lowercase");
        } else {
            System.out.println("Uppercase");
        }
    }
}
