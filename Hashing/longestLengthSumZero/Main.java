import java.util.HashMap;

class Main{
  static void longestSumZero(int[] nums){
    HashMap<Integer,Integer> map = new HashMap<>();
    int sum = 0;
    int maxLen = -1;
    for(int i = 0 ; i<nums.length ; i++){
      sum = sum + nums[i];
      if(!map.containsKey(sum)){
        map.put(sum, i);
      }else{
        int len = -1;
        if(map.get(sum) == 0){
          len = i - map.get(sum);
        }else{
          len = i - map.get(sum) + 2;
        }
        maxLen = (maxLen<len) ? len : maxLen;
      }
    }
    System.out.println(maxLen);
  }
  public static void main(String[] args) {
    // int[] nums = new int[] { 15,-2,2,-8,1,7,10,23};
    int[] nums = new int[] { 1, 2 ,-2,4,-4};
    longestSumZero(nums);
  }
}