package com.coderpwh.leetcode;

import java.util.Arrays;

/**
 * 179. 最大数
 * 给定一组非负整数 nums，重新排列每个数的顺序（每个数不可拆分）使之组成一个最大的整数。
 * <p>
 * 注意：输出结果可能非常大，所以你需要返回一个字符串而不是整数。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：nums = [10,2]
 * 输出："210"
 * 示例 2：
 * <p>
 * 输入：nums = [3,30,34,5,9]
 * 输出："9534330"
 * 示例 3：
 * <p>
 * 输入：nums = [1]
 * 输出："1"
 * 示例 4：
 * <p>
 * 输入：nums = [10]
 * 输出："10"
 *
 * @author coderpwh
 */
public class LargestNumber {


    public static void main(String[] args) {


        //  9534330
//        int nums[] = {3, 30, 34, 5, 9};

//        int nums[] = {10, 2};

        int nums[] = {10, 2, 9, 39, 17};

        LargestNumber number = new LargestNumber();
        number.largestNumber(nums);
        System.out.println();
        System.out.println(number.test(nums));


    }


    /***
     *    先要按照最高位数从大到小的顺序排列，然后拼接
     *
     *     思路:
     *        1. 时间复杂度为O(N^2)
     *        2. 空间复杂度为O(N),创建了一个StringBuilder，可以扩容的字符串
     *        3. 主要是对数组里的数字按最高位及次高位排序，采用先字符拼接后转成Long比较，排序整个数组，最后拼接
     *           整体算法效率不够高
     *
     *
     * @param nums
     * @return
     */
    public String largestNumber(int[] nums) {
        StringBuilder sb = new StringBuilder();


        for (int i = 0; i < nums.length - 1; i++) {

            for (int j = i + 1; j < nums.length; j++) {

                String str1 = "" + nums[j] + nums[i];
                String str2 = "" + nums[i] + nums[j];

                if (Long.parseLong(str1) > Long.parseLong(str2)) {
                    Integer temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }

            }
        }


        if (nums[0] == 0) {
            return "0";
        }

        for (int i = 0; i < nums.length; i++) {
            sb.append(nums[i]);
        }
        return sb.toString();
    }


    public String test(int nums[]) {

        int n = nums.length;

        Integer[] numsArr = new Integer[n];

        for (int i = 0; i < n; i++) {
            numsArr[i] = nums[i];
        }
        Arrays.sort(numsArr, (x, y) -> {
            long sx = 10, sy = 10;
            while (sx <= x) {
                sx *= 10;
            }
            while (sy <= y) {
                sy *= 10;
            }
            return (int) (-sy * x - y + sx * y + x);
        });

        if (numsArr[0] == 0) {
            return "0";
        }

        StringBuilder ret = new StringBuilder();
        for (int num : numsArr) {
            ret.append(num);
        }
        return ret.toString();
    }


}


