import java.util.HashSet;

class Main {
  static int lenOfNonRepeating(String str){
    int q = 0;
    int p = 0;
    int max = 0 ;
    HashSet<Character> set = new HashSet<>();
    while(q != str.length()){
      if(!set.contains(str.charAt(q))){
        set.add(str.charAt(q));
        max = Math.max(set.size(), max);
        q++;
      }else{
        set.remove(str.charAt(p));
        p++;
      }
    }
    return max;
  }
  public static void main(String[] args) {
    String str = "abcbdabxyzb";
    System.out.println(lenOfNonRepeating(str));
  }  
}