import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // array of primitives
//        int[] arr = new int[5];

        // taking inputs to fill in the array

//        arr[0] = 1;
//        arr[1] = 4;
//        arr[2] = 8;
        // [1, 4, 8]
//        System.out.println(arr[2]);
//        System.out.println(arr[4]); // error: index out of bound



        // input using for loop to fill in the array
//
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = in.nextInt();
//        }
//        System.out.println(arr[4]); // printing single element from the array

        // printing the whole array

//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println(); // for new line
//
//        System.out.println(Arrays.toString(arr)); // converts the arrays to string and print

        // for each loop

//        for (int num: arr) { // for every element in the array, print the element
//            System.out.println(num + " "); // here num represent element of the array
//        }

        // array of objects
        String[] str = new String[5];
        for (int i = 0; i < str.length; i++) {
             str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));

        str[1] = "deepak";

        System.out.println(Arrays.toString(str));
    }
}
