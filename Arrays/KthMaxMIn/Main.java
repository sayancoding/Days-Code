import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        int[] arr = {45,44,11,12,14,1,8};
        Arrays.sort(arr);
        int kth = 3;
        
        System.out.println("MAX Element : " + arr[arr.length - kth]);
        System.out.println("MIN Element : " + arr[kth-1]);
    }    
}
