public class MultidimensionalArray {
    public static void main(String[] args) {
        int[][] arr2D = {
                {1, 2, 3},
                {4, 5},
                {7, 8, 9}
        };
        for (int row = 0; row < arr2D.length; row++) {
            for (int col = 0; col < arr2D[row].length; col++) {
                System.out.print(arr2D[row][col] + " ");
            }
            System.out.println();
//            System.out.println(Arrays.toString(arr2D[row]));
        }
    }
}
