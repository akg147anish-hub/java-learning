class Q9{
    public static void main(String[] args) {

        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6}
        };

        for(int j = 0; j < arr[0].length; j++) {

            for(int i = 0; i < arr.length; i++) {

                System.out.print(arr[i][j] + " ");
            }

            System.out.println();
        }
    }
}
