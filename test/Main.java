import java.util.*;

class Main{

  static int countDuplicate(List<Integer> numbers){
    List<Integer> result = new ArrayList<>();
    HashMap<Integer,Integer> map = new HashMap<>();
    for(int el : numbers){
      if(map.containsKey(el)){
        map.put(el, map.get(el)+1);
      }else{
        map.put(el, 1);
      }
    }
    map.forEach((k,v)->{
      if(v>1){
        result.add(k);
      }
    });
    return result.size();
  }
  public static void main(String[] args) {
    int[] arr = new int[] {1,3,3,4,4,4};
    List<Integer> list = new ArrayList<>();
    for(int el : arr){
      list.add(el);
    }
    countDuplicate(list);
  }
}