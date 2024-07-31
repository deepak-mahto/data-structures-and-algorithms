import java.util.Scanner;

public class CommissionPercentage {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double amount = in.nextDouble();
        double commissionPercentage = in.nextDouble();
        double commissionDiscount = (commissionPercentage/100) * amount;
        System.out.println(commissionDiscount);
    }
}
