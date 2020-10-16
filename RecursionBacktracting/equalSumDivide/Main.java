import java.util.ArrayList;

class Main {
    static void equalDivid(int[] arr, int target, int sum,int i,ArrayList<Integer> result){
        if(i>=arr.length) return;
        for(int k = i;k<arr.length;k++){
            sum += arr[k];
            result.add(arr[k]);
            System.out.println(result+" "+sum);
            equalDivid(arr, target, sum, k+1, result);
            System.out.println(result.size()-1);
            result.remove(result.size()-1);
            sum = sum-arr[i];
        }
    }
    public static void main(String[] args) {
        int[] arr = {2,1,2,5};
        int sum = 4;
        ArrayList<Integer> result = new ArrayList<>();
        equalDivid(arr, sum, 0, 0, result);
    }    
}
