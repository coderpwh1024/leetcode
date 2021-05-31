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

        int n = 0;


        IsPowerOfFour power = new IsPowerOfFour();
//        power.isPowerOfFour(n);

        System.out.println(power.isPowerOfFour(n));

    }

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


}
