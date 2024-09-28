import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float radius = in.nextFloat();
        float PI = 3.14f;
        float areaOfCircle = PI * radius * radius;
        System.out.println(areaOfCircle);
    }
}
