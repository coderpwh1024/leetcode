package com.coderpwh.leetcode;

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


    public int test(int[] nums) {

        int length = nums.length;


        if (length == 1) {
            return nums[0];
        } else if (length == 2) {
            return Math.max(nums[0], nums[1]);
        }

        return Math.max(robRange(nums, 0, length - 2), robRange(nums, 1, length - 1));
    }


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
