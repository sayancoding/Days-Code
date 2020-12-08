class minCostPath {
    static int miniPath(int[][] matrix){
        int r = matrix.length;
        int c = matrix[0].length;
        int[][] dp = new int[r][c];
        for(int i = r - 1; i>=0; i--){
            for(int j = c -1 ; j>=0; j--){
                if(i == r - 1 && j == c -1){
                    dp[i][j] = matrix[i][j];
                }else if(i == r -1 ){
                    dp[i][j] = matrix[i][j] + dp[i][j+1];
                }else if(j == c - 1 ){
                    dp[i][j] = matrix[i][j] + dp[i+1][j];
                }else{
                    dp[i][j] = Math.min((matrix[i][j] + dp[i][j+1]), (matrix[i][j] + dp[i+1][j]));
                }
            }
        }
        return dp[0][0];
    }
    public static void main(String[] args) {
        int[][] matrix = {
            {2,8,4,1,6,4,2},
            {6,0,9,5,3,8,5},
            {1,4,3,4,0,6,5},
            {6,4,7,2,4,6,1},
            {1,0,3,7,1,2,7},
            {1,5,3,2,3,0,9},
            {2,2,5,1,9,8,2}
        };
        System.out.println(miniPath(matrix)); //here, 36 minCost for that example
    }    
}
