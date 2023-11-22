package com.coderpwh.leetcode;


import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

/**
 * 面试题 17.09. 第 k 个数
 * 提示
 * 中等
 * 253
 * 相关企业
 * 有些数的素因子只有 3，5，7，请设计一个算法找出第 k 个数。注意，不是必须有这些素因子，而是必须不包含其他的素因子。
 * 例如，前几个数按顺序应该是 1，3，5，7，9，15，21。
 * <p>
 * 示例 1:
 * <p>
 * 输入: k = 5
 * <p>
 * 输出: 9
 */
public class GetKthMagicNumber {

    public static void main(String[] args) {

        int k = 5;

        GetKthMagicNumber number = new GetKthMagicNumber();
        int result = number.getKthMagicNumber(k);
        System.out.println(result);

    }

    public int getKthMagicNumber(int k) {

        int arr[] = {3, 5, 7};

        Set<Long> seen = new HashSet<>();

        PriorityQueue<Long> heap = new PriorityQueue<Long>();
        seen.add(1L);
        heap.offer(1L);
        int magic = 0;

        for (int i = 0; i < k; i++) {
            long cuur = heap.poll();
            magic = (int) cuur;
            for (int factor : arr) {
                long next = cuur * factor;
                if (seen.add(next)) {
                    heap.offer(next)
                }
            }
        }
        return magic;
    }


}
