class Q11{
    public static void main(String[] args) {

        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int even = 0;
        int odd = 0;

        for(int i = 0; i < arr.length; i++) {

            for(int j = 0; j < arr[i].length; j++) {

                if(arr[i][j] % 2 == 0) {

                    even++;
                }
                else {

                    odd++;
                }
            }
        }

        System.out.println("Even = " + even);
        System.out.println("Odd = " + odd);
    }
}
