package com.array;

import java.math.BigDecimal;
import java.math.BigInteger;

class Solution {

    public static void main(String[] args) {
        getIntegerFromArray(new int[]{ 9,9,9,9,9,9,9,9,9,9,9,3,9});
    }
    
    public static void getIntegerFromArray(int[] digits){
        BigInteger val = BigInteger.ZERO;
        int j = 0;
        
        for(int i=digits.length-1; i>=0; i--){
            BigInteger bigValue = BigDecimal.valueOf( Math.pow(10,i) * digits[j++]).toBigInteger();
            val = val.add(bigValue);
        }
        BigInteger one = new BigInteger("1");
        val = val.add(one);

        String str =val + "";
        int result[] = new int[str.length()];
        for (int i=0;i<str.length();i++){
            result[i] = Character.getNumericValue(str.charAt(i));
        }
        for (int i : result){
            System.out.print(i+" ");
        }
    }

    public static void plusOne(int[] digits){

    }
}