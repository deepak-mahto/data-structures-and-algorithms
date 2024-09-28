import java.util.Scanner;

public class TotalSurfaceAreaOfCube {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int totalSurfaceAreaOfCube = 6 * a * a;
        System.out.println(totalSurfaceAreaOfCube);
    }
}
