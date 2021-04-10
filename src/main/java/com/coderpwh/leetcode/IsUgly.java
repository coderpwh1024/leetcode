package com.coderpwh.leetcode;

import java.util.ArrayList;
import java.util.List;

/***
 *
 * 263 丑数
 *
 * 给你一个整数 n ，请你判断 n 是否为 丑数 。如果是，返回 true ；否则，返回 false 。
 *
 * 丑数 就是只包含质因数 2、3 和/或 5 的正整数。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：n = 6
 * 输出：true
 * 解释：6 = 2 × 3
 * 示例 2：
 *
 * 输入：n = 8
 * 输出：true
 * 解释：8 = 2 × 2 × 2
 * 示例 3：
 *
 * 输入：n = 14
 * 输出：false
 * 解释：14 不是丑数，因为它包含了另外一个质因数 7 。
 * 示例 4：
 *
 * 输入：n = 1
 * 输出：true
 * 解释：1 通常被视为丑数。
 *
 *
 */
public class IsUgly {

    public static void main(String[] args) {


        Integer n = 14;
        IsUgly isUgly = new IsUgly();
//        System.out.println(isUgly.isUgly(n));

        System.out.println(isUgly.test(n));

    }


    /***
     *    思路:
     *        1.时间复杂度为O(logN) 外循环是数组大小为3，内循环每次遍历都除以数组元素
     *        2. 空间复杂度为O(1)
     *        3. 主要是用除法与求余来实现的。
     *
     *
     * @param n
     * @return
     */
    public boolean test(Integer n) {

        if (n <= 0) {
            return false;
        }
        int[] array = {2, 3, 5};

        for (int a : array) {

            while (n % a == 0) {
                n = n / a;
            }
        }
        return n == 1;
    }


    /***
     *      思路:
     *         1.时间复杂度为O(NlogN),
     *         2. 空间复杂度为O(N) 创建了list集合
     *         3. 遍历过多，N过大时，则容易超时 
     *
     *
     * @param n
     * @return
     */
    public boolean isUgly(Integer n) {
        List<Integer> list = new ArrayList<>();

        while (n != 1) {

            for (int j = 2; j <= n; j++) {

                if (j == n) {
                    n = 1;
                    list.add(j);
                    break;
                }

                if (n % j == 0) {
                    n = n / j;
                    list.add(j);
                    break;
                }
            }

        }

        Integer count = 0;
        for (Integer a : list) {

            if (a == 2) {
                count++;
            } else if (a == 3) {
                count++;
            } else if (a == 5) {
                count++;
            }

        }
        if (count != list.size()) {
            return false;
        } else {
            return true;
        }
    }

}


