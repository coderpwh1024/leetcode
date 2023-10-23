package com.coderpwh.leetcode;

/**
 * 面试题 08.11. 硬币
 * <p>
 * 硬币。给定数量不限的硬币，币值为25分、10分、5分和1分，
 * 编写代码计算n分有几种表示法。(结果可能会很大，你需要将结果模上1000000007)
 * <p>
 * 示例1:
 * <p>
 * 输入: n = 5
 * 输出：2
 * 解释: 有两种方式可以凑成总金额:
 * 5=5
 * 5=1+1+1+1+1
 * 示例2:
 * <p>
 * 输入: n = 10
 * 输出：4
 * 解释: 有四种方式可以凑成总金额:
 * 10=10
 * 10=5+5
 * 10=5+1+1+1+1+1
 * 10=1+1+1+1+1+1+1+1+1+1
 * 说明：
 * <p>
 * 注意:
 * <p>
 * 你可以假设：
 * <p>
 * 0 <= n (总金额) <= 1000000
 *
 * @author coderpwh
 * @date 2023/10/23 16:09
 */
public class WaysToChange {


    public static void main(String[] args) {
        int n =11;

        WaysToChange change = new WaysToChange();
        int result = change.waysToChange(n);
        System.out.println(result);

    }

    public int waysToChange(int n) {
        int[] nums = {25, 10, 5, 1};
        long[] dp = new long[n + 1];
        dp[0] = 1;

        for (int num : nums) {
            for (int i = num; i <= n; i++) {
                dp[i] = dp[i - num] + dp[i];
            }
        }
        return (int) (dp[n] % 1000000007);
    }


}
