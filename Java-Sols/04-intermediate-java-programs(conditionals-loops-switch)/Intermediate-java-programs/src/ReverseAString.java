import java.util.Scanner;

public class ReverseAString {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        String str = in.next();
        String rev = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            rev = ch+rev;
        }
        System.out.println(rev);
    }
}
