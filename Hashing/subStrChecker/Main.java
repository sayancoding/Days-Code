class Main {
  static boolean subStringChecker(String str,String subStr){
    int p = 0;
    int q = 0;
    while(p<str.length()){
      if(q == subStr.length()-1){
        return true;
      }
      if(str.charAt(p)==subStr.charAt(q)){
        q++;
      }else{
        q = 0;
      }
      p++;
    }
    return false;
  }
  public static void main(String[] args) {
    String str = "asvsasbvc";
    String subStr = "sas";
    System.out.println(subStringChecker(str, subStr));
  }  
}