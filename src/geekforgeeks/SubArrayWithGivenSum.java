package geekforgeeks;

public class SubArrayWithGivenSum {

    public static void subArrayWithGivenSum(int arr[], int sum){

        int n = arr.length;
        for (int i=0;i<n;i++){
            int currSum = arr[i];
            for (int j=i+1;j< n;j++) {
                if (currSum == sum) {
                    System.out.println("Current sum is found between "+i +" and "+(j-1));
                    break;
                }
                if (currSum > sum || j == n)
                    break;

                    currSum = currSum + arr[j];
                }
            }



        }
    public static void main(String[] args) {
        int arr[] = {15, 2, 4, 8, 9, 5, 10, 23};
        int sum = 26;
        subArrayWithGivenSum(arr, sum);
    }
}


