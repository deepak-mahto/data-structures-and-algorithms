import java.util.Scanner;

public class VolOfPrism {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int baseArea = in.nextInt();
        int heightOfPrism = in.nextInt();
        int vol = baseArea  * heightOfPrism;
        System.out.println(vol);
    }
}
