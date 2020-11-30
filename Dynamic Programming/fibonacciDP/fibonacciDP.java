import java.util.Scanner;

class fibonacciDP{
    static int fibo(int n,int[] memo){
        if(n == 0 || n == 1 ){
            return n;
        }
        if(memo[n] != 0){
            return memo[n];
        }
        int fibonacci1 = fibo(n-1,memo);
        int fibonacci2 = fibo(n-2,memo);
        int cp = fibonacci1 + fibonacci2;
        memo[n] = cp; // memoization DP
        return cp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fibo(n,new int[n+1]));
    }
}