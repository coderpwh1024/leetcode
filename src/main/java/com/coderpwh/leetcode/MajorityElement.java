package com.coderpwh.leetcode;


import java.util.HashMap;

/****
 *
 *  多数元素
 * 给定一个大小为 n 的数组，找到其中的多数元素。多数元素是指在数组中出现次数大于 ⌊ n/2 ⌋ 的元素。
 *
 * 你可以假设数组是非空的，并且给定的数组总是存在多数元素。
 *
 *  
 *
 * 示例 1:
 *
 * 输入: [3,2,3]
 * 输出: 3
 * 示例 2:
 *
 * 输入: [2,2,1,1,1,2,2]
 * 输出: 2
 *
 *
 */
public class MajorityElement {


    public static void main(String[] args) {

//        int[] nums = {2, 2, 1, 1, 1, 2, 2};
//        int [] nums = {3,2,3};

        int[] nums = {1, 2, 5, 9, 5, 9, 5, 5, 5};

        MajorityElement element = new MajorityElement();
        System.out.println(element.majorityElement(nums));
    }


    /***
     *
     *     思路:
     *        1. 时间复杂度为O(N)
     *        2. 空间复杂度为O(1)
     *        3. 利用哈希 进行遍历实现
     *
     *
     *
     * @param nums
     * @return
     */
    public int majorityElement(int[] nums) {

        int sum = nums.length / 2;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }

        for (Integer key : map.keySet()) {
            if (map.get(key) > sum) {
                return key;
            }
        }
        return -1;

    }

}
