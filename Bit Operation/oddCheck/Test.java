import java.util.*;
class Test{
    public static void main(String[] args) {
        String str = "alphaadida";
        char[] arr = str.toCharArray();
        int count = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        for(char el:arr){
            if(map.containsKey(el)){
                map.put(el, map.get(el)+1);
            }else{
                map.put(el, 1);
            }
        }
        for(char el:map.keySet()){
            if(map.get(el) == 1){
                count++;
            }
        }
        System.out.println(count);
    }
}