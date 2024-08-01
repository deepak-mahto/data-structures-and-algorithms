import java.util.Scanner;

public class PerimeterOfCirlce {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int radius = in.nextInt();
        float perimeter = 2f * 3.14f * radius;
        System.out.println(perimeter);
    }
}
