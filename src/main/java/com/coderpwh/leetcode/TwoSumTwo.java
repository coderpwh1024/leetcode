package com.coderpwh.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * LCR 179. 查找总价格为目标值的两个商品
 * <p>
 * 购物车内的商品价格按照升序记录于数组 price。
 * 请在购物车中找到两个商品的价格总和刚好是 target。
 * 若存在多种情况，返回任一结果即可。
 * <p>
 * 示例 1：
 * <p>
 * 输入：price = [3, 9, 12, 15], target = 18
 * 输出：[3,15] 或者 [15,3]
 * 示例 2：
 * <p>
 * 输入：price = [8, 21, 27, 34, 52, 66], target = 61
 * 输出：[27,34] 或者 [34,27]
 *
 * @author coderpwh
 * @date 2023/10/11 10:15
 */
public class TwoSumTwo {


    public static void main(String[] args) {

        int[] price = {3, 9, 12, 15};
        int target = 18;

        TwoSumTwo sum = new TwoSumTwo();
        int[] arr = sum.twoSum(price, target);

        if (arr != null && arr.length > 0) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }

    }


    public int[] twoSum(int[] price, int target) {

        int[] arr = new int[2];

        for (int i = 0; i < price.length; i++) {

            for (int j = i + 1; j < price.length; j++) {
                if (target == price[i] + price[j]) {
                    arr[0] = price[i];
                    arr[1] = price[j];
                }
            }
        }
        return arr;
    }

}
