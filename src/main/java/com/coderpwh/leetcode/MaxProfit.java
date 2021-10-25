package com.coderpwh.leetcode;


/**
 * 121 买卖股票的最佳时机
 *
 * <p>
 * 给定一个数组 prices ，它的第 i 个元素 prices[i] 表示一支给定股票第 i 天的价格。
 * <p>
 * 你只能选择 某一天 买入这只股票，并选择在 未来的某一个不同的日子 卖出该股票。设计一个算法来计算你所能获取的最大利润。
 * <p>
 * 返回你可以从这笔交易中获取的最大利润。如果你不能获取任何利润，返回 0 。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：[7,1,5,3,6,4]
 * 输出：5
 * 解释：在第 2 天（股票价格 = 1）的时候买入，在第 5 天（股票价格 = 6）的时候卖出，最大利润 = 6-1 = 5 。
 * 注意利润不能是 7-1 = 6, 因为卖出价格需要大于买入价格；同时，你不能在买入前卖出股票。
 * 示例 2：
 * <p>
 * 输入：prices = [7,6,4,3,1]
 * 输出：0
 * 解释：在这种情况下, 没有交易完成, 所以最大利润为 0。
 *
 * @author coderpwh
 */
public class MaxProfit {
    public static void main(String[] args) {

//        int[] prices = {7, 1, 5, 3, 6, 4};

        int[] prices = {7, 6, 4, 3, 1};

//        int[] prices = {1, 2};


        MaxProfit max = new MaxProfit();
//        max.maxProfit(prices);
//        System.out.println(max.maxProfit(prices));
        System.out.println(max.test(prices));


    }


    /***
     *    思路:
     *       1. 时间复杂度为O(N)
     *       2. 空间复杂度为O(1)
     *
     *
     *
     * @param prices
     * @return
     */
    public int test(int[] prices) {

        int minprice = Integer.MAX_VALUE;

        int maxprice = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minprice) {
                minprice = prices[i];
            } else if (prices[i] - minprice > maxprice) {
                maxprice = prices[i] - minprice;
            }

        }
        return maxprice;
    }


    /***
     *
     *    思路:
     *        1.时间复杂度为O(N^2)
     *        2.空间复杂度为O(1)
     *        3. 暴力求解，运行超时，二层for循环，执行效率略低
     *
     * @param prices
     * @return
     */
    public int maxProfit(int[] prices) {

        int sum = 0;

        for (int i = 0; i < prices.length - 1; i++) {

            for (int j = i + 1; j < prices.length; j++) {

                int max = prices[j] - prices[i];

                if (max > sum) {
                    sum = max;
                }

            }

        }
        return sum;
    }
}
