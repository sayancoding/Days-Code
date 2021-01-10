import java.util.*;
class longSubseq{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(longSubsequence(arr));
    }
    static int longSubsequence(int[] arr){
        int max = Integer.MIN_VALUE;
        int[] dp = new int[arr.length];
        for(int i = 0; i<arr.length; i++){
            int temp_max = 1;
            for(int j = i-1; j>=0; j--){
                if(arr[j] < arr[i]){
                    temp_max = Math.max(dp[j]+1, temp_max);
                }
            }
            dp[i] = temp_max;
            max = Math.max(dp[i], max);
        }
        return max;
    }
}