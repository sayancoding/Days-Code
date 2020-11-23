import java.util.ArrayList;

class palindromicPartition {
    static boolean isPalindrom(String str){
        char[] ch = str.toCharArray();
        int l = 0;
        int r = ch.length - 1;
        while(l<r){
            if(ch[l] == ch[r]){
                l++;
                r--;
            }else{
                return false;
            }
        }
        return true;
    }
    static boolean makePartition(String str,ArrayList<String> list){
        if(str.length() == 0){
            System.out.println(list);
            return true;
        }
        for(int i = 0;i<str.length(); i++){
            String left = str.substring(0, i+1);
            String right = str.substring(i+1);

            if(isPalindrom(left)){
                list.add(left);
                makePartition(right, list);
                list.remove(list.size()-1);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String str = "geeks";
        makePartition(str, new ArrayList<>());
    }    
}
