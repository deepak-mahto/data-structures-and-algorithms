public class MaxOptimized {
    public static void main(String[] args) {
        int[][] arr = {
                {23, 34, 56, 67, 6},
                {-23, -45, 7, 8},
                {67, 8, 6, 3, 6},
                {634, 2, 4, 5, 777}
        };

        int ans = max(arr);
        System.out.println(ans);
    }
    static int max(int[][] arr) {
        if (arr.length == 0) {
            return -1;
        }
        int max = Integer.MIN_VALUE;
            for (int[] ints : arr) {
                for (int element : ints) {
                    if ( element > max) {
                        max = element;
                    }
                }
            }
        return max;
    }
}
