import java.util.Scanner;

public class ProductDiscount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int lp = in.nextInt(), sp = in.nextInt(), discount;

        discount = lp - sp;

        System.out.println(discount);

    }
}
