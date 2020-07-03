import java.util.ArrayList;
import java.util.List;

class Main {
  static List<Integer> separate(int[] nums){
    int count = 0;
    List<Integer> list = new ArrayList<>();
    for(int el : nums){
      if(el != 0){
        list.add(el);
      }else{
        count++;
      }
    }
    while(count !=0 ){
      list.add(0);
      count--;
    }
    return list;
  }
  public static void main(String[] args) {
    int[] nums = new int[] { 1,0,2,0,3};
    System.out.println(separate(nums));
  }  
}