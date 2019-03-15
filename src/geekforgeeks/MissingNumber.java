package geekforgeeks;

public class MissingNumber {
    public static int missingNumber(int arr[]){
        int missingNumber = Integer.MIN_VALUE;
        int x1 = arr[0];
        int x2 = 1;
        for (int i=1; i<arr.length;i++ ){
            x1 = x1^arr[i];
        }
        for (int i=2;i<= arr.length+1;i++){
            x2 = x2^i;
        }
        return x1^x2;
    }

    public static void main(String[] args) {
        int a[] = {4,2,5,3,6};
        int miss = missingNumber(a);
        System.out.println("Missing Number is "+miss);
    }
}
