class Main {
  static int[] reverse(int[] arr){
    int i = 0 , j = arr.length - 1;
    while(i<=j){
      swap(arr, i, j);
      i++;
      j--;
    }
    return arr;
  }
  static void swap(int[] arr,int i,int j){
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }
  public static void main(String[] args) {
    int[] nums = new int[] {4,5,8,1,0,9};
    int[] rev = new int[nums.length];
    rev = reverse(nums);
    for(int el : rev){
      System.out.print(el+" ");
    }
  }  
}