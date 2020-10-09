class Main{
  static int partition(int[] arr,int left, int right){
    int pivot = left;
    int i = left+1;
    int j = right;
    while(i<j){
      while(arr[i]<=arr[pivot] && i<arr.length){
        i++;
      }
      while(arr[j]>=arr[pivot] && j >= 0){
        j--;
      }
      if(i<j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        i++;
        j--;
      }
    }
    
    if(arr[pivot]>arr[j]){
      int temp = arr[j];
      arr[j] = arr[pivot];
      arr[pivot] = temp;
    }
    for (int el : arr) {
      System.out.print(el + " ");
    }
    return j;
  }

  static void quickSort(int[] arr,int left,int right){
    if(left < right){
      int pivot = partition(arr, left, right);
      quickSort(arr, left, pivot-1);
      quickSort(arr, pivot+1,right);
    }
  }
  public static void main(String[] args) {
    int[] arr = {1,3,2,4};
    partition(arr, 0, arr.length-1);
    for(int el : arr){
    System.out.print(el+" ");
    }
  }
}