public class Array {
    public static void main(String[] arg) {

        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        replacement(arr);

        int[] arrEmpty = new int[8];
        setArray(arrEmpty);

        int[] arrMulti = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        multiplication(arrMulti);

        int[] arrMinMax = {1, 2, 3, 14, 5, 6, 7};
        int maxValue = searchMinMax(arrMinMax, false);
        int minValue = searchMinMax(arrMinMax, true);


        int[][] arrDiagonal = new int[10][10];
        diagonalSet(arrDiagonal);

        int[] arrBalance = {1,1,1,1};
        System.out.println(checkBalance(arrBalance));

        int[] arrPull = {1,2,3,4,5,6,7,8,9,10};
        pull(arrPull, 7);
        for (int i = 0; i < arrPull.length; i++) {
            System.out.println(arrPull[i]);
        }

    }

    private static void replacement(int[] arr){
         for(int i=0; i<arr.length;i++){
            arr[i] =(arr[i]==1)?0:1;
        }
    }

    private static void setArray(int[] arr){
        for(int i=0, y =1; i<arr.length; i++, y +=3){
            arr[i] = y;
        }
    }

    private static void multiplication(int[] arr){
        for(int i=0; i<arr.length; i++){
            if (arr[i]<6)
                    arr[i] *= 2;
        }

    }

    private static int searchMinMax(int[] arr, boolean flag){
        int value=arr[0];
        for(int i = 0; i<arr.length; i++){
            if(flag) {
                //maximum
                if (arr[i] > value)
                    value = arr[i];
            }
            else{
                //minimum
                if(arr[i] < value)
                    value=arr[i];
            }
        }
        return value;
    }

    private static void diagonalSet(int arr[][]){
        for (int i = 0; i < arr.length ; i++) {
            arr[i][i] = 1;
        }
    }

    private static boolean checkBalance(int arr[]){
        boolean result = false;
        for (int i = 0; i < arr.length ; i++) {
            int left  = 0;
            int right = 0;

            for (int j = 0; j < i; j++) {
                left = left + arr[j];
            }

            for (int q = i; q < arr.length ; q++) {
                right = right + arr[q];
            }

            if (left == right){
                result = true;
                break;
            }
        }
        return result;
    }

    private static void pull(int arr[], int n){

        if(n<0){
            for (int i = 0; i < Math.abs(n); i++) {
                int newValue = arr[arr.length-1];
                for (int j = arr.length - 1; j > 0; j--) {
                    arr[j] = arr[j-1];
                }
                arr[0] = newValue;
            }
        }
        else{
            for (int i = 0; i < n; i++) {
            int newValue = arr[0];
                for (int j = 0; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                arr[arr.length - 1] = newValue;
            }
        }
    }

}
