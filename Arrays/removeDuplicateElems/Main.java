import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Main {
  static List<Integer> removeDuplicate(int[] nums){
    List<Integer>result  = new ArrayList<>();
    HashMap<Integer,Integer> map = new HashMap<>();
    for(int el : nums)
    {
      if(!map.containsKey(el))
        map.put(el, 1);
      else
        map.put(el,map.get(el)+1);
    }
    for(int el : nums){
      if(map.get(el)==1){
        result.add(el);
      }
    }
    return result;
  }
  public static void main(String[] args) {
    int[] nums = new int[] {1,9,5,2,1,9};
    System.out.println(removeDuplicate(nums));
  }  
}