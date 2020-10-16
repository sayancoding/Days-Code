import java.util.ArrayList;

class Main {
    static void negativeShift(int[] arr){
        ArrayList<Integer> negative = new ArrayList<>();
        ArrayList<Integer> positive = new ArrayList<>();
        for(int el : arr){
            if(el<0)
                negative.add(el);
            else
                positive.add(el);
        }
        negative.addAll(positive);
        System.out.println(negative);
    }
    public static void main(String[] args) {
        int[] arr = {-12, 11, -13, -5, 6, -7, 5, -3, -6};
        negativeShift(arr);
    }    
}
