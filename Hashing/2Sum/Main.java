import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

class Main {
  static void twoSum(int[] arr,int target){
    HashMap<Integer,Integer> map = new HashMap<>();
    HashSet<List<Integer>> set = new HashSet<>();
    for(int el : arr){
      if(!map.containsKey(el)){
        map.put(el, 1);
      }else{
        map.put(el, map.get(el)+1);
      }
    }
    for(int el : arr){
      if(map.containsKey(target - el)){
        List<Integer> list = new ArrayList<>();
        if(el< (target - el) ){
          list.add(el);
          list.add(target - el);
        }else{
          list.add(target - el);
          list.add(el);
        }
        set.add(list);
      }
    }
    System.out.println(set);
  }
  public static void main(String[] args) {
    int[] arr = new int[] { 3, 5, 2, -4, 8, 11};
    int target = 7;   
    twoSum(arr, target);
  }  
}