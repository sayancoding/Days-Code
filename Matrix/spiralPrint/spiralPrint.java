class spiralPrint{
    static void spiralShow(int[][] matrix){
        int rowStart = 0;
        int rowEnd = matrix.length - 1;
        int colStart = 0;
        int colEnd = matrix[0].length - 1;

        while(rowStart <= rowEnd && colStart <= colEnd){
            for(int i = colStart; i <= colEnd ; i++){
                System.out.print(matrix[rowStart][i]+" ");
            }
            rowStart++;

            for(int i = rowStart; i <= rowEnd; i++){
                System.out.print(matrix[i][colEnd]+" ");
            }
            colEnd--;

            if(rowStart <= rowEnd){
                for (int i = colEnd; i >= colStart; i--) {
                    System.out.print(matrix[rowEnd][i] + " ");
                }
                rowEnd--; 
            }
            if(colStart <= colEnd){
                for (int i = rowEnd; i >= rowStart; i--) {
                    System.out.print(matrix[i][colStart] + " ");
                }
                colStart++; 
            }
        }
    }
    public static void main(String[] args) {
        int[][] matrix = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16},
            {17,18,19,20},
        };
        spiralShow(matrix);
    }
}