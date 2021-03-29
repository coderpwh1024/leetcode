package com.coderpwh.leetcode;

import java.util.HashSet;

/**
 * @author coderpwh
 */
public class LengthOfLongestSubstring {


    public static void main(String[] args) {


        String s = "abcabcbb";

//        String s = "pwwkew";

        LengthOfLongestSubstring length = new LengthOfLongestSubstring();
        length.lengthOfLongestSubstring(s);

        System.out.println(length.lengthOfLongestSubstring(s));


    }


    public int lengthOfLongestSubstring(String s) {

        HashSet<Character> set = new HashSet<>();

        int n = s.length();

        int rk = -1;
        int ans = 0;

        for (int i = 0; i < n; i++) {

            if (i != 0) {
                set.remove(s.charAt(i - 1));
            }

            while (rk + 1 < n && !set.contains(s.charAt(rk + 1))) {
                set.add(s.charAt(rk + 1));
                ++rk;
            }

            ans = Math.max(ans, rk - i + 1);

        }


        return ans;
    }

}
