import java.util.*;
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        boolean[][] dp = new boolean[str.length()][str.length()];
        int count = 0;
        for(int gap = 0; gap<str.length(); gap++){
            int start = 0; 
            int end = gap+start;
            while(end < str.length()){
                if(gap == 0){
                    dp[start][end] = true;
                }else if(gap == 1){
                    dp[start][end] = str.charAt(start) == str.charAt(end);
                }else{
                    dp[start][end] = (str.charAt(start) == str.charAt(end) && dp[start + 1][end - 1]);
                }
                if(dp[start][end]){
                    count++;
                }
                start++;
                end++;
            }
        }
        System.out.println(count);
    }
}