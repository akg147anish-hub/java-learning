class Q13 {
    public static void main(String[] args) {

        int[][] arr = {
            {1,0,0},
            {0,1,0},
            {0,0,1}
        };

        boolean identity = true;

        for(int i = 0; i < arr.length; i++) {

            for(int j = 0; j < arr[i].length; j++) {

                if(i == j && arr[i][j] != 1) {

                    identity = false;
                }

                if(i != j && arr[i][j] != 0) {

                    identity = false;
                }
            }
        }

        if(identity) {

            System.out.println("Identity Matrix");
        }
        else {

            System.out.println("Not Identity Matrix");
        }
    }
}
