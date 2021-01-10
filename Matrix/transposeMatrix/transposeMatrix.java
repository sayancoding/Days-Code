class transposeMatrix{
    public static void main(String[] args) {
        int[][] matrix = {
            {1,2,3},
            {4,5,6},
            {7,8,9},
            {8,5,7},
        };
        transposePrint(matrix);
    }
    static void transposePrint(int[][] matrix){
        int row = matrix.length;
        int col = matrix[0].length;

        for(int i = 0 ; i < col; i++){
            for(int j = 0; j <row; j++){
                System.out.print(matrix[j][i]+" ");
            }
            System.out.println();
        }
    }
}