package com.array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class FirstUniqueChar {

    public static void main(String[] args) {
        System.out.println(firstUnique("dddcccbba"));

    }

    static int firstUnique(String text){

        HashMap<Character,Integer> map = new HashMap();
        int uniqueIndex = -1;

        for (int i=0;i<text.length() ;i ++){
            char val = text.charAt(i);
            if(map.containsKey(val)){
                map.put(val,map.get(val)+1);
            }else {
                map.put(val, 1);
            }
        }

        for (int i=0;i<text.length();i++){
            char ch = text.charAt(i);
            if (map.get(ch) == 1){
                uniqueIndex = i;
                break;
            }
        }
        return uniqueIndex;
    }

    /**
     * Hello
     * H -> 1
     * e -> 1
     * l -> 2
     * o -> 1
     */

}
