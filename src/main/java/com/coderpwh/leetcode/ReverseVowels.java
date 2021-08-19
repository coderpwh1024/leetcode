package com.coderpwh.leetcode;


/***
 *
 * 345. 反转字符串中的元音字母
 *
 * 编写一个函数，以字符串作为输入，反转该字符串中的元音字母。
 *
 *  
 *
 * 示例 1：
 *
 * 输入："hello"
 * 输出："holle"
 * 示例 2：
 *
 * 输入："leetcode"
 * 输出："leotcede"
 *
 */
public class ReverseVowels {


    public static void main(String[] args) {


        String s = "hello";

        ReverseVowels reverseVowels = new ReverseVowels();

        System.out.println(reverseVowels.reverseVowels(s));

    }


    /***
     *  思路:
     *     1. 时间复杂度为O(N)
     *     2. 空间复杂度为O(1)
     *     3. 利用双指针方式实现
     *
     *
     * @param s
     * @return
     */
    public String reverseVowels(String s) {

        int n = s.length();

        char[] arr = s.toCharArray();

        int i = 0;
        int j = n - 1;

        while (i < j) {
            while (i < n && !isVowel(arr[i])) {
                ++i;
            }
            while (j > 0 && !isVowel(arr[j])) {
                --j;
            }
            if (i < j) {
                swap(arr, i, j);
                ++i;
                --j;
            }
        }


        return new String(arr);
    }


    /***
     *  判断当前字符是否是元音字母，aeiou 及大写的AEIOU 是元音字母
     * @param ch
     * @return
     */
    public boolean isVowel(char ch) {
        return "aeiouAEIOU".indexOf(ch) >= 0;
    }


    /***
     *  交换两个字符的位置
     * @param arr
     * @param i
     * @param j
     */
    public void swap(char[] arr, int i, int j) {

        char temp = arr[i];

        arr[i] = arr[j];

        arr[j] = temp;
    }


}

