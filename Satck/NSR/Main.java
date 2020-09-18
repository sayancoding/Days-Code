import java.util.*;

class Main {
  public static int[] NSR(int[] arr) {
    int[] result = new int[arr.length];
    Stack<Integer> st = new Stack<>();
    for (int i = arr.length - 1; i >= 0; i--) {
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
            result[i] = st.peek();
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
  }

  public static void main(String[] args) {
    int[] arr = new int[] { 4,5,2,10,8};
    print(NSR(arr));
  }
}