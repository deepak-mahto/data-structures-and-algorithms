public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {12, 3, 56, 78, 33, 3, 6, 7, 8, 9};
        int target = 12;
        int ans = search(arr, target, 2, 7);
        System.out.println(ans);
    }
    static int search(int[] arr, int target, int start, int end) {
        if (arr.length == 0) {
            return -1;
        }
        for (int i = start; i <= end ; i++) {
            int element = arr[i];
            if (element == target) {
                return i;
            }
        }
        return -1;
    }
}
