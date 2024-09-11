import java.util.Scanner;

public class PerimeterOfEquilateralTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int side = in.nextInt();
        int perimeter = 3 * side;
        System.out.println(perimeter);
    }
}
