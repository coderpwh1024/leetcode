package com.coderpwh.leetcode;

/**
 * LCR
 * 128. 库存管理 I
 * <p>
 * 仓库管理员以数组 stock 形式记录商品库存表。stock[i] 表示商品 id，可能存在重复。
 * 原库存表按商品 id 升序排列。
 * 现因突发情况需要进行商品紧急调拨，管理员将这批商品 id 提前依次整理至库存表最后。
 * 请你找到并返回库存表中编号的 最小的元素 以便及时记录本次调拨。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入：stock = [4,5,8,3,4]
 * 输出：3
 * 示例 2：
 * <p>
 * 输入：stock = [5,7,9,1,2]
 * 输出：1
 *
 * @author coderpwh
 * @date 2023/9/26 15:06
 */
public class StockManagement {

    public static void main(String[] args) {

//        int arr[] = {4, 5, 8, 3, 4};

        int arr[] = {5, 7, 9, 1, 2};

        StockManagement stock = new StockManagement();

        //
        Integer result = stock.stockManagement(arr);

        System.out.println(result);

    }


    /***
     *
     * @param stock
     * @return
     */
    public int stockManagement(int[] stock) {

        Integer min = stock[0];
        for (int i = 0; i < stock.length; i++) {

            min = Math.min(min, stock[i]);
        }

        return min;
    }

}
