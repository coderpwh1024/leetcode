package com.coderpwh.leetcode;

import java.util.HashSet;

/**
 * 3. 无重复字符的最长子串
 * <p>
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 * <p>
 *  
 * <p>
 * 示例 1:
 * <p>
 * 输入: s = "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 * 示例 2:
 * <p>
 * 输入: s = "bbbbb"
 * 输出: 1
 * 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
 * 示例 3:
 * <p>
 * 输入: s = "pwwkew"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
 *      请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
 * 示例 4:
 * <p>
 * 输入: s = ""
 * 输出: 0
 *
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


    /***
     *      思路:
     *       1. 时间复杂度为O(N)
     *       2. 空间复杂度为O(N) N为字符串S的长度
     *       3. 主要是利用滑动窗口的方式实现
     *
     *
     *
     * @param s
     * @return
     */
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

