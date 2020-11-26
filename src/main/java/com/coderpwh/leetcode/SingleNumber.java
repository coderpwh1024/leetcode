package com.coderpwh.leetcode;

/*****
 只出现一次的数字
 *
 *给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 *
 * 说明：
 *
 * 你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？
 *
 * 示例 1:
 *
 * 输入: [2,2,1]
 * 输出: 1
 * 示例 2:
 *
 * 输入: [4,1,2,1,2]
 * 输出: 4
 *
 *
 */
public class SingleNumber {


    public static void main(String[] args) {

        SingleNumber sing = new SingleNumber();

//        int nums[] = {4, 1, 2, 1, 2};

        int nums[] = {2,2,2,3};

//        int nums[] ={2,2,1};

        System.out.println(sing.singleCount(nums));

//        System.out.println(sing.test(nums));

    }


    public int test(int nums[]) {
        int single = 0;
        for (int num : nums) {
            single ^= num;
        }
        return single;
    }


    public int singleCount(int nums[]) {

        boolean flag = true;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {

            for (int j = nums.length - 1; j >= 0; j--) {
                if (i != j) {
                    if (nums[i] == nums[j]) {
                        flag = false;
                        break;
                    } else {
                        flag = true;
                    }
                }


            }

            if (flag) {
                count = nums[i];
                break;
            }
        }

        return count;
    }

}
