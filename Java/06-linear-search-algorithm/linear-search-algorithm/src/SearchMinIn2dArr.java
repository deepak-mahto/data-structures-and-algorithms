public class SearchMinIn2dArr {
    public static void main(String[] args) {
        int[][] arr = {
                {23, 34, 56, 67, 6},
                {-23, -45, 7, 8},
                {67, 8, 6, 3, 6},
                {-634, 2, 4, 5, 777}
        };

        int ans = min(arr);
        System.out.println(ans);
    }
    static int min(int[][] arr) {
        if (arr.length == 0) {
            return -1;
        }
        int min = Integer.MAX_VALUE;
        for (int[] ints : arr) {
            for (int element : ints) {
                if ( element < min) {
                    min = element;
                }
            }
        }
        return min;
    }
}
