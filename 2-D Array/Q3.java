class Q3{
    public static void main(String[] args) {
        //Sum of all element
        int[][] arr ={
            {1,2,3},
            {4,5,6}
        };
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                sum = sum + arr[i][j];
            }
        }
        System.out.println("Sum = " + sum);
    }
}
