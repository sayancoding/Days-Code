class knapSack {
    static int maxValue(int[] weight,int[] value, int totalWeight){
        int[][] dp = new int[weight.length+1][totalWeight+1];
        for(int i = 1; i <dp.length; i++){
            for(int j = 0; j< weight[i-1]; j++){
                dp[i][j] = dp[i-1][j];
            }
            for(int j = weight[i-1]; j<dp[0].length ;j++){
                int currTotal = value[i-1] + dp[i-1][j-weight[i-1]];
                dp[i][j] = (currTotal > dp[i-1][j]) ? currTotal : dp[i-1][j];
            }
        }
        return dp[weight.length][totalWeight];
    }
    public static void main(String[] args) {
        int[] weight = {2,5,1,3,4};
        int[] value = {15,14,10,45,30};
        int totalWeight = 7;
        System.out.println(maxValue(weight, value, totalWeight));
    }    
}
