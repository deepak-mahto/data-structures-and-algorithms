import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensionalArr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[3][3];
//        System.out.println(arr.length); // length of the array equals number of rows

        // input
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        //output
//        for (int i = 0; i < arr.length; i++) {  // 1-approach
////            for (int j = 0; j < arr[i].length; j++) {
////                System.out.print(arr[i][j] + " ");
////            }
////            System.out.println();
//            System.out.println(Arrays.toString(arr[i])); // 2-approach
//        }

        // output

        //enhanced for loop  // 3-approach
        for (int[] a: arr) {
            System.out.println(Arrays.toString(a));
        }
    }
}
