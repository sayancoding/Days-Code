import java.util.*;
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        while(n>0){
            count = count + (n&1);
            n = n>>1;
        }
        System.out.println(count);
    }
    // Kernighan's method
    static int countBit(int n){
        int count = 0;
        while(n>0){
            count++;
            int rsbm = n & -n;
            n = n - rsbm;
        }
        return count;
    }
}