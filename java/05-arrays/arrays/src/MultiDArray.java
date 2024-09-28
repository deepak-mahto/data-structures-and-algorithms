import java.util.Arrays;
import java.util.Scanner;

public class MultiDArray {
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of elements you want to store: ");
        n = in.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter the elements of of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println("Elements of the array are: ");

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
