import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nSum = 0, eSum = 0, oSum = 0;
        while (true) {
            int n = in.nextInt();
            if (n == 0) {
                break;
            }
            if (n < 0) {
                nSum += n;
            }
            if (n % 2 == 0) {
                eSum += n;
            } else {
                oSum += n;
            }
        }
        System.out.println(nSum);
        System.out.println(eSum);
        System.out.println(oSum);
    }
}
