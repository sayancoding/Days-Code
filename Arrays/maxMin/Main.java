import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        int[] arr = {12,81,10,74};
        System.out.println(Arrays.stream(arr).max().getAsInt());
        System.out.println(Arrays.stream(arr).min().getAsInt());
    }    
}
