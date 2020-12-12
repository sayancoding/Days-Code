class knapsack {
    static int maxProfit(int[] weight,int[] value,int totalWeight){
        int[] dp = new int[totalWeight+1];
        for(int i = 1; i <dp.length; i++){
            int max = -1;
            for(int j = 0; j<weight.length; j++){
                if(weight[j] <= i){
                    int currTotal = value[j];
                    if(i - weight[j] >= 0){
                        currTotal += dp[i - weight[j]];
                    }
                    max = max< currTotal ? currTotal : max;
                }
            }
            dp[i] = max;
        }
        return dp[totalWeight];
    }
    public static void main(String[] args) {
        int[] weight = {2,5,1,3,4};
        int[] value = {15,14,10,45,30};
        int totalWeight = 7;
        System.out.println(maxProfit(weight, value, totalWeight));
    }    
}
