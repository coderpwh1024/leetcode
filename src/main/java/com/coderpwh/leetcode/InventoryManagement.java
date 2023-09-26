package com.coderpwh.leetcode;

/**
 * 仓库管理员以数组 stock 形式记录商品库存表。stock[i] 表示商品 id，
 * 可能存在重复。请返回库存表中数量大于 stock.length / 2 的商品 id。
 * <p>
 * 输入: stock = [6, 1, 3, 1, 1, 1]
 * 输出: 1
 *
 * @author coderpwh
 * @date 2023/9/26 15:28
 */
public class InventoryManagement {


    public static void main(String[] args) {

        int arr[] = {6, 1, 3, 1, 1, 1};

        InventoryManagement management = new InventoryManagement();
        Integer max = management.inventoryManagement(arr);
        System.out.println(max);
    }


    /***
     * 比较
     * @param stock
     * @return
     */
    public int inventoryManagement(int[] stock) {
        int max = stock.length / 2;
        int count = -1;

        for (int i = 0; i < stock.length; i++) {
            int temp = max;
            max = Math.max(max, stock[i]);
            if (temp != max) {
                count = i;
            }
        }

        return count;
    }


}
