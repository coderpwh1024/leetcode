package com.coderpwh.leetcode;


/***
 * 面试题 17.04. 消失的数字
 * 提示
 * 简单
 * 121
 * 相关企业
 * 数组nums包含从0到n的所有整数，但其中缺了一个。请编写代码找出那个缺失的整数。你有办法在O(n)时间内完成吗？
 *
 * 注意：本题相对书上原题稍作改动
 *
 * 示例 1：
 *
 * 输入：[3,0,1]
 * 输出：2
 *
 *
 * 示例 2：
 *
 * 输入：[9,6,4,2,3,5,7,0,1]
 * 输出：8
 */
public class MissingNumber2 {

    public static void main(String[] args) {

        int arr[] = {9, 6, 4, 2, 3, 5, 7, 0, 1};

        MissingNumber2 number = new MissingNumber2();
        int result = number.missingNumber(arr);
        System.out.println(result);

    }

    public int missingNumber(int[] nums) {

        return -1;
    }

}
