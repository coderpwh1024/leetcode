package com.coderpwh.leetcode;

/****
 *
 *    1137. 第 N 个泰波那契数
 *
 泰波那契序列 Tn 定义如下： 

 T0 = 0, T1 = 1, T2 = 1, 且在 n >= 0 的条件下 Tn+3 = Tn + Tn+1 + Tn+2

 给你整数 n，请返回第 n 个泰波那契数 Tn 的值。


 示例 1：

 输入：n = 4
 输出：4
 解释：
 T_3 = 0 + 1 + 1 = 2
 T_4 = 1 + 1 + 2 = 4
 示例 2：

 输入：n = 25
 输出：1389537
  

 提示：

 0 <= n <= 37
 答案保证是一个 32 位整数，即 answer <= 2^31 - 1。
 *
 *
 */
public class Tribonacci {

    public static void main(String[] args) {
        Tribonacci t = new Tribonacci();
        System.out.println(t.tribonacci(4));
        System.out.println(t.test(4));

    }

    private int n = 38;

    private int[] nums = new int[n];

    public Tribonacci() {
        nums[1] = 1;
        nums[2] = 1;
        tribonacci(n - 1);
    }

    /***
     *   思路:
     *      1:时间复杂度为O(1) 已经固定大小为37
     *      2: 空间复杂度为O(1) 创建了一个数组
     *
     *
     * @param n
     * @return
     */
    public int tribonacci(int n) {

        if (n == 0) {
            return 0;
        }
        if (nums[n] != 0) {
            return nums[n];
        } else {
            nums[n] = tribonacci(n - 1) + tribonacci(n - 2) + tribonacci(n - 3);
            return nums[n];
        }

    }


    /****
     *
     *   思路:
     *     1:时间复杂度为O(N) 由于题中已经规定n大小不超过37 最终为O(1)
     *     2：空间复杂度为O(1)
     *
     *
     * @param n
     * @return
     */
    public int test(int n) {

        if (n == 0) {
            return 0;
        } else if (n == 1 || n == 2) {
            return 1;
        }
        int a = 0;
        int b = 1;
        int c = 1;

        int sum = 0;
        for (int i = 3; i <= n; i++) {
            sum = a + b + c;
            a = b;
            b = c;
            c = sum;
        }
        return sum;
    }


}
