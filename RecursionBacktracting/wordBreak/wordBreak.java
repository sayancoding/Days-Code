import java.util.*;

class wordBreak {
    static String resultStr = "";
    static boolean isValid(String str,ArrayList<String> dict){
        if(dict.contains(str)){
            return true;
        }
        return false;
    }
    static boolean cheacker(String str,ArrayList<String> dict,String ans){
        if(str.length() == 0){
            ans = ans.substring(0,ans.length()-1);
            resultStr = ans;
            // System.out.println(ans);
            return true;
        }
        for(int i = 0; i< str.length();i++){
            String left = str.substring(0, i+1);
            String right = str.substring(i+1);
            if(isValid(left, dict)){
                if(cheacker(right, dict, ans+left+" ")){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();

        while(testCase-- > 0){
            int n = sc.nextInt();
            ArrayList<String> dict = new ArrayList<>();
            for(int i = 0; i<n; i++){
                String tempStr = sc.next();
                dict.add(tempStr);
            }
            String str = sc.next();
            if(cheacker(str, dict,"")){
                System.out.println(resultStr);
            }else{
                System.out.println("WRONG PASSWORD");
            }
        }
    }
}
