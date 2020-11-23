import java.util.HashSet;
import java.util.Stack;

class removeInvalidParentheses{
    static int getMin(String str){
        Stack<Character> st = new Stack<>();
        for(char ch : str.toCharArray()){
            if(ch == '('){
                st.push(ch);
            }else if(ch == ')'){
                if(st.size() == 0){
                    st.push(ch);
                }else if(st.peek() == '('){
                    st.pop();
                }else if(st.peek() == ')'){
                    st.push(ch);
                }
            }
        }
        return st.size();
    }
    static void removeParenth(String str,int min,HashSet<String> set){
        if(getMin(str) == 0 && min == 0){
            if(!set.contains(str))
            System.out.println(str);
            set.add(str);
            return;
        }
        for(int i = 0;i<str.length();i++){
            String left = str.substring(0, i);
            String right = str.substring(i+1);
            removeParenth(left+right, min-1, set);
        }
    }
    public static void main(String[] args) {
        String str = "(a)())()";
        // String str = "()())()";
        int min = getMin(str);
        removeParenth(str, min, new HashSet<>());
    }
}