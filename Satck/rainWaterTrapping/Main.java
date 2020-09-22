import java.util.Arrays;

class Main{
  static int maxWater(int[] building){
    int max = 0;
    int[] maxRight =  maxLeft(building);
    int[] maxLeft = maxRight(building);
    int[] area = new int[building.length];
    for(int i = 0 ;i<building.length; i++){
      area[i] = Math.min(maxLeft[i], maxRight[i]) - building[i];
    }
    return Arrays.stream(area).sum();
  }
  static int[] maxLeft(int[] building){
    int[] maxLeft = new int[building.length];
    maxLeft[0] = building[0];
    for(int i = 1;i<building.length;i++){
      maxLeft[i] = Math.max(maxLeft[i-1], building[i]);
    }
    // print(maxLeft);
    return maxLeft;
  }
  static int[] maxRight(int[] building){
    int[] maxRight = new int[building.length];
    maxRight[building.length-1] = building[building.length - 1];
    for(int i = building.length-2;i>=0;i--){
      maxRight[i] = Math.max(maxRight[i+1], building[i]);
    }
    // print(maxRight);
    return maxRight;
  }

  static void print(int[] arr){
    for(int el : arr){
      System.out.println(el+" ");
    }
    System.out.println();
  }
  public static void main(String[] args) {
    // int[] building = new int[] {3,0,0,2,0,4};
    int[] building = new int[] {0,1,0,2,1,0,1,3,2,1,2,1};
    System.out.println(maxWater(building));
  }
}