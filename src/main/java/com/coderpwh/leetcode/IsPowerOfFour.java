package com.coderpwh.leetcode;

/***
 *  给定一个整数，写一个函数来判断它是否是 4 的幂次方。如果是，返回 true ；否则，返回 false 。
 *
 * 整数 n 是 4 的幂次方需满足：存在整数 x 使得 n == 4x
 *
 *  
 *
 * 示例 1：
 *
 * 输入：n = 16
 * 输出：true
 * 示例 2：
 *
 * 输入：n = 5
 * 输出：false
 * 示例 3：
 *
 * 输入：n = 1
 * 输出：true
 **
 *
 *
 */
public class IsPowerOfFour {

    public static void main(String[] args) {

        int n = 1;


        IsPowerOfFour power = new IsPowerOfFour();
//        power.isPowerOfFour(n);

        System.out.println(power.isPowerOfFour(n));

        System.out.println(power.test(n));

    }


    /***
     *       思路:
     *          1. 时间复杂度为(logN)
     *          2. 空间复杂的为O(1)
     *          3. 主要利用循环的方式实现
     *
     * @param n
     * @return
     */
    public boolean isPowerOfFour(int n) {

        if (n <= 0) {
            return false;
        }

        while (true) {

            if (n % 4 == 0) {
                n = n / 4;
            } else if (n == 1) {
                return true;
            } else {
                return false;
            }

        }
    }


    /***
     *
     *    思路:
     *       1. 时间复杂度为O(1)
     *       2. 空间复杂度为O(1)
     *       3. 利用取模方式，能被4整除，余数必为1
     *
     *
     *
     * @param n
     * @return
     */
    public boolean test(int n) {
        return n > 0 && (n & (n - 1)) == 0 && n % 3 == 1;
    }


}


