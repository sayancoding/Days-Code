import java.util.*;
class maxSum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int incl = arr[0];
        int excl = 0;
        for(int i = 1; i<n; i++){
            int tempIncl = excl+arr[i];
            int tempExcl = incl;
            
            incl = tempIncl;
            excl = tempExcl;
        }
        System.out.println(Math.max(incl, excl));
    }
}