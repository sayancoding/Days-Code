import java.util.Arrays;

class Main {
  static int kthLarge(int[] nums,int th){
    if(th >= nums.length){
      return -1;
    }
    Arrays.sort(nums);
    return nums[nums.length - th];
  }
  public static void main(String[] args) {
    int[] nums = new int[] { 1,8,6,9};
    System.out.println(kthLarge(nums, 2));
  }  
}