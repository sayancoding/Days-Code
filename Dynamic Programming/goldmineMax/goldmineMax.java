class goldmineMax{
    static int maxGold(int[][] mine){
        int row= mine.length;
        int col = mine[0].length;
        int[][] dp = new int[row][col];

        for(int j =col-1 ; j>=0; j--){
            for(int i = 0; i< row; i++){
                if(j == col-1){
                    dp[i][j] = mine[i][j];
                }else if(i == 0 ){
                    dp[i][j] = mine[i][j] + Math.max(dp[i][j+1], dp[i+1][j+1]);
                }else if(i == row-1){
                    dp[i][j] = mine[i][j] + Math.max(dp[i][j+1], dp[i-1][j+1]);
                }else{
                    dp[i][j] = mine[i][j] + Math.max(dp[i][j+1], Math.max(dp[i-1][j+1], dp[i+1][j+1]));
                }
            }
        }
        
        int max = dp[0][0];
        for(int i = 0; i <row; i++){
            if(dp[i][0] > max){
                max = dp[i][0];
            }
        }

        return max;
        
    }
    public static void main(String[] args) {
        int[][] mine = {
            {0,1,4,2},
            {4,3,6,5},
            {1,2,4,1},
            {2,0,7,3}
        };
        System.out.println(maxGold(mine));
    }
}