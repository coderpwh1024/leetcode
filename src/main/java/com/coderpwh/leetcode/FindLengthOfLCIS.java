package com.coderpwh.leetcode;

/**
 * 674 最长连续递增序列
 * <p>
 * 给定一个未经排序的整数数组，找到最长且 连续递增的子序列，并返回该序列的长度。
 * <p>
 * 连续递增的子序列 可以由两个下标 l 和 r（l < r）确定，如果对于每个 l <= i < r，都有 nums[i] < nums[i + 1] ，那么子序列 [nums[l], nums[l + 1], ..., nums[r - 1], nums[r]] 就是连续递增子序列。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入：nums = [1,3,5,4,7]
 * 输出：3
 * 解释：最长连续递增序列是 [1,3,5], 长度为3。
 * 尽管 [1,3,5,7] 也是升序的子序列, 但它不是连续的，因为 5 和 7 在原数组里被 4 隔开。
 * 示例 2：
 * <p>
 * 输入：nums = [2,2,2,2,2]
 * 输出：1
 * 解释：最长连续递增序列是 [2], 长度为1。
 *
 * @author coderpwh
 */
public class FindLengthOfLCIS {


    public static void main(String[] args) {


//        int nums[] = {1, 3, 5, 4, 7};

        int nums[] = {1, 3, 5, 4, 1, 2, 3, 4, 5, 6, 7};

//        int nums[] = {2, 2, 2, 2, 2};

        FindLengthOfLCIS find = new FindLengthOfLCIS();
        find.findLengthOfLCIS(nums);
        System.out.println(find.findLengthOfLCIS(nums));
    }


    /***
     *    思路:
     *       1.时间复杂度为O(N)
     *       2.空间复杂度为O(1)
     *       3.主要是用贪心算法来实现的，连续递增序列要满足 nums[i]<nums[i+1]
     *        长度为n的数组 0<l<=r<n-1,范围[l,r]是递增
     *        则要满足 nums[l-1]<nums[l] ,nums[r-1]<nums[r]
     *        定义了变量start = 0; 起始位置，如果 nums[i]<=nums[i-1] 则不满足递增序列的特征
     *        重新开始记录位置下标
     *
     *
     *
     * @param nums
     * @return
     */

    public int findLengthOfLCIS(int[] nums) {

        int ans = 0;

        int n = nums.length;
        int start = 0;

        for (int i = 0; i < n; i++) {

            if (i > 0 && nums[i] <= nums[i - 1]) {
                start = i;
            }
            ans = Math.max(ans, i - start + 1);
        }
        return ans;
    }


}
