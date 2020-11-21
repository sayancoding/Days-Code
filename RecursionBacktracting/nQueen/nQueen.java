class nQueen {
    static void show(int[][] board, int n){
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    static int solutionCount = 0;
    static boolean isSafe(int[][] board,int row,int col){
        for(int i = col; i>=0 ;i--){
            if(board[row][i] == 1)
                return false;
        }
        for(int i = row,j = col; i>=0 && j>=0;i--,j--){
            if(board[i][j] == 1)
                return false;
        }
        for(int i = row,j = col; i<board.length && j>=0;i++,j--){
            if(board[i][j] == 1)
                return false;
        }

        return true;
    }
    static boolean nQueenSolver(int[][] board, int col){
        
        if(col>= board.length){
            // solutionCount++;
            show(board, board.length);
            // System.out.println();
            return true;
        }

        for(int i = 0; i<board.length; i++){
            if(isSafe(board,i,col)){
                board[i][col] = 1;
                if(nQueenSolver(board, col + 1)){
                    return true;
                }
                board[i][col] = 0;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] board = {
            {0,0,0,0,0},
            {0,0,0,0,0},
            {0,0,0,0,0},
            {0,0,0,0,0},
            {0,0,0,0,0},
        };
        nQueenSolver(board, 0);
    }    
}
