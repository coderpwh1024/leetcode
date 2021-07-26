package com.coderpwh.leetcode;

import java.util.HashMap;

public class IsAnagram {

    public static void main(String[] args) {


//        String s = "anagram";

//        String t = "nagaram";


       String s="aacc";

       String t="ccac";


        IsAnagram isAnagram = new IsAnagram();
//        isAnagram.isAnagram(s, t);

        System.out.println(isAnagram.isAnagram(s,t));

    }

    public boolean isAnagram(String s, String t) {

        HashMap<Character, Integer> map = new HashMap<>();


        if(s.length()!=t.length()){
            return  false;
        }

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c : t.toCharArray()) {

            Integer count = map.getOrDefault(c, 0);

            if (count <= 0) {
                return false;
            }

            count-=1;
            map.put(c,count);
        }

        return true;
    }

}
