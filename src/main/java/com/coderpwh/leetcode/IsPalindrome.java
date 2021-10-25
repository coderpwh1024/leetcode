package com.coderpwh.leetcode;

/**
 * 给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
 * <p>
 * 说明：本题中，我们将空字符串定义为有效的回文串。
 * <p>
 * 示例 1:
 * <p>
 * 输入: "A man, a plan, a canal: Panama"
 * 输出: true
 * 示例 2:
 * <p>
 * 输入: "race a car"
 * 输出: false
 *
 * @author coderpwh
 */
public class IsPalindrome {

    public static void main(String[] args) {

        String str = "A man, a plan, a canal: Panama";

        IsPalindrome palindrome = new IsPalindrome();
        palindrome.isPalindrome(str);
        System.out.println(palindrome.isPalindrome(str));

    }


    /***
     *   思路:
     *   1 验证回文串，首位字母正好相同（忽略大小写），除掉特殊字符
     *   2 Character.isLetterOrDigit() 验证该字符是字母或者数字
     *   3 空间复杂度为O(2)
     *   4 时间复杂度为O(N) N 为s的长度
     *
     *
     *
     * @param s
     * @return
     */
    public boolean isPalindrome(String s) {

        StringBuffer sgood = new StringBuffer();
        int length = s.length();
        for (int i = 0; i < length; i++) {
            char ch = s.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                sgood.append(Character.toLowerCase(ch));
            }
        }
        StringBuffer sgood_rev = new StringBuffer(sgood).reverse();
        return sgood.toString().equals(sgood_rev.toString());

    }


}
