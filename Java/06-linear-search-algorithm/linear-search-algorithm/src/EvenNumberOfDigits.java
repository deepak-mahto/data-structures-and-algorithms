public class EvenNumberOfDigits {
    public static void main(String[] args) {
//        1295.Find Numbers with Even Number of Digits
        int[] nums = {12, 34, 4563, 13, 45, 234, 7, 7, 8, 90, -232434};
        int evenDigits = findNumbers(nums);
        System.out.println(evenDigits);
    }
    static int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }

    static boolean even(int num) {
        return digit(num) % 2 == 0;
    }

    static int digit(int num) {
        if (num < 0) {
            num = num * -1;
        }
        if (num == 0) {
            return 1;
        }
        int count = 0;
        while (num > 0) {
            count++;
            num /= 10;
        }
        return count;
    }
}
