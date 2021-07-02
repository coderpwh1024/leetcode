package com.coderpwh.leetcode;

import java.util.Arrays;

public class MaxIceCream {

    public static void main(String[] args) {


    /*
        int arr[] = {1, 3, 2, 4, 1};
        int coins = 7;

        */


//     int  arr[]={10,6,8,7,7,8};
//     int coins = 5;

//        costs = [1,6,3,1,2,5], coins = 20

        int arr[] = {1, 6, 3, 1, 2, 5};
        int coins = 20;


        MaxIceCream max = new MaxIceCream();
        max.maxIceCream(arr, coins);


    }


    /***
     *     思路:
     *       1. 时间复杂度为O(NlogN),数组排序与遍历
     *       2. 空间复杂度为(logn)
     *       3. 利用排序方式与遍历即可以解决
     *
     *
     * @param costs
     * @param coins
     * @return
     */
    public int maxIceCream(int[] costs, int coins) {

        Arrays.sort(costs);

        int count = 0;

        for (int i = 0; i < costs.length; i++) {
            if (costs[i] <= coins) {
                coins = coins - costs[i];
                count++;
            }

        }
        return count;
    }


}

