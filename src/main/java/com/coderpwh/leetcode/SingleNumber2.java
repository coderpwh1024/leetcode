package com.coderpwh.leetcode;

import java.util.HashMap;
import java.util.Set;

/*****
 *   只出现一次的数字 II
 *
 *  给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现了三次。找出那个只出现了一次的元素。
 *
 * 说明：
 *
 * 你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？
 *
 * 示例 1:
 *
 * 输入: [2,2,3,2]
 * 输出: 3
 * 示例 2:
 *
 * 输入: [0,1,0,1,0,1,99]
 * 输出: 99
 *
 */
public class SingleNumber2 {

    public static void main(String[] args) {

//        int nums[] = {2, 2, 3, 2};
        int nums[] ={0,1,0,1,0,1,99};

        SingleNumber2 sing = new SingleNumber2();
        System.out.println(sing.singleNumber(nums));


    }


    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }

        for (Integer a : map.keySet()) {
            if (map.get(a) == 1) {
                return a;
            }
        }

        return 0;
    }


}
