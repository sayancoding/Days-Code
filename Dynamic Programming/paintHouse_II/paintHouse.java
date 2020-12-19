import java.util.*;

class paintHouse {
    static int miniCost(int[][] arr){
        int[][] dp = new int[arr.length][arr[0].length];
        int fMin = Integer.MAX_VALUE;
        int sMin = Integer.MAX_VALUE;
        for(int i = 0;i<arr[0].length; i++){
            dp[0][i] = arr[0][i];
            if(fMin>arr[0][i]){
                sMin = fMin;
                fMin = arr[0][i];
            }else if(sMin>arr[0][i]){
                sMin = arr[0][i];
            }
        }
        for(int i = 1; i<arr.length; i++){
            int currFirstMin = Integer.MAX_VALUE;
            int currSecondMin = Integer.MAX_VALUE;
            for(int j = 0;j<arr[0].length;j++){
                if(dp[i-1][j] != fMin){
                    dp[i][j] = fMin + arr[i][j];
                }else{
                    dp[i][j] = sMin + arr[i][j];
                }
                if (currFirstMin > dp[i][j]) {
                    currSecondMin = currFirstMin;
                    currFirstMin = dp[i][j];
                } else if (currSecondMin > dp[i][j]) {
                    currSecondMin = dp[i][j];
                }
            }
            fMin = currFirstMin;
            sMin = currSecondMin;
        }

        return fMin;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int house = sc.nextInt();
        int color = sc.nextInt();
        int[][] arr = new int[house][color];
        for(int i = 0; i<house; i++){
            for(int j = 0; j<color; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(miniCost(arr));
    }    
}
