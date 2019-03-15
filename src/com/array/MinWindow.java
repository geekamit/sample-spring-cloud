package com.array;

import java.util.HashMap;

public class MinWindow {
    public static void main(String[] args) {
        String result = minWindow("ADOBECODEBANC","ABC");
        System.out.println(result);
    }

    public static String minWindow(String s, String t) {


        /**
         * The HashMap will be used to keep the count of each character
         *
         */
        HashMap<Character,Integer> need = new HashMap<>();
        for(Character ch: t.toCharArray()){
            need.put(ch, (need.get(ch) == null ? 1 : (need.get(ch)+1)) );
        }

        /**
         * This variable will be used to keep the running start and end point
         * of the matched characters in the given String
         */
        int left=0; int right = 0;

        /**
         * This variable will be used to keep the previous start and end point
         * of the matched characters in the given String
         */
        int i=0;int j=0;

        /**
         * Initialize with the total number of Missing characters
         */
        int missing = t.length();

        /**
         * Start increasing the right pointer
         * and check if we have reached the end of the String S
         */

        while(right < s.length()){
            char key = s.charAt(right);
            /**
             * if We found the first character, then decrease the missing count
             * and the count of that character in the map as well.
             */
            if(need.containsKey(key)){
                if(need.get(key) > 0 ){
                    missing --;
                }
                need.put(key,(need.get(key)-1));
            }
            right++;

            /**
             * If we have got all the required character from the given input t String then
             * Check of the current index (Start and end) is lesser than the previously found index
             * if yes then update them and continue it.
             */
            while(missing == 0){
                if (j==0 || ((right - left) < (j - i))  ){
                    System.out.println(left +" "+ right);
                    i = left;
                    j = right;
                }

                /**
                 * Now try to squeeze from the left side and see if we have the
                 * lesser substring available
                 */
                if (need.containsKey(s.charAt(left))){
                    need.put(s.charAt(left),need.get(s.charAt(left))+1);
                    if (need.get(s.charAt(left)) > 0){
                        missing++;
                    }
                }
                left++;

            }


        }

        return s.substring(i,j);
    }
}
