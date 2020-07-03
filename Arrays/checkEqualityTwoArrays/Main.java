import java.util.Arrays;

class Main {
  static boolean isEqual(int[] arr1,int[] arr2){
    if(arr1.length != arr2.length)
      return false;
    Arrays.sort(arr1);
    Arrays.sort(arr2);
    return Arrays.equals(arr1, arr2);
  }
  public static void main(String[] args) {
    int[] arr1 = new int[] {1,3,2};
    int[] arr2 = new int[] {1,2,3};
    System.out.println(isEqual(arr1, arr2));
  }  
}