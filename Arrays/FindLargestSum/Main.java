class Main {
    static void findlargestSum(int[] arr) {
        int max = 0;
        int maxSofar = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            max = max + arr[i];
            if (max < arr[i]) {
                max = arr[i];
            }
            if (maxSofar < max) {
                maxSofar = max;
            }
        }
        System.out.println(maxSofar);
    }

    public static void main(String[] args) {
        // int[] arr = { -2,-3,4,-1,-2,1,5,-3 };
        int[] arr = { 1, 2, 3, -2, 5};
        findlargestSum(arr);
    }
}