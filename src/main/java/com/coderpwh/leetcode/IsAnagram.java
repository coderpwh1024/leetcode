package com.coderpwh.leetcode;

import java.util.HashMap;

/***
 *
 *  242 有效的字母异位词
 *
 * 给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。
 *
 * 注意：若 s 和 t 中每个字符出现的次数都相同，则称 s 和 t 互为字母异位词。
 *
 *  
 *
 * 示例 1:
 *
 * 输入: s = "anagram", t = "nagaram"
 * 输出: true
 * 示例 2:
 *
 * 输入: s = "rat", t = "car"
 * 输出: false
 *
 *
 *
 */
public class IsAnagram {

    public static void main(String[] args) {


//        String s = "anagram";

//        String t = "nagaram";


        String s = "aacc";

        String t = "ccac";


        IsAnagram isAnagram = new IsAnagram();
//        isAnagram.isAnagram(s, t);

        System.out.println(isAnagram.isAnagram(s, t));

    }


    /****
     *
     *      思路:
     *         1. 时间复杂度为O(M+N)
     *         2. 空间复杂度为O(N)
     *
     *
     *
     * @param s
     * @param t
     * @return
     */
    public boolean isAnagram(String s, String t) {

        HashMap<Character, Integer> map = new HashMap<>();


        if (s.length() != t.length()) {
            return false;
        }

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c : t.toCharArray()) {

            Integer count = map.getOrDefault(c, 0);

            if (count <= 0) {
                return false;
            }
            count -= 1;
            map.put(c, count);
        }

        return true;
    }

}

