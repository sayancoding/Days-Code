import java.util.*;

class Main{
  static public List<Integer> duplicatedElems(int[] nums){
    List<Integer> result = new ArrayList<>();
    Arrays.sort(nums);
    for(int i = 1; i<nums.length;i++){
      if(nums[i-1] == nums[i]){
        if(!result.contains(nums[i])){
          result.add(nums[i]);
        }
      }
    }
    return result;
  }
  public static void main(String[] args) {
    int[] nums = new int[] {5,1,5,8,1,6,8,7,1};
    System.out.println(duplicatedElems(nums));
  }
}