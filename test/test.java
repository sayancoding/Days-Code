class Test{
  static int numberChair(String str){
    int count = 0;
    int empty = 0;
    char[] ch = str.toCharArray();
    for(char el : ch){
      if(el == 'C'){
        if(empty > 0){
          empty--;
        }
      }
    }
  }
  public static void main(String[] args) {
    String str = "CCRUCL";
  }
}