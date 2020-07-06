import java.util.Arrays;
import java.util.HashMap;

class Main {
  static void fourSum(int[] nums, int target) {
    HashMap<Integer, int[]> map = new HashMap<>();
    //two sum and store to hash
    for (int i = 0; i < nums.length; i++) {
      for (int j = i + 1; j < nums.length; j++) {
        int sum = nums[i] + nums[j];
        int[] pair = new int[2];
        pair[0] = i;
        pair[1] = j;
        map.put(sum, pair);
      }
    }
    // check the inverse of that two sum from hash
    for (int i = 0; i < nums.length; i++) {
      for (int j = i + 1; j < nums.length; j++) {
        int x = target - (nums[i] + nums[j]);
        if (map.containsKey(x)) {
          if (i != map.get(x)[0] && i != map.get(x)[1] && j != map.get(x)[0] && j != map.get(x)[1])
            System.out.println(nums[i] + " " + nums[j] + " " +nums[map.get(x)[0]] + " " + nums[map.get(x)[1]]);
            return;
        }
      }
    }

  }
  public static void main(String[] args) {
    int[] nums = new int[] { 10, 2, 3, 4, 5, 9, 7, 8 };
    int target = 23;
    fourSum(nums, target);
  }
}