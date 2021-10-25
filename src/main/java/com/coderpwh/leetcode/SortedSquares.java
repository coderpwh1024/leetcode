package com.coderpwh.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/****
 *
 *  977 有序数组的平方
 *
 * 给你一个按 非递减顺序 排序的整数数组 nums，返回 每个数字的平方 组成的新数组，要求也按 非递减顺序 排序。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：nums = [-4,-1,0,3,10]
 * 输出：[0,1,9,16,100]
 * 解释：平方后，数组变为 [16,1,0,9,100]
 * 排序后，数组变为 [0,1,9,16,100]
 * 示例 2：
 *
 * 输入：nums = [-7,-3,2,3,11]
 * 输出：[4,9,9,49,121]
 *
 *
 *
 */
public class SortedSquares {

    public static void main(String[] args) {


//        int[] nums = {-4, -1, 0, 3, 10};

        int[] nums = {-7, -3, 2, 3, 3, 11};


        // {0,1,9,16,100}
        SortedSquares sort = new SortedSquares();
        sort.sortedSquares(nums);
        System.out.println();
        sort.test(nums);


    }


    /***
     *     思路:
     *        1. 时间复杂度为O(NlogN),对数组长度为N进行遍历，并进行排序
     *        2. 空间复杂度为O(N),创建了大小为N的集合
     *        3. 数组遍历+排序
     * @param nums
     * @return
     */
    public int[] sortedSquares(int[] nums) {

        int[] arrr = new int[nums.length];

        List<Integer> list = new ArrayList<>(nums.length);


        for (int i = 0; i < nums.length; i++) {
            Integer temp = nums[i] * nums[i];
            list.add(temp);
        }

        Collections.sort(list);

        for (int i = 0; i < list.size(); i++) {
            arrr[i] = list.get(i);
            System.out.print(arrr[i] + " ");
        }

        return arrr;

    }


    /***
     *     思路:
     *        1. 时间复杂度为O(N)
     *        2.  空间复杂度为O(1)
     *        3.  利用双指针方式实现
     *
     *
     * @param nums
     * @return
     */
    public int[] test(int[] nums) {

        int n = nums.length;

        int[] ans = new int[nums.length];


        for (int i = 0, j = n - 1, pos = n - 1; i <= j; ) {

            if (nums[i] * nums[i] > nums[j] * nums[j]) {
                ans[pos] = nums[i] * nums[i];
                ++i;
            } else {
                ans[pos] = nums[j] * nums[j];
                --j;
            }
            --pos;

        }
        return ans;
    }


}
