import java.util.HashSet;
import java.util.Set;

class Main {
    static void unionIntersection(int[] a, int[] b){
        Set<Integer> union = new HashSet<>();
        Set<Integer> intersection = new HashSet<>();
        for(int el : a){
            if(union.contains(el)){
                intersection.add(el);
            }
            union.add(el);
        }
        for(int el : b){
            if(union.contains(el)){
                intersection.add(el);
            }
            union.add(el);
        }
        System.out.println(union);
        System.out.println(intersection);
    }
    public static void main(String[] args) {
        int[] a = {1, 3, 4, 5, 7};
        int[] b = {2, 3, 5, 6};
        unionIntersection(a,b);
    }    
}
