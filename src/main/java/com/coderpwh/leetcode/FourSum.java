package com.coderpwh.leetcode;

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


    /****
     *   简单暴力方法
     *   nums[] 如果长度为n,则整个方法的时间复杂度为O(n^4)
     *
     *
     * @param nums
     * @param target
     * @return
     */
    public static List<List<Integer>> fourSum(int nums[], int target) {

        List<List<Integer>> date = new ArrayList<>();

        if (nums == null || nums.length < 4) {
            return date;
        }
        Set<Integer> first = new HashSet<>();
        Set<Integer> second = new HashSet<>();
        Set<Integer> third = new HashSet<>();


        for (int a = 0; a < nums.length - 3; a++) {

            if (!first.contains(nums[a])) {
                first.add(nums[a]);
                for (int b = a + 1; b < nums.length - 2; b++) {
                    if (!second.contains(nums[b])) {
                        second.contains(nums[b]);

                        for (int c = b + 1; c < nums.length - 1; c++) {
                            if (!third.contains(c)) {
                                third.add(nums[c]);
                                int sum = nums[a] + nums[b] + nums[c];

                                for (int d = c + 1; d < nums.length; d++) {

                                    if (sum + nums[d] == target) {
                                        List<Integer> list = new ArrayList<>(4);
                                        list.add(nums[a]);
                                        list.add(nums[b]);
                                        list.add(nums[c]);
                                        list.add(nums[d]);
                                        date.add(list);
                                        break;

                                    }
                                }
                            }


                        }

                    }

                }

            }


        }


        for (List<Integer> ilist : date) {
            System.out.println(ilist);
        }


        return date;
    }


    public List<List<Integer>> test(int nums[], int target) {
        return null;
    }


    public static void main(String[] args) {

        int nums[] = {1, 0, -1, 0, -2, 2};

        int target = 0;

        fourSum(nums, target);

    }


}
