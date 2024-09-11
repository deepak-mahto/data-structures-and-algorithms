import java.util.Scanner;

public class Numbers3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int largest = 0;
        while (num != 0) {
            if (num > largest) {
                largest = num;
            }
            num = in.nextInt();
        }
        System.out.println(largest);
    }
}
