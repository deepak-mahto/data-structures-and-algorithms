public class MaXWealth {
    public static void main(String[] args) {
        int[][] accounts = {
                {1, 2, 3},
                {2, 4, 5},
                {1, 4, 2}
        };
        int maximumWealth = maxWealth(accounts);
        System.out.println(maximumWealth);
    }
    static int maxWealth(int[][] accounts) {
        int max = 0;
        for (int person = 0; person < accounts.length; person++) {
            int accountSum = 0;
            for (int account = 0; account < accounts[person].length; account++) {
                accountSum += accounts[person][account];
            }
            if (accountSum > max) {
                max = accountSum;
            }
        }
        return max;
    }
}
