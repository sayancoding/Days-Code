import java.util.ArrayList;

class tugOfWar {
    static int minDiff  = Integer.MAX_VALUE;
    static String set = ""; 
    static void divideSubArray(int[] arr,int k, ArrayList<Integer> set1, ArrayList<Integer> set2, int firstSum,int secondSum){
        
        if(k == arr.length){
            if(Math.abs(firstSum - secondSum) < minDiff){
                minDiff = Math.abs(firstSum - secondSum);
                set = set1+" "+set2;
            }
            return;
        }
        
        if(set1.size() < (arr.length+1)/2){
            set1.add(arr[k]);
            divideSubArray(arr, k+1, set1, set2, firstSum+arr[k], secondSum);
            set1.remove(set1.size() - 1);
        }
        if(set2.size() < (arr.length+1)/2){
            set2.add(arr[k]);
            divideSubArray(arr, k+1, set1, set2, firstSum, secondSum+arr[k]);
            set2.remove(set2.size() - 1);
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        divideSubArray(arr, 0, new ArrayList<>(), new ArrayList<>(), 0, 0);
        System.out.println(set +" and diff : "+minDiff);
    }    
}
