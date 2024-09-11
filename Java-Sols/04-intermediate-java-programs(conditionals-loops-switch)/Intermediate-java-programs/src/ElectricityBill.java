import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int units = in.nextInt();
        int totalElectricityBill = 0;
        if (units <= 100) {
            totalElectricityBill = units * 10;
        } else if (units <= 200) {
            totalElectricityBill = (units * 10) + (units - 100) * 15;
        } else if (units <= 300) {
            totalElectricityBill = (units * 10) + (units * 15) + (units - 200) * 20;
        } else {
            totalElectricityBill = (units * 10) + (units * 15) + (units * 20) + (units - 300) * 25;
        }
        System.out.println(totalElectricityBill);
    }
}
