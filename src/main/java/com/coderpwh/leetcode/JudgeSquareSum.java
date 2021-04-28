package com.coderpwh.leetcode;

/**
 * 633 平方数之和
 * <p>
 * 给定一个非负整数 c ，你要判断是否存在两个整数 a 和 b，使得 a2 + b2 = c 。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：c = 5
 * 输出：true
 * 解释：1 * 1 + 2 * 2 = 5
 * 示例 2：
 * <p>
 * 输入：c = 3
 * 输出：false
 * 示例 3：
 * <p>
 * 输入：c = 4
 * 输出：true
 * 示例 4：
 * <p>
 * 输入：c = 2
 * 输出：true
 * 示例 5：
 * <p>
 * 输入：c = 1
 * 输出：true
 *
 * @author coderpwh
 */
public class JudgeSquareSum {

    public static void main(String[] args) {


        int num = 1;

        JudgeSquareSum sum = new JudgeSquareSum();
//        sum.judgeSquareSum(num);
        System.out.println(sum.judgeSquareSum(num));
        System.out.println(sum.test(num));
    }


    /***
     *    思路:
     *        1. 时间复杂度为O(N^2)
     *        2. 空间复杂度为O(1)
     *        3. 暴力求解，当c比较大时，就会出现超时现象，测试用例不通过
     *
     *
     * @param c
     * @return
     */
    public boolean judgeSquareSum(int c) {
        for (int i = 0; i <= c; i++) {
            for (int j = 0; j <= c; j++) {
                if (i * i + j * j == c) {
                    return true;
                }

            }
        }
        return false;
    }


    /***
     *   思路:
     *      1. 时间复杂度为O(c开根号)
     *      2. 空间复杂度为O(1)
     *      3. 利用sqrt 函数
     *
     * @param c
     * @return
     */
    public boolean test(int c) {

        for (long a = 0; a * a <= c; a++) {
            double b = Math.sqrt(c - a * a);
            if (b == (int) b) {
                return true;
            }
        }
        return false;
    }


}
