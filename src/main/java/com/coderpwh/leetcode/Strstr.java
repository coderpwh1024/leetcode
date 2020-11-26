package com.coderpwh.leetcode;


/***
 *  给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。如果不存在，则返回  -1。
 *
 * 示例 1:
 *
 * 输入: haystack = "hello", needle = "ll"
 * 输出: 2
 * 示例 2:
 *
 * 输入: haystack = "aaaaa", needle = "bba"
 * 输出: -1
 * 说明:
 *
 * 当 needle 是空字符串时，我们应当返回什么值呢？这是一个在面试中很好的问题。
 *
 */
public class Strstr {

    public static int strStr(String haystack, String needle) {

        int a = haystack.indexOf(needle);

        if (haystack.contains(needle)) {
            return haystack.indexOf(needle);
        } else {
            return -1;
        }

    }


    public static void main(String[] args) {

         String str = "aabaa";
         String a = "aa";

        System.out.println(strStr(str,a));

    }
}
