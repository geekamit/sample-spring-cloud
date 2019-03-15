package geekforgeeks;

import java.util.HashMap;

public class SubArrayWithGivenSumEfficient {

    public static void main(String[] args) {
        int arr[] = {2,3,5,7,11, 13,17,19};
        int sum = 11;
        subArrayWithGivenSumEfficient(arr,sum);
    }

    public static void subArrayWithGivenSumEfficient(int arr[], int sum){
        int currSum = 0;
        int start = 0; int end = -1;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<arr.length; i++){
            currSum += arr[i];
            if(currSum - sum == 0){
                start = 0 ;
                end = i; break;
            }

            if (map.containsKey(currSum - sum)){
                start = map.get(currSum-sum) +1;
                end = i;
                break;
            }
            map.put(currSum, i);
            System.out.println(map.size());
        }

        if (end == -1){
            System.out.println("No array is found ");
        }else {
            System.out.println("SubArray is found between "+start +" and "+end);
        }


    }
}
