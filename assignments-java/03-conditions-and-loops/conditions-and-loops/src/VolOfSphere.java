import java.util.Scanner;

public class VolOfSphere {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float PI = 3.14f;
        int radius = in.nextInt();
        float vol = 4/3f * PI * radius * radius * radius;
        System.out.println(vol);
    }
}
