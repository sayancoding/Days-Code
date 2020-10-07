class Main{
  public static boolean KPM(String str,String ptr){
    boolean isMatch = false;
    int[] pieTable = pieTable(ptr);
    for (int i : pieTable) {
      System.out.print(i+" ");
    }
    return isMatch;
  }
  public static int[] pieTable(String ptr){
    int[] pieTable = new int[ptr.length()];
    int p = 0;
    int q = 1;
    while(q<ptr.length()){
      if(ptr.charAt(p) == ptr.charAt(q)){
        pieTable[q] = pieTable[q-1]+1;
        p++;
        q++;
      }else{
        if(p == 0){
          pieTable[q] = 0;
          q++;
        }
        else if(p!=0){
          p--;
        }
      }
    }
    for(int i : pieTable){
      
    }
    return pieTable;
  }
  public static void main(String[] args) {
    String str = "ababcabcabababd";
    // String ptr = "ababd";
    String ptr = "abcdcabfabc";
    KPM(str, ptr);
  }
}