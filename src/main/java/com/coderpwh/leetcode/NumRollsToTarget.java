package com.coderpwh.leetcode;

/**
 * 1155. 掷骰子等于目标和的方法数
 * 这里有 n 个一样的骰子，每个骰子上都有 k 个面，分别标号为 1 到 k 。
 * <p>
 * 给定三个整数 n ,  k 和 target ，返回可能的方式(从总共 kn 种方式中)滚动骰子的数量，使正面朝上的数字之和等于 target 。
 * <p>
 * 答案可能很大，你需要对 109 + 7 取模 。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入：n = 1, k = 6, target = 3
 * 输出：1
 * 解释：你扔一个有 6 个面的骰子。
 * 得到 3 的和只有一种方法。
 * 示例 2：
 * <p>
 * 输入：n = 2, k = 6, target = 7
 * 输出：6
 * 解释：你扔两个骰子，每个骰子有 6 个面。
 * 得到 7 的和有 6 种方法：1+6 2+5 3+4 4+3 5+2 6+1。
 * 示例 3：
 * <p>
 * 输入：n = 30, k = 30, target = 500
 * 输出：222616187
 * 解释：返回的结果必须是对 109 + 7 取模。
 *
 * @author coderpwh
 * @date 2023/10/24 9:46
 */
public class NumRollsToTarget {

    public static void main(String[] args) {

        int n = 30;
        int k = 30;
        int target = 500;

        NumRollsToTarget rolls = new NumRollsToTarget();
        int result = rolls.numRollsToTarget(n, k, target);
        System.out.println(result);

        int count = rolls.numRollsToTargetByTwo(n, k, target);
        System.out.println(count);

    }


    /***
     *  1. 时间复杂度为O(n*target*k)
     *  2. 空间复杂度为O(n*target)
     *
     * @param n
     * @param k
     * @param target
     * @return
     */
    public int numRollsToTarget(int n, int k, int target) {

        int MOD = 1000000007;

        int[][] f = new int[n + 1][target + 1];
        f[0][0] = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= target; j++) {
                for (int x = 1; x <= k; x++) {
                    if (j - x >= 0) {
                        f[i][j] = (f[i][j] + f[i - 1][j - x]) % MOD;
                    }
                }
            }
        }
        return f[n][target];
    }

    public int numRollsToTargetByTwo(int n, int k, int target) {
        int MOD = 1000000007;

        int[] f = new int[target + 1];
        f[0] = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = target; j >= 0; j--) {
                f[j] = 0;
                for (int x = 1; x <= k; x++) {
                    if (j - x >= 0) {
                        f[j] = (f[j] + f[j - x]) % MOD;
                    }
                }
            }
        }

        return f[target];
    }


}
