import java.util.Scanner;

public class HCFandLCM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int hcf = 0;
        for (int i = 1; i <= a || i <= b; i++) {
            if (a%i == 0 && b%i == 0) {
                hcf = i;
            }
        }
        int lcm = a * b / hcf;
        System.out.println("hcf: " + hcf);
        System.out.println("lcm: " + lcm);
    }
}
