import java.util.Arrays;

public class Swaping {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 6, 7, 8, 9};
        swap(arr, 2, 6);
        System.out.println(Arrays.toString(arr));
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) { //applying two pointer method
            //swap
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    static void swap(int[] arr, int index2, int index6) {
        int temp = arr[index2];
        arr[index2] = arr[index6];
        arr[index6] = temp;
    }
}
