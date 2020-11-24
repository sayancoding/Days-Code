import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

class combinationalSum {
    static HashSet<ArrayList<Integer>> set = new HashSet<>();

    static boolean makePossibleList(int[] arr,int target,int sum,int k,ArrayList<Integer> list){
        if( k >= arr.length) return false;
        if(sum == target){
            Collections.sort(list);
            if(!set.contains(list)){
                System.out.println(list);
                set.add(list);
            }
            return true;
        }
        if(sum < target){
            for(int i = 0;i<arr.length;i++){
                list.add(arr[i]);
                makePossibleList(arr, target, sum+arr[i], i , list);
                list.remove(list.size() - 1);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {1, 6, 5, 7, 8, 2, 9};
        int target = 0;
        makePossibleList(arr, target, 0, 0, new ArrayList<>());
        if(set.size() <= 1){
            System.out.println("combination not possible!");
        }
    }    
}
