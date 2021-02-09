import java.util.*;
class Main {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,2,5,1,6,8,8};
        find(arr);

    }
    static void find(int[] arr){
        int el = 0;
        for(int i = 0; i <arr.length; i++){
            el = el ^ arr[i];
        }
        int rsb = el & (-el);
        
        int a = 0;
        int b = 0;

        for(int x : arr){
            if((x&rsb) == 0){
                a = a^x;
            }else{
                b = b^x;
            }
        }
        System.out.println(a+" "+b);

    }    
}
