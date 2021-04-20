package com.coderpwh.leetcode;


/**
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
