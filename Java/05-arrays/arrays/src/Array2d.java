import java.util.Arrays;
import java.util.Scanner;

public class Array2d {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int m = in.nextInt();
        System.out.print("Enter the number of columns: ");
        int n = in.nextInt();

        int[][] arr2d = new int[m][n];

        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr2d[i][j] = in.nextInt();
            }
        }
        System.out.println("Elements of the array are: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr2d[i][j] + " ");
            }
            System.out.println();
        }
    }
}
