package com.coderpwh.leetcode;


/**
 * 121 买卖股票的最佳时机
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
