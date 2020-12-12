import java.util.Scanner;

class buildingArrange {
    static long totalWay(int n){
        long building = 1;
        long space = 1;
        for(int i = 2; i<= n; i++){
            long newBuilding = space;
            long newSpace = space + building;

            building = newBuilding;
            space = newSpace;
        }
        long forOneSide = building + space;
        return (forOneSide*forOneSide);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(totalWay(n));
    }    
}
