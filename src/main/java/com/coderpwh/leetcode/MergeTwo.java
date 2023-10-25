package com.coderpwh.leetcode;

import java.util.Arrays;

/**
 * 面试题 10.01. 合并排序的数组
 * <p>
 * 给定两个排序后的数组 A 和 B，其中 A 的末端有足够的缓冲空间容纳 B。
 * 编写一个方法，将 B 合并入 A 并排序。
 * 初始化 A 和 B 的元素数量分别为 m 和 n。
 * <p>
 * 示例:
 * <p>
 * 输入:
 * A = [1,2,3,0,0,0], m = 3
 * B = [2,5,6],       n = 3
 * <p>
 * 输出: [1,2,2,3,5,6]
 * 说明:
 * <p>
 * A.length == n + m
 *
 * @author coderpwh
 * @date 2023/10/25 13:48
 */
public class MergeTwo {
    public static void main(String[] args) {

        int A[] = {1, 2, 3, 0, 0, 0};
        int B[] = {2, 5, 6};

        int m = 3;
        int n = 3;

        MergeTwo merge = new MergeTwo();
        merge.merge(A, m, B, n);


    }


    /***
     *  1. 时间复杂度为O(N)
     *  2. 空间复杂度为O(1)
     *
     * @param A
     * @param m
     * @param B
     * @param n
     */
    public void merge(int[] A, int m, int[] B, int n) {

        for (int i = 0; i != n; i++) {
            A[m + i] = B[i];
        }
        Arrays.sort(A);


    }
}
