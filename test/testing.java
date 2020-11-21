import java.util.*;

class Testing{
    public static void main(String[] args) {
        // float arr[] = new float[] {40.00f,20.00f};
        System.out.println(convert(12, 718));
    }

    // static float cummlative(float[] arr){
    //     float finalValue = 100.00f;
    //     for(float el : arr){
    //         finalValue = finalValue * (100 - el ) / 100;
    //     }
    //     finalValue = 100 - finalValue;
    //     return finalValue;
    // }
    static String convert(int n, int num){
        Stack<Integer> st = new Stack<Integer>();
        String result = "";
        while(num != 0){
            int rem = num % n;
            num = num/n;
            st.push(rem);
        }
        while(!st.isEmpty()){
            int temp = st.pop();
            if(temp<10){
                result = result+String.valueOf(temp);
            }else{
                result = result + String.valueOf((char)(temp+55));
            }
        }
        return result;
    }
}