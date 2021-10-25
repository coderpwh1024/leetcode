package com.coderpwh.leetcode;

/**
 *   231 2的幂
 *
 *  给定一个整数，编写一个函数来判断它是否是 2 的幂次方。
 *
 * 示例 1:
 *
 * 输入: 1
 * 输出: true
 * 解释: 20 = 1
 * 示例 2:
 *
 * 输入: 16
 * 输出: true
 * 解释: 24 = 16
 * 示例 3:
 *
 * 输入: 218
 * 输出: false
 *
 *
 *
 *
 * @author coderpwh
 */
public class IsPowerOfTwo {

    public static void main(String[] args) {
        IsPowerOfTwo power = new IsPowerOfTwo();


//        System.out.println(power.isPowerOfTwo(1073741825));

        System.out.println(power.test(8));
    }


    /****
     *  1. 时间复杂度为 O(longn)
     *
     *  2. 利用%与/ 来实现
     *
     *
     *
     * @param n
     * @return
     */
    public boolean test(int n) {

        if (n <= 0) {
            return false;
        }

        while (n % 2 == 0) {
            n = n / 2;
        }
        return n == 1;

    }


    /*****
     *    思路：
     *      1: 时间复杂度为O(N) 严重超时
     *
     *      2：算法未通过
     *
     *
     * @param n
     * @return
     */
    public boolean isPowerOfTwo(int n) {

        if (n <= 0) {
            return false;
        }
        if (n == 1) {
            return true;
        }

        int result = 1;
        while (true) {
            result = result * 2;
            if (result == n) {
                return true;
            } else if (result > n) {
                return false;
            }

        }
    }
}
