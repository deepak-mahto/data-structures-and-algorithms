//Input currency in rupees and output in USD.

import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float indianRupee = in.nextFloat();
        double exchangeRate = 83.72;
        double USD = indianRupee/exchangeRate;
        System.out.println(USD);
    }
}
