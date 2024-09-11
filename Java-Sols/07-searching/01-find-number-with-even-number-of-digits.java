class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int num: nums) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }
    boolean even(int num) {
        return digit(num) % 2 == 0;
    }
    int digit(int num) {
        return (int)(Math.log10(num)) + 1;
    }
}