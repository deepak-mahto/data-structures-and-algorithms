import java.util.Scanner;

public class PerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int w = in.nextInt();
        int l = in.nextInt();
        int perimeter = 2 * (w + l);
        System.out.println(perimeter);
    }
}
