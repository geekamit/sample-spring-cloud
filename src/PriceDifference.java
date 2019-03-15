public class PriceDifference {

    public static int priceDifference(int[] arr) {

        int n = arr.length;
        int min = 0;
        int max = 0;

        // Only one element
        if (n == 1) {
            min = arr[0];
            max = arr[0];
        }
        // Two or more elements in the array
        else {
            if (arr[0] < arr[1]) {
                min = arr[0];
                max = arr[1];
            } else {
                min = arr[1];
                max = arr[0];
            }


            for (int i = 2; i < n; i++) {
                if (arr[i] < min) {
                    min = arr[i];
                } 
                else if (arr[i] > max) {
                    max = arr[i];
                }
            }
        }
        return max - min;
    }

    public static void main(String[] args) {

        // Input array
        int[] arr = new int[] { 40, 20, 40, 50, 30 };

        // Find min and max values from the given array
        System.out.println("Price Difference = "+priceDifference(arr));

    }
}
