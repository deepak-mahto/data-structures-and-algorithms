import java.util.Scanner;

public class AreaOfIsoscelesTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int b = in.nextInt();
        int h = in.nextInt();
        float area = (1f * b * h )/2f;
        System.out.println(area);
    }
}
