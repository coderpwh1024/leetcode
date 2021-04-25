package com.coderpwh.leetcode;


import java.util.HashSet;
import java.util.Set;

/***
 *  202 快乐数
 *编写一个算法来判断一个数 n 是不是快乐数。
 *
 * 「快乐数」定义为：
 *
 * 对于一个正整数，每一次将该数替换为它每个位置上的数字的平方和。
 * 然后重复这个过程直到这个数变为 1，也可能是 无限循环 但始终变不到 1。
 * 如果 可以变为  1，那么这个数就是快乐数。
 * 如果 n 是快乐数就返回 true ；不是，则返回 false 。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：19
 * 输出：true
 * 解释：
 * 12 + 92 = 82
 * 82 + 22 = 68
 * 62 + 82 = 100
 * 12 + 02 + 02 = 1
 * 示例 2：
 *
 * 输入：n = 2
 * 输出：false
 *
 *
 *
 *
 */
public class IsHappy {

    public static void main(String[] args) {

        int n = 19;
//        int n = 2;
        IsHappy happy = new IsHappy();
        System.out.println(happy.isHappy(n));

    }


    /***
     *    思路:
     *       1. 时间复杂度为O(logN)
     *       2. 空间复杂度为O(logN)
     *       3. 主要是利用hash方式来实现的
     *
     *
     * @param n
     * @return
     */
    public boolean isHappy(int n) {

        Set<Integer> set = new HashSet<>();

        while (n != 1 && !set.contains(n)) {

            set.add(n);
            n = getNext(n);
        }

        return n == 1;
    }


    private int getNext(int n) {

        int totalSum = 0;

        while (n > 0) {
            int d = n % 10;
            n = n / 10;
            totalSum += d * d;

        }
        return totalSum;
    }


}
