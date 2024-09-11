import java.util.Scanner;

public class VolOfPyramid {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int baseLength = in.nextInt();
        int baseWidth = in.nextInt();
        int pyramidHeight = in.nextInt();
        float vol = (baseLength * baseWidth * pyramidHeight)/3f;
        System.out.println(vol);
    }
}
