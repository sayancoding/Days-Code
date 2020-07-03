class Main {
  static void twoSum(int[] nums){
    for(int i=0;i<nums.length;i++){
      for(int j = 0;j<nums.length;j++){
        if(nums[i]+nums[j] == 0){
          System.out.println("["+nums[i]+','+nums[j]+"]");
        }
      }
    }
  }
  public static void main(String[] args) {
    int[] nums = new int[] { 7,-1,1,2,-2,8};
    twoSum(nums);
  }  
}