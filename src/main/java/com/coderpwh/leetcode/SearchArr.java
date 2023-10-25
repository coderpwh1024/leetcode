package com.coderpwh.leetcode;

/**
 * 面试题 10.03. 搜索旋转数组
 * <p>
 * 搜索旋转数组。给定一个排序后的数组，包含n个整数，但这个数组已被旋转过很多次了，次数不详。
 * 请编写代码找出数组中的某个元素，假设数组元素原先是按升序排列的。
 * 若有多个相同元素，返回索引值最小的一个。
 * <p>
 * 示例1:
 * <p>
 * 输入: arr = [15, 16, 19, 20, 25, 1, 3, 4, 5, 7, 10, 14], target = 5
 * 输出: 8（元素5在该数组中的索引）
 * 示例2:
 * <p>
 * 输入：arr = [15, 16, 19, 20, 25, 1, 3, 4, 5, 7, 10, 14], target = 11
 * 输出：-1 （没有找到）
 * 提示:
 * <p>
 * arr 长度范围在[1, 1000000]之间
 *
 * @author coderpwh
 * @date 2023/10/25 10:22
 */
public class SearchArr {

    public static void main(String[] args) {

        int[] arr = {15, 16, 19, 20, 25, 1, 3, 4, 5, 7, 10, 14};

        int target = 5;

        SearchArr search = new SearchArr();
        search.search(arr, target)

    }

    public int search(int[] arr, int target) {


        return -1;
    }
}
