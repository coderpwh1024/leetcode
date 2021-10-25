package com.coderpwh.leetcode;


/***
 *
 *  1486  数组异或操作
 *
 * 给你两个整数，n 和 start 。
 *
 * 数组 nums 定义为：nums[i] = start + 2*i（下标从 0 开始）且 n == nums.length 。
 *
 * 请返回 nums 中所有元素按位异或（XOR）后得到的结果。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：n = 5, start = 0
 * 输出：8
 * 解释：数组 nums 为 [0, 2, 4, 6, 8]，其中 (0 ^ 2 ^ 4 ^ 6 ^ 8) = 8 。
 *      "^" 为按位异或 XOR 运算符。
 * 示例 2：
 *
 * 输入：n = 4, start = 3
 * 输出：8
 * 解释：数组 nums 为 [3, 5, 7, 9]，其中 (3 ^ 5 ^ 7 ^ 9) = 8.
 * 示例 3：
 *
 * 输入：n = 1, start = 7
 * 输出：7
 * 示例 4：
 *
 * 输入：n = 10, start = 5
 * 输出：2
 *  
 *
 *
 */
public class XorOperation {

    public static void main(String[] args) {


        int n = 10;
        int start = 5;

        XorOperation operation = new XorOperation();
        operation.xorOperation(n, start);


    }


    /***
     *      思路:
     *         1. 时间复杂度为O(N)
     *         2. 空间复杂度为O(1)
     *         3. for循环既可以实现
     *
     * @param n
     * @param start
     * @return
     */
    public int xorOperation(int n, int start) {


        Integer count = 0;
        Integer sum = 0;
        for (int i = 0; i < n; i++) {

            count = start + 2 * i;
            sum ^= count;
        }
        System.out.println(sum);


        return sum;
    }


}
