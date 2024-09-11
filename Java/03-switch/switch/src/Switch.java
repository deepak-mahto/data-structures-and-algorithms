import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit = in.next();

        switch (fruit) {
            case "Mango" -> System.out.println("King og fruits.");
            case "Apple" -> System.out.println("A sweet and red fruit");
            case "Orange" -> System.out.println("Source of vitamin C");
            case "Grape" -> System.out.println("Small Fruit");
            default -> System.out.println("Please enter a valid fruit.");
        }
    }
}
