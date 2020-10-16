class Main{
    static void rotatedOne(int[] arr){
        int temp = arr[arr.length-1];
        
        for(int i = arr.length -2; i>=0; i--){
            arr[i+1] = arr[i];
        }
        arr[0] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {9,8, 7, 6, 4, 2, 1, 3};
        rotatedOne(arr);

        for (int el : arr) {
            System.out.print(el + " ");
        }
    }
}