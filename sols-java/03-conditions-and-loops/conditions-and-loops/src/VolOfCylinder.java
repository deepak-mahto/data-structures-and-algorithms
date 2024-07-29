import java.util.Scanner;

public class VolOfCylinder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float PI = 3.14f;
        int radius = in.nextInt();
        int height = in.nextInt();
        float vol = PI * radius * radius * height;
        System.out.println(vol);
    }
}
