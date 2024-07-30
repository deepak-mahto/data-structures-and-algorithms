import java.util.Arrays;

public class PassingInFunctions {
    public static void main(String[] args) {
        int[] numbs = {1, 4, 5, 6, 7};
        System.out.println(Arrays.toString(numbs));
        change(numbs);
        System.out.println(Arrays.toString(numbs));
    }
    static void change(int[] arr) {
        arr[0] = 90;
    }
}

