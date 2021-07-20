package com.coderpwh.leetcode;

import javax.print.attribute.standard.NumberUp;
import java.util.HashMap;
import java.util.Map;

/***
 * 找出数组中重复的数字。
 *
 *
 * 在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复了几次。请找出数组中任意一个重复的数字。
 *
 * 示例 1：
 *
 * 输入：
 * [2, 3, 1, 0, 2, 5, 3]
 * 输出：2 或 3 
 *  
 *
 * 限制：
 *
 * 2 <= n <= 100000
 *
 */
public class FindRepeatNumber {


    public static void main(String[] args) {


        int[] nums = {2, 3, 10, 2, 5, 3};

        FindRepeatNumber number = new FindRepeatNumber();
        number.findRepeatNumber(nums);

    }


    /***
     *     思路:
     *        1. 时间复杂度为O(N)
     *        2. 空间复杂度为O(N)
     *        3. 利用map与遍历方式实现
     *
     *
     * @param nums
     * @return
     */
    public int findRepeatNumber(int[] nums) {


        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }

        }


        for (Integer count : map.keySet()) {

            if (map.get(count) > 1) {
                System.out.println(count);
                return count;
            }
        }

        return 1;


    }


}
