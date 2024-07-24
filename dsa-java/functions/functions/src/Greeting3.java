import java.util.Scanner;

public class Greeting3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Name: ");
        String name = in.next();
        String greeting = greet(name);
        System.out.println(greeting);
    }

    static String greet(String name) {
        return "Hello" + " " + name;
    }
}
