package com.coderpwh.leetcode;

/**
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
     *
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
