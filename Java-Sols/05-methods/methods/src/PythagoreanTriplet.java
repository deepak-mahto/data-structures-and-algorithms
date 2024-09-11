public class PythagoreanTriplet {
    public static void main(String[] args) {
        int[] arr = {4, 5, 3, 6, 8};
        int arr_size = arr.length;

        if (isTriplet(arr, arr_size)) {
            System.out.println("Pythagorean Triplet");
        } else {
            System.out.println("Not Pythagorean Triplet");
        }
    }
    static boolean isTriplet(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {

                    int x = arr[i] * arr[i], y = arr[j] * arr[j], z = arr[k] * arr[k];

                    if (x == y + z || y == x + z || z == x + y) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
