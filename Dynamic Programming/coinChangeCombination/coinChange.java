class coinChange {
    static int totalCombination(int[] coins, int target) {
        int[] dp = new int[target + 1];
        dp[0] = 1;

        for (int i = 0; i < coins.length; i++) {
            for (int j = coins[i]; j <= target; j++) {
                int diff = j - coins[i];
                dp[j] = dp[j] + dp[diff];
            }
        }
        return dp[target];
    }

    public static void main(String[] args) {
        int[] coins = { 2, 3, 5, 6 };
        int target = 10;
        System.out.println(totalCombination(coins, target));
    }
}
