import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

class combinationalSum {
    static HashSet<ArrayList<Integer>> set = new HashSet<>();

    static boolean makePossibleList(int[] arr,int target,int sum,int k,ArrayList<Integer> list){
        if( k >= arr.length) return false;
        if(sum == target && checkSum(list, target)){
            // Arrays.sort(list.toArray());
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

    static boolean checkSum(ArrayList<Integer> list,int target){
        int sum = 0;
        for(int el : list){
            sum = sum+el;
        }
        return (sum == target);
    }
    //optional - for reduce elements
    static Integer[] elementReducer(int[] arr,int target){
        HashSet<Integer> uniq = new HashSet<>();
        for (int el : arr) {
            if (el <= target && !uniq.contains(el)) {
                uniq.add(el);
            }
        }
        Integer[] reduceArr = new Integer[uniq.size()];
        reduceArr  = uniq.toArray(reduceArr);

        return reduceArr;
    }
    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 8};
        int target = 8;

        //reduce large and duplicate elements for optimize check
        int[] reduceArr = new int[elementReducer(arr,target).length];
        for(int i = 0; i< elementReducer(arr, target).length; i++){
            reduceArr[i] = elementReducer(arr, target)[i].intValue();
        }

        makePossibleList(reduceArr, target, 0, 0, new ArrayList<>());
        if(set.size() <= 1){
            System.out.println("combination not possible!");
        }
    }    
}
