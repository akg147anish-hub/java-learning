class Main {
    public static void main(String[] args) {

        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int target = 5;

        boolean found = false;

        for(int i = 0; i < arr.length; i++) {

            for(int j = 0; j < arr[i].length; j++) {

                if(arr[i][j] == target) {

                    found = true;
                }
            }
        }

        if(found) {
            System.out.println("Element Found");
        }
        else {
            System.out.println("Not Found");
        }
    }
}
