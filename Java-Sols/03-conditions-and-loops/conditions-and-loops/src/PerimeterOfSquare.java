import java.util.Scanner;

public class PerimeterOfSquare {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int side = in.nextInt();
        int perimeter = 4 * side;
        System.out.println(perimeter);
    }
}
