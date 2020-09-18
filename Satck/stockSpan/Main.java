import java.util.ArrayList;
import java.util.Stack;

class Main {
  static int[] stockSpan(int[] arr){
    int[] result = new int[arr.length];
    Stack<Integer> st = new Stack<>();
    ArrayList<Integer> stock = new ArrayList<Integer>();
    for(int el : arr){
      stock.add(el);
    }

    for(int i = 0; i< arr.length ; i++){
      if(st.isEmpty()){
        st.push(arr[i]);
        result[i] = 1;
      }
      else{
        if(st.peek()>arr[i]){
          result[i] = 1;
          st.push(arr[i]);
        }else{
          while(!st.isEmpty()){
            if(st.peek()<=arr[i]){
              st.pop();
            }
            else if(st.peek()>arr[i]){
              result[i] = stock.indexOf(arr[i]) - stock.indexOf(st.peek());
              st.push(arr[i]);
              break;
            }
          }
        }
      }
    }
    return result;
  }
  static void print(int[] arr){
    for(int el : arr){
      System.out.print(el+" ");
    }
  }
  public static void main(String[] args) {
    int[] arr = new int[] {100,80,60,70,60,75,85};
    print(stockSpan(arr));
  }
}
