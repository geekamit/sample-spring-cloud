package com.array;

import java.util.HashMap;

public class PrintFirstRepeatedCharacter {
    public static void main(String[] args) {

        int  arr[] = {1, 2, 3, 4, 5, 6, 6};
        //System.out.println(isUnique(arr));
        System.out.println(findRepeatingElement(arr,0,arr.length-1));

        String t = "ABCBC";
        HashMap<Character,Integer> need = new HashMap<>();
        for(Character ch: t.toCharArray()){
            need.put(ch, (need.get(ch) == null ? 0 : (need.get(ch)+1)) );
        }
        System.out.println(need);

    }


    static int isUnique(int []arr ){
        boolean []char_set = new boolean[256];
        for (int i=0;i<arr.length;i++){
            if(char_set[arr[i]]){
                return arr[i];
            }
            char_set[arr[i]] = true;
        }
        return -1;
    }




    static int findRepeatingElement(int arr[], int low, int high){
        if(low > high) return -1;
        if (arr.length == 1) return arr[0];

        int mid = (low+high) / 2;

        if(arr[mid] != mid + 1 ){
            if (mid>0 && arr[mid] == arr[mid-1]){
                return mid;
            }
            return findRepeatingElement(arr,low,mid-1);
        }
        return findRepeatingElement(arr, mid+1, high);
    }

    static int findRepeatingElements(int arr[], int low, int high)
    {
        if (low > high)
            return -1;

        int mid = (low + high) / 2;

        if (arr[mid] != mid + 1)
        {
            if (mid > 0 && arr[mid]==arr[mid-1])
                return mid;

            // If mid element is not at its position that means
            // the repeated element is in left
            return  findRepeatingElement(arr, low, mid-1);
        }

        // If mid is at proper position then repeated one is in
        // right.
        return findRepeatingElement(arr, mid+1, high);
    }
}
