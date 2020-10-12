class Main{
    
    static String swap(String str,int i,int j){
        char[] ch = str.toCharArray();
        
        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;
        return String.valueOf(ch);
        
    }
    static void permutate(String str,int l,int r){
        if(l == r){
            System.out.print(str+ " ");
            return;
        }
        for(int i = l;i<=r;i++){
            str = swap(str,l, i);
            permutate(str, l+1, r);
            str = swap(str,l, i);
        }
    }
    public static void main(String[] args) {
        String str = "ABC";
        permutate(str,0,str.length()-1);
    }
}