import java.util.Scanner;

public class VolumeOfCone {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float PI = 3.14f;
        int radius = in.nextInt();
        int height = in.nextInt();
        float vol = (PI * radius * radius) * height/3;
        System.out.println(vol);
    }
}
