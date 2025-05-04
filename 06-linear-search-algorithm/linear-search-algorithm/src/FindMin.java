public class FindMin {
    public static void main(String[] args) {
        int[] arr = {12 , 3, 45, 56, -2, 45, -4};
        System.out.println(min(arr));
    }
    static int min(int[] arr) {
        if (arr.length == 0 ) {
            return -1;
        }
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}
