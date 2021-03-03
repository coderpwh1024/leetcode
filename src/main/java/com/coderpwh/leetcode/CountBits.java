package com.coderpwh.leetcode;

/*****
 *给定一个非负整数 num。对于 0 ≤ i ≤ num 范围中的每个数字 i ，计算其二进制数中的 1 的数目并将它们作为数组返回。
 *
 * 示例 1:
 *
 * 输入: 2
 * 输出: [0,1,1]
 * 示例 2:
 *
 * 输入: 5
 * 输出: [0,1,1,2,1,2]
 *
 *
 */

import java.util.ArrayList;
import java.util.List;

public class CountBits {

    public static void main(String[] args) {


        /***
         * 2
         * [0,1,1]
         */
        CountBits bit = new CountBits();
        bit.countBits(5);

    }

    /****
     *     思路:
     *       1：时间复杂度为O(N)
     *       2: 空间复杂度为O(N),创建了list集合
     *       3: 暴力方法解决，直接调用Integer的api
     *
     *
     *
     * @param num
     * @return
     */
    public int[] countBits(int num) {

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i <= num; i++) {
            list.add(Integer.bitCount(i));
        }

        int[] arr = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        return arr;


    }

}
