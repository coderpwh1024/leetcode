package com.coderpwh.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 989. 数组形式的整数加法
 * <p>
 * 对于非负整数 X 而言，X 的数组形式是每位数字按从左到右的顺序形成的数组。例如，如果 X = 1231，那么其数组形式为 [1,2,3,1]。
 * <p>
 * 给定非负整数 X 的数组形式 A，返回整数 X+K 的数组形式。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：A = [1,2,0,0], K = 34
 * 输出：[1,2,3,4]
 * 解释：1200 + 34 = 1234
 * 示例 2：
 * <p>
 * 输入：A = [2,7,4], K = 181
 * 输出：[4,5,5]
 * 解释：274 + 181 = 455
 * 示例 3：
 * <p>
 * 输入：A = [2,1,5], K = 806
 * 输出：[1,0,2,1]
 * 解释：215 + 806 = 1021
 * 示例 4：
 * <p>
 * 输入：A = [9,9,9,9,9,9,9,9,9,9], K = 1
 * 输出：[1,0,0,0,0,0,0,0,0,0,0]
 * 解释：9999999999 + 1 = 10000000000
 *
 * @author coderpwh
 */
public class AddToArrayForm {

    public static void main(String[] args) {

//        int[] arr = {9,9,9,9,9,9,9,9,9,9};
//        int[] arr = {1, 2, 3, 4};
//        int k = 1;

        int[] arr = {1, 2, 3};
        int k = 912;

        AddToArrayForm add = new AddToArrayForm();
//        System.out.println(add.addToArrayFormaddToArrayForm(arr, k));

        add.test(arr, k);
    }

    /****
     *       思路:
     *          1.时间复杂度为O(MAX(N,logK))
     *          2. 空间复杂度为O(MAX(N,logk))
     *          3. 主要是用余数来进行相加并对进位部分进行处理
     *
     * @param A
     * @param K
     * @return
     */
    public List<Integer> test(int[] A, int K) {
        List<Integer> res = new ArrayList<>();

        int n = A.length;

        for (int i = n - 1; i >= 0 || K > 0; --i, K /= 10) {

            if (i >= 0) {
                K += A[i];
            }
            System.out.println(K);
            res.add(K % 10);

        }
        Collections.reverse(res);

        for (int i = 0; i < res.size(); i++) {
            System.out.print(res.get(i));
        }

        return res;

    }


    /*****
     *       思路:
     *         1. 时间复杂度为O(N)
     *         2. 空间复杂度为O(N)
     *         3. 用字符串String 转Integer，方法行不通，超过Integer的范围则不行
     *
     * @param A
     * @param K
     * @return
     */
    public List<Integer> addToArrayFormaddToArrayForm(int[] A, int K) {

        List<Integer> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        Integer total = 0;
        for (int i = A.length - 1; i >= 0; i--) {
            sb.append(A[i]);

        }
        Integer count = Integer.valueOf(sb.toString()) + K;
        String str = count + "";
        String arr[] = str.split("");

        for (String s : arr) {
            list.add(Integer.valueOf(s));
        }

        return list;

    }


}
