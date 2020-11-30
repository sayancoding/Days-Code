import java.util.Scanner;

class miniSteps{
    static int findMiniSteps(int[] arr){
        int[] dp = new int[arr.length+1];
        dp[arr.length] = 0;
        for(int i = arr.length - 1; i >= 0; i--){
            int min = 10000;
            for(int j = 1; j <= arr[i] && i+j < dp.length; j++){
                min = (dp[i+j] < min) ? dp[i+j] : min;
            }
            dp[i] = min+1;
        }
        return dp[0];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(findMiniSteps(arr));
    }
}