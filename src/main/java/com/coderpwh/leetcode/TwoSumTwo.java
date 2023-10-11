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

//        int[] price = {8, 21, 27, 34, 52, 66};
//        int target = 61;

        TwoSumTwo sum = new TwoSumTwo();
        int[] arr = sum.twoSumSearch(price, target);

        if (arr != null && arr.length > 0) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }

        System.out.println();
        int[] arrs = sum.twoSunByTwoPoint(price, target);

        if (arrs != null && arrs.length > 0) {
            for (int i = 0; i < arrs.length; i++) {
                System.out.print(arrs[i] + " ");
            }
        }

    }


    /***
     *  二分查找
     *  1. 时间复杂度为O(NLogN)
     *  2. 空间复杂度为O(1)
     *  3.
     *
     * @param price
     * @param target
     * @return
     */
    public int[] twoSumSearch(int[] price, int target) {

        for (int i = 0; i < price.length; i++) {
            int l = 0;
            int r = price.length - 1;

            while (l < r) {
                int mid = (l + r) / 2;
                if (target - price[i] <= price[mid]) {
                    r = mid;
                } else {
                    l = mid + 1;
                }
            }
            if (price[l] == target - price[i]) {
                return new int[]{price[l], price[i]};
            }
        }
        return new int[]{};
    }


    /***
     * 1. 时间复杂度为O(N)
     * 2. 双指针方式
     * @param price
     * @param target
     * @return
     */
    public int[] twoSunByTwoPoint(int[] price, int target) {

        int i = 0;
        int j = price.length - 1;

        while (i < j) {
            int s = price[i] + price[j];

            if (target > s) {
                i++;
            } else if (target < s) {
                j--;
            } else {
                return new int[]{price[i], price[j]};
            }
        }
        return new int[0];

    }


    /***
     *
     * 1. 时间复杂度为O(N^2)
     * 2. 空间复杂度为O(N)
     *
     * @param price
     * @param target
     * @return
     */
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
