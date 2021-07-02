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
