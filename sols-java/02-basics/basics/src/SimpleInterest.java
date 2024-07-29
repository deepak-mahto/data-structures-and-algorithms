//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

import java.sql.SQLOutput;
import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Principal amount: ");
        int p = in.nextInt();
        System.out.print("Enter Rate of Interest: ");
        int r = in.nextInt();
        System.out.print("Enter Time: ");
        int t = in.nextInt();
        float si = p*r*t/100;
        System.out.println("si will be: " + si);
    }
}
