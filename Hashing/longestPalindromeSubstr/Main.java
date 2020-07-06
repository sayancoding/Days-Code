class Main{
  
  static int longestPalindromeSubStr(String str){
    if(str.length() == 2)
    return evenPalindromeChecker(str);
    return Math.max(evenPalindromeChecker(str), oddPalindromeChecker(str));
  }

  static int oddPalindromeChecker(String str){
    int max = 0;
    for (int i = 2; i < str.length() - 1; i++) {
      int left = i - 1;
      int right = i + 1;

      while (left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)) {
        int currLen = right - left + 1;
        max = Math.max(currLen, max);
        left--;
        right++;
      }
    }
    return max;
  }
  static int evenPalindromeChecker(String str){
    int max = 0;
    for (int i = 1; i < str.length(); i++) {
      int left = i;
      int right = left + 1;

      while (left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)) {
        int currLen = right - left + 1;
        max = Math.max(currLen, max);
        left--;
        right++;
      }
    }
    return max;
  }
  public static void main(String[] args) {
    String str = "abbaabca8acb";
    System.out.println(longestPalindromeSubStr(str)); 
  }
}