class knightTour {
    static void knightTourSolver(int[][] chess,int r,int c,int move){
        if(r < 0 || c < 0 || r >= chess.length || c >= chess.length || chess[r][c] > 0){
            return;
        }
        if(move == (chess.length * chess.length)){
            chess[r][c] = move;
            showChess(chess);
            return;
        }
        chess[r][c] = move;
        knightTourSolver(chess, r-2, c+1, move+1);
        knightTourSolver(chess, r-1, c+2, move+1);
        knightTourSolver(chess, r+1, c+2, move+1);
        knightTourSolver(chess, r+2, c+1, move+1);
        knightTourSolver(chess, r+2, c-1, move+1);
        knightTourSolver(chess, r+1, c-2, move+1);
        knightTourSolver(chess, r-1, c-2, move+1);
        knightTourSolver(chess, r-2, c-1, move+1);
        chess[r][c] = 0;
    }
    static void showChess(int[][] chess){
        for(int i = 0; i<chess.length; i++){
            for(int j = 0; j <chess.length ;j++){
                System.out.print(chess[i][j]+"  ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] chess = {
            {0,0,0,0,0},
            {0,0,0,0,0},
            {0,0,0,0,0},
            {0,0,0,0,0},
            {0,0,0,0,0}
        };
        int startR = 2;
        int startC = 2;
        knightTourSolver(chess,startR,startC,1);
    }    
}
