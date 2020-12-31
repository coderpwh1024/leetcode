package com.coderpwh.leetcode;

/**
 * 344 反转字符串
 * <p>
 * 编写一个函数，其作用是将输入的字符串反转过来。输入字符串以字符数组 char[] 的形式给出。
 * <p>
 * 不要给另外的数组分配额外的空间，你必须原地修改输入数组、使用 O(1) 的额外空间解决这一问题。
 * <p>
 * 你可以假设数组中的所有字符都是 ASCII 码表中的可打印字符。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：["h","e","l","l","o"]
 * 输出：["o","l","l","e","h"]
 * 示例 2：
 * <p>
 * 输入：["H","a","n","n","a","h"]
 * 输出：["h","a","n","n","a","H"]
 *
 * @author coderpwh
 */
public class ReverseString {

    public static void main(String[] args) {

        char ch[] = {'h', 'e', 'l', 'l', 'o'};


        ReverseString reverse = new ReverseString();
//        reverse.reverseString(ch);
        reverse.test(ch);

    }


    /*** 
     *   思路: 
     *     1。 时间复杂度为O(N/2)
     *     2 . 空间复杂度为O(1)
     *     3. 遍历N/2 次 
     *
     *
     * @param s
     */
    public void test(char[] s) {

        int n = s.length;

        for (int left = 0, right = n - 1; left < right; left++, right--) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
        }


    }


    /***
     *   思路:
     *     1 空间复杂度为O（1）
     *     2 时间复杂度为O(N)
     *     3 执行时间还是长
     *
     *
     * @param s
     */
    public void reverseString(char[] s) {

        StringBuilder sb = new StringBuilder();
        for (int i = s.length - 1; i >= 0; i--) {
            sb.append(s[i]);
        }

        for (int i = 0; i < sb.toString().length(); i++) {
            s[i] = sb.charAt(i);
            System.out.print(s[i] + " ");
        }

    }


}
