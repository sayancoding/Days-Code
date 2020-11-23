import java.util.ArrayList;
import java.util.Stack;

class subSetSum {
    static boolean makeList(int[] arr,int k,int curr,int target,ArrayList<Integer> list){
        if(curr == target){
            System.out.println(list);
            return true;
        }
        if(k == arr.length){
            return false;
        }
        if(curr < target){
            list.add(arr[k]);
            if(makeList(arr, k+1, curr+arr[k], target, list)){
                return true;
            }
            list.remove(list.size()-1);
            return makeList(arr, k+1, curr, target, list);
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {1,5,11,5};
        int totalSum = 0;
        for(int el : arr){
            totalSum += el;
        }
        if((totalSum & 1) == 1){
            System.out.println("not possible..");
            return ;
        }
        
        if(!makeList(arr, 0, 0, totalSum/2, new ArrayList<>())){
            System.out.println("not possible..");
        }
        
    }    
}
