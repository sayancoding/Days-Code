class Main {
    static String digitSum(String str,int k ){
        char[] ch = str.toCharArray();
        int sum = 0;
        for (char el : ch) {
            sum += Integer.parseInt(String.valueOf(el));
        }
        return digitSum(String.valueOf(sum*k));
    }
    static String digitSum(String str){
        if (str.length() == 1) {
            System.out.println(str);
            return str;
        }

        char[] ch = str.toCharArray();
        int sum = 0;
        for (char el : ch) {
            sum += Integer.parseInt(String.valueOf(el));
        }
        String newStr = String.valueOf(sum);
        return digitSum(newStr);
    }
    public static void main(String[] args) {
        String str = "861568688536788";
        digitSum(str, 100000);
    }    
}
