class targetSum {
    static boolean isPossible(int[] arr, int target){
        boolean[][] dp = new boolean[arr.length+1][target+1];
        for(int i = 0; i<dp.length; i++){
            if(i == 0){
                dp[0][0] = true;
            }else{
                int startPoint = arr[i-1];
                for(int k = 0; k<startPoint; k++){
                    dp[i][k] = dp[i-1][k];
                }
                for(int k = startPoint; k<dp[0].length; k++){
                    int diff = k - arr[i-1];
                    if(dp[i-1][diff]){
                        dp[i][k] = true;
                    }else{
                        dp[i][k] = dp[i-1][k];
                    }
                }
            }
        }
        return dp[arr.length][target];
    }
    public static void main(String[] args) {
        int[] arr = {4,2,7,1,3};
        int target = 11;
        System.out.println(isPossible(arr, target));
    }    
}
