package com.coderpwh.leetcode;

/****
 *   213 打家劫舍 II
 *
 *
 *你是一个专业的小偷，计划偷窃沿街的房屋，每间房内都藏有一定的现金。这个地方所有的房屋都 围成一圈 ，这意味着第一个房屋和最后一个房屋是紧挨着的。同时，相邻的房屋装有相互连通的防盗系统，如果两间相邻的房屋在同一晚上被小偷闯入，系统会自动报警 。
 *
 * 给定一个代表每个房屋存放金额的非负整数数组，计算你 在不触动警报装置的情况下 ，能够偷窃到的最高金额。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：nums = [2,3,2]
 * 输出：3
 * 解释：你不能先偷窃 1 号房屋（金额 = 2），然后偷窃 3 号房屋（金额 = 2）, 因为他们是相邻的。
 * 示例 2：
 *
 * 输入：nums = [1,2,3,1]
 * 输出：4
 * 解释：你可以先偷窃 1 号房屋（金额 = 1），然后偷窃 3 号房屋（金额 = 3）。
 *      偷窃到的最高金额 = 1 + 3 = 4 。
 * 示例 3：
 *
 * 输入：nums = [0]
 * 输出：0
 *
 *
 */
public class Rob {

    public static void main(String[] args) {


//        int nums[] = {1, 2, 3, 1};

//        int nums[] = {2, 3, 2};

//        int nums[] = {1, 2};
        int nums[] = {1, 3, 1, 3, 100};

        Rob rob = new Rob();
//        rob.rob(nums);
//        System.out.println(rob.rob(nums));

        System.out.println(rob.test(nums));

    }


    /***
     *    思路:
     *     1. 时间复杂度为O(N)
     *     2. 空间复杂度为O(1)
     *
     *
     *
     * @param nums
     * @return
     */
    public int test(int[] nums) {

        int length = nums.length;


        if (length == 1) {
            return nums[0];
        } else if (length == 2) {
            return Math.max(nums[0], nums[1]);
        }


        return Math.max(robRange(nums, 0, length - 2), robRange(nums, 1, length - 1));
    }


    /****
     *
     *   {1,3,1,3,100}  长度为5
     *
     *    结果为 103
     *
     *     nums , 0 , 3     -----  nums ,1 4
     *
     *
     * @param nums
     * @param start
     * @param end
     * @return
     */
    public int robRange(int[] nums, int start, int end) {

        int first = nums[start];

        int second = Math.max(nums[start], nums[start + 1]);

        for (int i = start + 2; i <= end; i++) {
            int temp = second;
            second = Math.max(first + nums[i], second);
            first = temp;
        }
        return second;
    }
    
    
    
    
    /***
     *     思路:
     *       1. 时间复杂度为O(N)
     *       2. 空间复杂度为O(1)
     *       3. 利用奇偶方式不通过
     *
     *
     *
     * @param nums
     * @return
     */
    public int rob(int[] nums) {

        int n = nums.length;

        if (n <= 1) {
            return nums[0];
        }

        int count = 0;
        int sum = 0;

        for (int i = 0; i < n; i++) {

            if (i % 2 == 0) {
                if (i == n - 1 && n > 2) {
                    continue;
                }
                count += nums[i];
            } else {
                sum += nums[i];
            }
        }

        if (sum > count) {
            return sum;
        } else {
            return count;
        }
    }


}
