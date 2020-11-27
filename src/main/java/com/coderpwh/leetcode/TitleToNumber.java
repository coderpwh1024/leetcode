package com.coderpwh.leetcode;


/*****
 *
 *  给定一个Excel表格中的列名称，返回其相应的列序号。
 *
 * 例如，
 *
 *     A -> 1
 *     B -> 2
 *     C -> 3
 *     ...
 *     Z -> 26
 *     AA -> 27
 *     AB -> 28
 *     ...
 * 示例 1:
 *
 * 输入: "A"
 * 输出: 1
 * 示例 2:
 *
 * 输入: "AB"
 * 输出: 28
 * 示例 3:
 *
 * 输入: "ZY"
 * 输出: 701
 *
 *
 *
 *
 */
public class TitleToNumber {

    public static void main(String[] args) {

        TitleToNumber title = new TitleToNumber();
        title.titleToNumber("AB");

        System.out.println(title.titleToNumber("a"));

    }


    /****
     *   思路：
     *     1：主要是算每一个字符与 'A' 之间的差值 如上面
     *      'A' 1
     *      'B' 2
     *      int num = s.charAt(i)-'A' +1 就是每一个字符的值
     *     2：虽然没有强制要求 字符串里面的字母都是大写，需要考虑
     *        s = s.toUpperCase(); 稍微影响性能
     *
     * @param s
     * @return
     */
    public int titleToNumber(String s) {

        s = s.toUpperCase();

        System.out.println('a' - 'A');

        int count = 0;
        for (int i = 0; i < s.length(); i++) {

            int num = s.charAt(i) - 'A' + 1;
            count = count * 26 + num;
        }
        return count;
    }


}
