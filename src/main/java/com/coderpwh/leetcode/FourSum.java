package com.coderpwh.leetcode;

import java.lang.reflect.Array;
import java.util.*;

/**
 * 给定一个包含 n 个整数的数组 nums 和一个目标值 target，判断 nums 中是否存在四个元素 a，b，c 和 d ，使得 a + b + c + d 的值与 target 相等？找出所有满足条件且不重复的四元组。
 * <p>
 * 注意：
 * <p>
 * 答案中不可以包含重复的四元组。
 * <p>
 * 示例：
 * <p>
 * 给定数组 nums = [1, 0, -1, 0, -2, 2]，和 target = 0。
 * <p>
 * 满足要求的四元组集合为：
 * [
 * [-1,  0, 0, 1],
 * [-2, -1, 1, 2],
 * [-2,  0, 0, 2]
 * ]
 *
 * @author coderpwh
 */
public class FourSum {

    public static void main(String[] args) {


        int nums[] = {1, 0, -1, 0, -2, 2};
        int target = 0;


        FourSum fourSum = new FourSum();
        List<List<Integer>> list = fourSum.test(nums, target);


        for (List<Integer> li : list) {
            System.out.println(li);
        }


    }


    /***
     *
     *  方式一: 暴力求解，容易重复，时间复杂度为O(N^4)还有去重操作，方式未通过
     *  方式二:  双指针
     *
     * @param nums
     * @param target
     * @return
     */
    public List<List<Integer>> fourSum(int[] nums, int target) {


        HashSet<List<Integer>> set = new HashSet<>();
        List<List<Integer>> date = new ArrayList<>();


        for (int i = 0; i < nums.length; i++) {

            for (int j = 0; j < nums.length; j++) {
                for (int m = 0; m < nums.length; m++) {

                    for (int n = 0; n < nums.length; n++) {

                        if (nums[i] + nums[j] + nums[m] + nums[n] == target) {
                            List<Integer> list = new ArrayList<>();
                            list.add(nums[i]);
                            list.add(nums[j]);
                            list.add(nums[m]);
                            list.add(nums[n]);

                            list.sort(Comparator.reverseOrder());
                            if (!date.contains(list)) {
                                date.add(list);
                            }

                        }
                    }
                }

            }

        }
        return date;
    }



    public List<List<Integer>> test(int[] nums, int target) {

        List<List<Integer>> quadruplets = new ArrayList<>();

        if (nums == null || nums.length < 4) {
            return quadruplets;
        }
        Arrays.sort(nums);
        int length = nums.length;

        for (int i = 0; i < length - 3; i++) {

            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            if (nums[i] + nums[i + 1] + nums[i + 2] + nums[i + 3] > target) {
                break;
            }
            if (nums[i] + nums[length - 3] + nums[length - 2] + nums[length - 1] < target) {
                continue;
            }

            for (int j = i + 1; j < length - 2; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }
                if (nums[i] + nums[j] + nums[j + 1] + nums[j + 2] > target) {
                    break;
                }
                if (nums[i] + nums[j] + nums[length - 2] + nums[length - 1] < target) {
                    continue;
                }

                int left = j + 1, right = length - 1;

                while (left < right) {
                    int sum = nums[i] + nums[j] + nums[left] + nums[right];

                    if (sum == target) {
                        quadruplets.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                        while (left < right && nums[left] == nums[left + 1]) {
                            left++;
                        }
                        left++;
                        while (left < right && nums[right] == nums[right - 1]) {
                            right--;
                        }
                        right--;
                    } else if (sum < target) {
                        left++;
                    } else {
                        right--;
                    }
                }


            }


        }


        return quadruplets;
    }


}

