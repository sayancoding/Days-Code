import java.util.*;

class Main {
  static int maxAreaHistogram(int[] arr){
    int maxArea = -1;
    int[] NSL = new int[arr.length];
    int[] NSR = new int[arr.length];
    int[] width = new int[arr.length];
    int[] area = new int[arr.length];
    NSL = NSL(arr);
    NSR = NSR(arr);
    for(int i = 0 ; i<arr.length;i++){
      width[i] = NSR[i] - NSL[i] - 1;
      area[i] = width[i]*arr[i];
    }
    maxArea = Arrays.stream(area).max().getAsInt();
    return maxArea;
  }
  
  public static int[] NSL(int[] arr) {
    ArrayList<Integer> list = new ArrayList<>();
    for (int el : arr) {
      list.add(el);
    }
    int[] result = new int[arr.length];
    Stack<Integer> st = new Stack<>();
    for (int i = 0; i < arr.length; i++) {
      if (st.isEmpty()) {
        result[i] = -1;
        st.add(arr[i]);
      } else {
        while (!st.isEmpty()) {
          if (st.peek() >= arr[i] && st.size() > 1) {
            st.pop();
          } else if (st.peek() >= arr[i] && st.size() == 1) {
            st.pop();
            result[i] = -1;
            st.add(arr[i]);
            break;
          } else if (st.peek() < arr[i]) {
            result[i] = list.indexOf(st.peek());
            st.add(arr[i]);
            break;
          }
        }
      }
    }
    return result;
  }
  
  public static int[] NSR(int[] arr) {
    ArrayList<Integer> list = new ArrayList<>();
    for(int el : arr){
      list.add(el);
    }
    int[] result = new int[arr.length];
    Stack<Integer> st = new Stack<>();
    for (int i = arr.length - 1; i >= 0; i--) {
      if (st.isEmpty()) {
        result[i] = arr.length;
        st.add(arr[i]);
      } else {
        while (!st.isEmpty()) {
          if (st.peek() >= arr[i] && st.size() > 1) {
            st.pop();
          } else if (st.peek() >= arr[i] && st.size() == 1) {
            st.pop();
            result[i] = arr.length;
            st.add(arr[i]);
            break;
          } else if (st.peek() < arr[i]) {
            result[i] = list.indexOf(st.peek());
            st.add(arr[i]);
            break;
          }
        }
      }
    }
    return result;
  }


  static void print(int[] arr) {
    for (int el : arr) {
      System.out.print(el + " ");
    }
    System.out.println();
  }
  public static void main(String[] args) {
   int[] arr = new int[] {6,2,5,4,5,1,6};
    System.out.println(maxAreaHistogram(arr));
  }
}
