class Q15 {

    public static void main(String[] args) {

        int[][] arr = {
            {1,-2,0},
            {4,-5,6}
        };

        int positive = 0;
        int negative = 0;
        int zero = 0;

        for(int i = 0; i < arr.length; i++) {

            for(int j = 0; j < arr[i].length; j++) {

                if(arr[i][j] > 0) {

                    positive++;
                }
                else if(arr[i][j] < 0) {

                    negative++;
                }
                else {

                    zero++;
                }
            }
        }

        System.out.println("Positive = " + positive);
        System.out.println("Negative = " + negative);
        System.out.println("Zero = " + zero);
    }
}
