package com.coderpwh.leetcode;

/**
 * 896 单调数列
 * 如果数组是单调递增或单调递减的，那么它是单调的。
 * <p>
 * 如果对于所有 i <= j，A[i] <= A[j]，那么数组 A 是单调递增的。 如果对于所有 i <= j，A[i]> = A[j]，那么数组 A 是单调递减的。
 * <p>
 * 当给定的数组 A 是单调数组时返回 true，否则返回 false。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：[1,2,2,3]
 * 输出：true
 * 示例 2：
 * <p>
 * 输入：[6,5,4,4]
 * 输出：true
 * 示例 3：
 * <p>
 * 输入：[1,3,2]
 * 输出：false
 * 示例 4：
 * <p>
 * 输入：[1,2,4,5]
 * 输出：true
 * 示例 5：
 * <p>
 * 输入：[1,1,1]
 * 输出：true
 *
 * @author coderpwh
 */
public class IsMonotonic {

    public static void main(String[] args) {

//        int[] arr = {1, 3, 2, 4};

//        int[] arr = {6, 5, 4, 3};

        int[] arr = {1, 2, 3, 4};
//
//        int[] arr = {1, 3, 2};

        IsMonotonic isMonotonic = new IsMonotonic();
        isMonotonic.isMonotonic(arr);

        System.out.println(isMonotonic.isMonotonic(arr));

    }


    /****
     *
     *    思路:
     *      1: 时间复杂度为O(N)
     *      2: 空间富足度为O(1)
     *
     *
     * @param A
     * @return
     */
    public boolean isMonotonic(int[] A) {
        boolean m = true;
        boolean n = true;


        for (int i = 0; i < A.length - 1; i++) {

            if (A[i] > A[i + 1]) {
                m = false;
            }
            if (A[i] < A[i + 1]) {
                n = false;
            }

        }


        return m || n;
    }


}
