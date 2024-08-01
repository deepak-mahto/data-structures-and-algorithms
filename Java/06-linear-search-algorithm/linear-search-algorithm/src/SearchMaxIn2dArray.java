import java.util.Arrays;

public class SearchMaxIn2dArray {
    public static void main(String[] args) {
        int[][] arr = {
                {23, 34, 56, 67, 6},
                {-23, -45, 7, 8},
                {67, 8, 6, 3, 6},
                {634, 2, 4, 5}
        };

        int ans = max(arr);
        System.out.println(ans);
    }
    static int max(int[][] arr) {
        if (arr.length == 0) {
            return -1;
        }
        int max = Integer.MIN_VALUE;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] > max) {
                    max = arr[row][col];
                }
            }
        }
        return max;
    }
}

