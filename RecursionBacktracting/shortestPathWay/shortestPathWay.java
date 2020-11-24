class shortestPathWay {
    static int[][] sol = { { 0, 0, 0, 0 }, { 0, 0, 0, 0 }, { 0, 0, 0, 0 }, { 0, 0, 0, 0 } };

    static void showPath() {
        for (int i = 0; i < sol.length; i++) {
            for (int j = 0; j < sol[0].length; j++) {
                System.out.print(sol[i][j]);
            }
            System.out.println();
        }
    }

    static boolean isSafe(int[][] maze, int x, int y) {
        int row = maze.length;
        int col = maze[0].length;
        if (x >= 0 && x < row && y >= 0 && y < col && maze[x][y] == 1 && sol[x][y] == 0 ) {
            return true;
        }
        return false;
    }

    static int mazeSolver(int[][] maze, int x, int y, int a, int b) {
        if(maze[a][b] == 0){
            return 10000;
        }
        if (x == a && y == b) {
            sol[x][y] = 1;
            showPath();
            System.out.println();
            return 0;
        }
        if (isSafe(maze, x, y)) {
            sol[x][y] = 1;
            int left = mazeSolver(maze, x, y - 1, a, b) +1 ;
            int down =  mazeSolver(maze, x + 1, y, a, b)+1;
            int right =  mazeSolver(maze, x, y + 1, a, b) +1;
            int up = mazeSolver(maze, x - 1, y, a, b) + 1; 
            sol[x][y] = 0;
            return Math.min(Math.min(left, down), Math.min(right, up));
        }
        return 10000;
    }

    public static void main(String[] args) {
        int[][] maze = {    { 1, 0, 0, 0 }, 
                            { 1, 1, 0, 1 }, 
                            { 0, 1, 0, 0 }, 
                            { 1, 1, 1, 1 } };
        int min = mazeSolver(maze, 0, 0, 3, 2);
        if(min >= 10000){
            System.out.println("not possible to reach there!");
            return;
        }
        System.out.println("minimum step to point : "+min);
    }
}