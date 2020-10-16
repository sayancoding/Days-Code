import java.util.ArrayList;
import java.util.HashMap;

class Main {
    public static void main(String[] args) {
        int[] arr = {1,0,1,2,1,1,0,1,2};
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int el : arr){
            if(map.containsKey(el)){
                map.put(el, map.get(el)+1);
            }else{
                map.put(el, 1);
            }
        }
        map.forEach((k,v)->{
            for(int i = 0;i<v;i++){
                list.add(k);
            }
        });
        System.out.println(list);
    }
}
