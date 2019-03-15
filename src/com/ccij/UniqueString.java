package com.ccij;

public class UniqueString {
    public static void main(String[] args) {
        boolean result = UniqueString.isUnique("aabcd");
        System.out.println("Result "+result);
    }

    public  static boolean isUnique(String input){
        boolean[] ascii = new boolean[256];

        for (int i=0;i<input.length(); i++){
            char ch = input.charAt(i);
            if (ascii[ch]){
                return false;
            }else {
                ascii[ch] = true;
            }
        }
        return true;
    }

}
