class coinChange {
    static int totalPermutation(int[] coins,int target){
        int[] dp = new int[target+1];
        dp[0] = 1;
        for(int i = 1; i< dp.length; i++){
            for(int k = 0; k<coins.length && coins[k] <= i;k++){
                dp[i] = dp[i] + dp[ i - coins[k]];
            }
        }
        return dp[target];
    }
    public static void main(String[] args) {
        int[] coins = {2,3,5};
        int target = 7;
        System.out.println(totalPermutation(coins, target));
    }    
}
