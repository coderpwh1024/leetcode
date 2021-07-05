package com.coderpwh.leetcode;

import java.util.HashMap;

/*****
 * 961. 重复 N 次的元素
 *在大小为 2N 的数组 A 中有 N+1 个不同的元素，其中有一个元素重复了 N 次。
 *
 * 返回重复了 N 次的那个元素。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：[1,2,3,3]
 * 输出：3
 * 示例 2：
 *
 * 输入：[2,1,2,5,3,2]
 * 输出：2
 * 示例 3：
 *
 * 输入：[5,1,5,2,5,3,5,4]
 * 输出：5
 *
 *
 */
public class RepeatedNTimes {

    public static void main(String[] args) {

        int nums[] = {2, 1, 2, 5, 3, 2};

        RepeatedNTimes times = new RepeatedNTimes();
        times.repeatedNTimes(nums);

    }


    /***
     *     思路:
     *        1. 时间复杂度为O(2N), 两次for循环遍历
     *        2. 空间复杂度为O(N)
     *        3. 主要用map和fox循环
     *
     *
     * @param nums
     * @return
     */
    public int repeatedNTimes(int[] nums) {

        int result = 0;

        int n = nums.length / 2;

        HashMap<Integer, Integer> map = new HashMap<>(n + 1);

        for (int i = 0; i < nums.length; i++) {

            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }

        }

        for (Integer count : map.keySet()) {
            if (map.get(count).equals(n)) {
                System.out.println(count);
                result = count;
            }
        }

        return result;

    }
    




}


