package com.coderpwh.leetcode;

/**
 * 746. 使用最小花费爬楼梯
 * 给你一个整数数组 cost ，其中 cost[i] 是从楼梯第 i 个台阶向上爬需要支付的费用。一旦你支付此费用，即可选择向上爬一个或者两个台阶。
 * <p>
 * 你可以选择从下标为 0 或下标为 1 的台阶开始爬楼梯。
 * <p>
 * 请你计算并返回达到楼梯顶部的最低花费。
 *
 * @author coderpwh
 * @date 2023/9/13 11:27
 */
public class MinCostClimbingStairs {

    public static void main(String[] args) {

        // 6
        int arr[] = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};

        MinCostClimbingStairs minCost = new MinCostClimbingStairs();
        Integer result = minCost.minCostClimbingStairs(arr);
        System.out.println(result);

    }

    /***
     * 最小花费爬楼梯
     * @param cost
     * @return
     */
    public int minCostClimbingStairs(int[] cost) {

        int sum = 0;

        for (int i = 0; i < cost.length; i++) {
            for (int j = 0; j < cost.length; j++) {
                if (cost[i] < cost[j]) {
                    sum += cost[i];
                }
            }
        }

        return -1;
    }


}
