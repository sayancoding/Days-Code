import java.util.Scanner;

class climbing{
    static int solveClimbing(int[] arr){
        int[] dp = new int[arr.length + 1];
        dp[arr.length] = 1;
        for(int i = arr.length-1 ; i>=0 ; i--){
            for(int j = 1; j <= arr[i] && j+i < dp.length ; j++ ){
                dp[i] += dp[i+j];
            }
        }
        return dp[0];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n ;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(solveClimbing(arr)); 
    }
}