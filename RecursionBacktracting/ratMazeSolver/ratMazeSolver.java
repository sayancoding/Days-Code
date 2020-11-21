class ratMazeSolver {
    static int[][] sol = {
        {0,0,0,0},
        {0,0,0,0},
        {0,0,0,0},
        {0,0,0,0}
    };
    static void showPath(){
        for(int i = 0; i<sol.length; i++){
            for(int j = 0; j<sol[0].length; j++){
                System.out.print(sol[i][j]);
            }
            System.out.println();
        }
    }
    static boolean isSafe(int[][] maze,int x,int y){
        int row = maze.length;
        int col = maze[0].length;
        if(x >=0 && x < row && y >= 0 && y < col && maze[x][y] == 1 ){
            return true;
        }
        return false;
    }

    static boolean mazeSolver(int[][] maze,int x,int y,int a,int b){
        if(x == a && y == b){
            sol[x][y] = 1;
            showPath();
            System.out.println();
            return true;
        }
        if(isSafe(maze,x,y)){
            sol[x][y] = 1;
            if(mazeSolver(maze, x, y+1, a, b)){
                return true;
            }
            if(mazeSolver(maze, x+1, y, a, b)){
                return true;
            }
            if(mazeSolver(maze, x-1, y, a, b)){
                return true;
            }
            mazeSolver(maze, x, y-1, a, b);
            sol[x][y] = 0;
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] maze = { 
            { 1, 0, 0, 0 }, 
            { 1, 1, 0, 1 }, 
            { 0, 1, 0, 0 }, 
            { 1, 1, 1, 1 } 
        };
        mazeSolver(maze, 0, 0, 3, 3);       
    }    
}
