import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

class Main {
  static List<Integer> intersection(int[] arr1,int[] arr2){
    List<Integer> result = new ArrayList<>();
    HashSet<Integer> set = new HashSet<>();
    for(int el : arr1)
      set.add(el);
    for(int el : arr2){
      if(set.contains(el) && !result.contains(el))
        result.add(el);
    }
    return result;
  }
  static List<Integer> union(int[] arr1,int[] arr2){
    List<Integer> result = new ArrayList<>();
    // HashSet<Integer> set = new HashSet<>();
    for(int el : arr1){
      if(!result.contains(el))
        result.add(el);
    }
    for(int el : arr2){
      if(!result.contains(el))
        result.add(el);
    }
    return result;
  }

  public static void main(String[] args) {
    int[] arr1 = new int[] { 2,8,6,9};
    int[] arr2 = new int[] { 9,10,9,1,8};
    System.out.println(intersection(arr1, arr2));
    System.out.println(union(arr1, arr2));
  }  
}