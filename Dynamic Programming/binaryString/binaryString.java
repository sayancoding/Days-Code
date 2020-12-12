import java.util.Scanner;

class binaryString{
    static int calculate(int n){
        int oldZero = 1;
        int oldOne = 1;

        for(int i = 2; i<=n;i++){
            int newZero = oldOne;
            int newOne = oldZero + oldOne;
            
            oldZero = newZero;
            oldOne = newOne;
        }

        return (oldOne+oldZero);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(calculate(n));
    }
}