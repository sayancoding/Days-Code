import java.util.Scanner;

class staircaseTabulation{
    static int fibonacci(int n,int[] dp){
        for(int i = 1; i <= n; i++){
            if(i == 1){
                dp[i] = 1;
            }else{
                dp[i] = dp[i - 1]+ dp[i - 2];
            }
        }
        return dp[n];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fibonacci(n, new int[n+1]));
    }
}