import java.util.*;

class Main{
  static int maxAreaMatrix(int[][] matrix){
    int max = 0;
    int[] temp = new int[matrix[0].length];
    int[] maxAreaHistogram = new int[matrix.length];

    for(int i = 0; i<matrix.length;i++){
      for(int j = 0; j<matrix[0].length;j++){
        if(matrix[i][j] == 0){
          temp[j] = 0;
        }else{
          temp[j] = temp[j]+matrix[i][j];
        } 
      }
      maxAreaHistogram[i] = maxAreaHistogram(temp);  
    }
    max = Arrays.stream(maxAreaHistogram).max().getAsInt();
    return max;
  }

  static int maxAreaHistogram(int[] arr) {
    int maxArea = -1;
    int[] NSL = new int[arr.length];
    int[] NSR = new int[arr.length];
    int[] width = new int[arr.length];
    int[] area = new int[arr.length];
    NSL = NSL(arr);
    NSR = NSR(arr);
    for (int i = 0; i < arr.length; i++) {
      width[i] = NSR[i] - NSL[i] - 1;
      area[i] = width[i] * arr[i];
      if (area[i] == 0) {
        area[i] = 1;
      }
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
    // print(result);
    return result;
  }

  public static int[] NSR(int[] arr) {
    ArrayList<Integer> list = new ArrayList<>();
    for (int el : arr) {
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
    // print(result);
    return result;
  }

  static void print(int[] arr){
    for(int el : arr){
      System.out.print(el+" ");
    }
    System.out.println();
  }
  public static void main(String[] args) {
    int[][] matrix = new int[][]{
      {0,1,1,0},
      {1,1,1,1},
      {1,1,1,1},
      {1,1,0,0}
    };
    System.out.println(maxAreaMatrix(matrix)); 
  }
}