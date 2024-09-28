// Take name as input and print a greeting message for that particular name.

import java.util.Scanner;

public class GreetM {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = in.next();
        System.out.println("Hey! my name is " + name);
    }
}
