import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter radius of a circle: ");
        int radius = in.nextInt();

        float result1 = circumferenceOfCircle(radius);
        System.out.println("Circumference of circle: " + result1);
        float result2 = areaOfCircle(radius);
        System.out.print("Area of circle: " + result2);
    }
    static float circumferenceOfCircle(int r) {
        float PI = 3.14f;
        return 2 * PI * r;
    }
    static float areaOfCircle(int r) {
        float PI = 3.14f;
        return PI * r * r;
    }
}
