package com.coderpwh.leetcode;

/**
 * 5. 最长回文子串
 * 提示
 * 中等
 * 6.8K
 * 相关企业
 * 给你一个字符串 s，找到 s 中最长的回文子串。
 * <p>
 * 如果字符串的反序与原始字符串相同，则该字符串称为回文字符串。l;
 * 示例 1：
 * <p>
 * 输入：s = "babad"
 * 输出："bab"
 * 解释："aba" 同样是符合题意的答案。
 * 示例 2：
 * <p>
 * 输入：s = "cbbd"
 * 输出："bb"
 *
 * @author coderpwh
 * @date 2023/9/5 14:23
 */
public class LongestPalindrome {

    public static void main(String[] args) {

//        String str = "babad";

        String str = "cbba";

        LongestPalindrome palindrome = new LongestPalindrome();
        String result = palindrome.longestPalindrome(str);

        System.out.println(result);
    }


    /***
     * 最长回文串
     * @param s
     * @return
     */
    public String longestPalindrome(String s) {

        int len = s.length();
        if (len < 2) {
            return s;
        }

        int maxLen = 1;
        int begin = 0;

        boolean[][] dp = new boolean[len][len];

        for (int i = 0; i < len; i++) {
            dp[i][i] = true;
        }

        char[] charArray = s.toCharArray();

        for (int L = 2; L < len; L++) {
            for (int i = 0; i < len; i++) {
                int j = L + i - 1;
                if (j >= len) {
                    break;
                }
                if (charArray[i] != charArray[j]) {
                    dp[i][j] = false;
                } else {
                    if (j - i < 3) {
                        dp[i][j] = true;
                    } else {
                        dp[i][j] = dp[i + 1][j + 1];
                    }
                }
                if (dp[i][j] && j - i + 1 > maxLen) {
                    maxLen = j - i + 1;
                    begin = i;
                }
            }
        }
        return s.substring(begin, begin + maxLen);
    }


}
