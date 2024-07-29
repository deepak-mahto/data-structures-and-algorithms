import java.util.Scanner;

public class AreaOfRhombus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int d1 = in.nextInt();
        int d2 = in.nextInt();
        float area = 0.5f * d1 * d2;
        System.out.println(area);
    }
}
