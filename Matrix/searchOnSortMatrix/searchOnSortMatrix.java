class searchOnSortMatrix{
    static public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0)
            return false;
        int row = matrix.length;
        int col = matrix[0].length;

        int left = 0;
        int right = row * col - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            int mid_elem = matrix[mid / col][mid % col]; // 2D masking into 1D
            if (mid_elem == target)
                return true;
            else if (mid_elem > target) {
                right = mid - 1;
            } else if (mid_elem < target) {
                left = mid + 1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] matrix = {
            {1,3,5,7},
            {10,11,16,20},
            {23,30,34,50}
        };
        int target = 16;
        System.out.println(searchMatrix(matrix,target));
    }
}