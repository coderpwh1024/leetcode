package com.coderpwh.test;


/***
 *
 * 输入: s = "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 *
 */
public class LongString {

    public static void main(String[] args) {

//        String str = "abcabcbb";

//        String str = "pwwkew";

        String str ="abababc";

        System.out.println(lengthOfLongestSubstring(str));


    }

    /***
     * 最长子串
     * @param s
     * @return
     */
    public static int lengthOfLongestSubstring(String s) {
        char arr[] = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return j - i;
                }
            }
        }
        return 0;
    }


}
