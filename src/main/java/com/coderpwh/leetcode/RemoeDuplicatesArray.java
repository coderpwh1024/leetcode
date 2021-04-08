package com.coderpwh.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author coderpwh
 */
public class RemoeDuplicatesArray {


    public static void main(String[] args) {


//        int nums[] = {1, 1, 1, 2, 2, 3};

        int nums[] = {1, 1, 1, 2, 2, 3};


        RemoeDuplicatesArray array = new RemoeDuplicatesArray();
//        array.removeDuplicates(nums);
//        array.test(nums);

        System.out.println(array.test(nums));

    }


    public int test(int[] nums) {

        int n = nums.length;

        if (n <= 2) {
            return n;
        }

        int fast = 2;
        int slow = 2;

        while (fast < n) {

            if (nums[slow - 2] != nums[fast]) {

                nums[slow] = nums[fast];
                ++slow;
            }
            ++fast;
        }
        return slow;
    }


    /***
     *     思路:
     *        1. 时间复杂度为O(N)
     *        2. 空间复杂度为O(N) 创建了Map集合
     *        3. 里面map虽然可以除去部分值，违背了空间复杂度为O(1)的原则
     *
     * @param nums
     * @return
     */
    public int removeDuplicates(int[] nums) {


        Integer count = 0;

        Map<Integer, Integer> map = new HashMap<>(nums.length);

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i]) && map.get(nums[i]) <= 1) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else if (!map.containsKey(nums[i])) {
                map.put(nums[i], 1);
            }
        }

        for (Integer a : map.keySet()) {
            System.out.println("key:" + a + "  value:" + map.get(a));
            count += map.get(a);
        }
        return count;

    }


}
