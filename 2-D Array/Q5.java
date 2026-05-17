class Q5 {
    public static void main(String[] args) {

        int[][] arr = {
            {8, 2, 7},
            {4, 5, 6}
        };

        int min = arr[0][0];

        for(int i = 0; i < arr.length; i++) {

            for(int j = 0; j < arr[i].length; j++) {

                if(arr[i][j] < min) {

                    min = arr[i][j];
                }
            }
        }

        System.out.println("Smallest = " + min);
    }
}
