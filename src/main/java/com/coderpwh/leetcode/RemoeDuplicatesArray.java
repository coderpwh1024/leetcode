package com.coderpwh.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * 80. 删除有序数组中的重复项 II
 * <p>
 * 给你一个有序数组 nums ，请你 原地 删除重复出现的元素，使每个元素 最多出现两次 ，返回删除后数组的新长度。
 * <p>
 * 不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
 * <p>
 *  
 * <p>
 * 说明：
 * <p>
 * 为什么返回数值是整数，但输出的答案是数组呢？
 * <p>
 * 请注意，输入数组是以「引用」方式传递的，这意味着在函数里修改输入数组对于调用者是可见的。
 * <p>
 * 你可以想象内部操作如下:
 * <p>
 * // nums 是以“引用”方式传递的。也就是说，不对实参做任何拷贝
 * int len = removeDuplicates(nums);
 * <p>
 * // 在函数里修改输入数组对于调用者是可见的。
 * // 根据你的函数返回的长度, 它会打印出数组中 该长度范围内 的所有元素。
 * for (int i = 0; i < len; i++) {
 *     print(nums[i]);
 * }
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：nums = [1,1,1,2,2,3]
 * 输出：5, nums = [1,1,2,2,3]
 * 解释：函数应返回新长度 length = 5, 并且原数组的前五个元素被修改为 1, 1, 2, 2, 3 。 不需要考虑数组中超出新长度后面的元素。
 * 示例 2：
 * <p>
 * 输入：nums = [0,0,1,1,1,1,2,3,3]
 * 输出：7, nums = [0,0,1,1,2,3,3]
 * 解释：函数应返回新长度 length = 7, 并且原数组的前五个元素被修改为 0, 0, 1, 1, 2, 3, 3 。 不需要考虑数组中超出新长度后面的元素。
 *
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


    /***
     *     思路:
     *        1: 时间复杂度为O(N)
     *        2：空间复杂度为O(1)
     *        3: 主要是利用双指针的方式，数组都是已经排序好，如果数组长度小于2则不用理会
     *        4：双指针主要是用对数组间隔为2的元素进行判断赋值实现
     *
     *
     * @param nums
     * @return
     */
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
