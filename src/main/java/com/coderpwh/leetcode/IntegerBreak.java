package com.coderpwh.leetcode;

/**
 * 343. 整数拆分
 * <p>
 * 给定一个正整数 n ，将其拆分为 k 个 正整数 的和（ k >= 2 ），并使这些整数的乘积最大化。
 * 返回 你可以获得的最大乘积 。
 * 示例 1:
 * <p>
 * 输入: n = 2
 * 输出: 1
 * 解释: 2 = 1 + 1, 1 × 1 = 1。
 * 示例 2:
 * <p>
 * 输入: n = 10
 * 输出: 36
 * 解释: 10 = 3 + 3 + 4, 3 × 3 × 4 = 36。
 *
 * @author coderpwh
 * @date 2023/9/4 15:28
 */
public class IntegerBreak {

    public static void main(String[] args) {

        int n = 8;

        IntegerBreak ib = new IntegerBreak();
        Integer count = ib.integerBreak(n);
        System.out.println(count);
    }


    /***
     * n=9;
     *
     * 3+3+3,
     * 3*3*3
     *
     *
     * @param n
     * @return
     */
    public int integerBreak(int n) {
        int[] dp = new int[n + 1];

        for (int i = 2; i <= n; i++) {

            int curMax = 0;
            for (int j = 1; j < i; j++) {
                curMax = Math.max(curMax, Math.max(j * (i - j), j * dp[i - j]));
            }
            dp[i] = curMax;
        }
        return dp[n];
    }
}
