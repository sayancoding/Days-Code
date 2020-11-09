class Main {
    static int[][] board = new int[][] { 
        { 3, 1, 6, 5, 0, 8, 4, 0, 0 }, 
        { 5, 2, 0, 0, 0, 0, 0, 0, 0 },
        { 0, 8, 7, 0, 0, 0, 0, 3, 1 }, 
        { 0, 0, 3, 0, 1, 0, 0, 8, 0 }, 
        { 9, 0, 0, 8, 6, 3, 0, 0, 5 },
        { 0, 5, 0, 0, 9, 0, 6, 0, 0 }, 
        { 1, 3, 0, 0, 0, 0, 2, 5, 0 }, 
        { 0, 0, 0, 0, 0, 0, 0, 7, 4 },
        { 0, 0, 5, 2, 0, 6, 3, 0, 0 } };
    
    static boolean isSolved = false; 

    static void showBoard(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static boolean isPossible(int[][] arr, int i, int j, int possible) {

        for (int ci = 0; ci < 9; ci++) {
            if (arr[ci][j] == possible)
                return false;
        }
        for (int cj = 0; cj < 9; cj++) {
            if (arr[i][cj] == possible)
                return false;
        }

        int ni = (i / 3) * 3;
        int nj = (j / 3) * 3;

        for (int m = 0; m < 3; m++) {
            for (int n = 0; n < 3; n++) {
                if (arr[ni + m][nj + n] == possible)
                    return false;
            }
        }

        return true;
    }

    static void sudukoSolver(int[][] arr, int i, int j) {
        if (i == 9) {
            isSolved = true;
            showBoard(board);
            return;
        }
        int ni = 0;
        int nj = 0;
        if (j == board[0].length - 1) {
            ni = i + 1;
            nj = 0;
        } else {
            ni = i;
            nj = j + 1;
        }

        if (board[i][j] != 0) {
            sudukoSolver(board, ni, nj);
        } else {
            for (int possible = 1; possible <= 9; possible++) {
                if (isPossible(board, i, j, possible) == true) {
                    board[i][j] = possible;
                    sudukoSolver(board, ni, nj);
                    board[i][j] = 0; // backtracking
                }
            }
        }
    }

    public static void main(String[] args) {
        sudukoSolver(board, 0, 0);
        if(!isSolved) System.out.println("Solution not possible.");
    }
}