import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int b = in.nextInt();
        int h = in.nextInt();
        float area = 0.5f * b * h;
        System.out.println(area);
    }
}
