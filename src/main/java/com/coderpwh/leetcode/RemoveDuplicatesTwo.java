package com.coderpwh.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * 26. 删除有序数组中的重复项
 * <p>
 * 示例 1：
 * <p>
 * 输入：nums = [1,1,2]
 * 输出：2, nums = [1,2,_]
 * 解释：函数应该返回新的长度 2 ，并且原数组 nums 的前两个元素被修改为 1, 2 。不需要考虑数组中超出新长度后面的元素。
 * 示例 2：
 * <p>
 * 输入：nums = [0,0,1,1,1,2,2,3,3,4]
 * 输出：5, nums = [0,1,2,3,4]
 * 解释：函数应该返回新的长度 5 ， 并且原数组 nums 的前五个元素被修改为 0, 1, 2, 3, 4 。不需要考虑数组中超出新长度后面的元素。
 *
 * @author coderpwh
 * @date 2023/10/26 10:34
 */
public class RemoveDuplicatesTwo {

    public static void main(String[] args) {

        int arr[] = {1, 1, 2};

        RemoveDuplicatesTwo removeDuplicatesTwo = new RemoveDuplicatesTwo();
        Integer result = removeDuplicatesTwo.removeDuplicates(arr);
        System.out.println(result);
    }

    public int removeDuplicates(int[] nums) {

        if (nums == null || nums.length <= 0) {
            return 0;
        }

        int p = 0;
        int q = 1;

        while (q < nums.length) {

            if (nums[p] != nums[q]) {
                nums[p + 1] = nums[q];
                p++;
            }
            q++;
        }
        return p + 1;
    }

}
