import java.util.Scanner;

public class CurvedSurfaceAreaOfCylinder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float PI = 3.14f;
        int height = in.nextInt();
        int radius = in.nextInt();
        float curvedSurfaceArea = 2 * PI * radius * height;
        System.out.println(curvedSurfaceArea);
    }
}
