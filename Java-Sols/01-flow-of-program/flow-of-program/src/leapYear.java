import java.util.Scanner;

public class leapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();
        if (year % 4 == 0) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Not a leap year.");
        }
    }
}
