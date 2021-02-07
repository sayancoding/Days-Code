import java.util.*;

class main{
    public static void main(String[] args) {
        int[] arr = {7,5,4,9,5,1,3}; // index-> 3
        // int[] arr = {4,2,8,6,1}; // index-> 5
        int index = -1;
        List<Integer> help = new ArrayList<>();
        int zero = 0; 
        int one = 0;
        for(int i = 0; i<arr.length; i++){
            int temp = arr[i] & 1;
            help.add(temp);
            if(temp == 1){
                one++;
            }else{
                zero++;
            }
        }
        if(zero<one){
            index = help.indexOf(0) + 1;
        }else if(one<zero){
            index = help.indexOf(1) + 1;
        }

        System.out.println(index);
    }
}