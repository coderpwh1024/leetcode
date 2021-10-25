package com.coderpwh.leetcode;

/***
 *
 * 给定一个正整数，返回它在 Excel 表中相对应的列名称。
 *
 * 例如，
 *
 *     1 -> A
 *     2 -> B
 *     3 -> C
 *     ...
 *     26 -> Z
 *     27 -> AA
 *     28 -> AB
 *     ...
 * 示例 1:
 *
 * 输入: 1
 * 输出: "A"
 * 示例 2:
 *
 * 输入: 28
 * 输出: "AB"
 * 示例 3:
 *
 * 输入: 701
 * 输出: "ZY"
 *
 */
public class ConvertToTitle {

    public static void main(String[] args) {


        // AA
//        int num = 27;

        // BA
        int num = 53;

        ConvertToTitle convert = new ConvertToTitle();
//        convert.convertToTitle(num);
        System.out.println(convert.convertToTitle(num));

    }


    /***
     *   A -1
     *   B- 2
     *   C- 3
     *
     *   Z -26
     *
     *   AA- 27
     *   AB- 28
     *
     *      思路:
     *         1. 时间复杂度为O(log26 columnNumber)
     *         2, 空间复杂度为O(log26 columnNumber)
     *
     *
     *
     * @param columnNumber
     * @return
     */
    public String convertToTitle(int columnNumber) {

        StringBuffer sb = new StringBuffer();

        while (columnNumber != 0) {
            columnNumber--;
            sb.append((char) (columnNumber % 26 + 'A'));
            columnNumber /= 26;
        }
        return sb.reverse().toString();

    }


}
