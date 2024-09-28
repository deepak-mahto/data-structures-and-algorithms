public class MaxItem {
    public static void main(String[] args) {
        int[] arr = {12, 34, 5, 6, 3, 45, 44, 7, 88};
        System.out.println(max(arr));
        System.out.println(maxRange(arr, 2, 6));
    }
    static int max(int[] arr) {
        if (arr.length == 0) {
            return -1;
        }

        int maxVal = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }

    static int maxRange(int[] arr, int start, int end) {

        if (end > start) {
            return -1;
        }

        if (arr == null) {
            return -1;
        }

        int maxValue = arr[start];
        for (int i = start; i <= end ; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }
        }
        return maxValue;
    }
}
