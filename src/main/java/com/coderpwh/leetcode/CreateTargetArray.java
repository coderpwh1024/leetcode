package com.coderpwh.leetcode;

import java.util.HashSet;
import java.util.Set;

/****
 *
 * 给你两个整数数组 nums 和 index。你需要按照以下规则创建目标数组：
 *
 * 目标数组 target 最初为空。
 * 按从左到右的顺序依次读取 nums[i] 和 index[i]，在 target 数组中的下标 index[i] 处插入值 nums[i] 。
 * 重复上一步，直到在 nums 和 index 中都没有要读取的元素。
 * 请你返回目标数组。
 *
 * 题目保证数字插入位置总是存在。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：nums = [0,1,2,3,4], index = [0,1,2,2,1]
 * 输出：[0,4,1,3,2]
 * 解释：
 * nums       index     target
 * 0            0        [0]
 * 1            1        [0,1]
 * 2            2        [0,1,2]
 * 3            2        [0,1,3,2]
 * 4            1        [0,4,1,3,2]
 * 示例 2：
 *
 * 输入：nums = [1,2,3,4,0], index = [0,1,2,3,0]
 * 输出：[0,1,2,3,4]
 * 解释：
 * nums       index     target
 * 1            0        [1]
 * 2            1        [1,2]
 * 3            2        [1,2,3]
 * 4            3        [1,2,3,4]
 * 0            0        [0,1,2,3,4]
 * 示例 3：
 *
 * 输入：nums = [1], index = [0]
 * 输出：[1]
 *  
 *
 * 提示：
 *
 * 1 <= nums.length, index.length <= 100
 * nums.length == index.length
 * 0 <= nums[i] <= 100
 * 0 <= index[i] <= i
 *
 */
public class CreateTargetArray {


    public static void main(String[] args) {


//        int nums[] = {0, 1, 2, 3, 4};
//        int index[] = {0, 1, 2, 2, 1};

        int nums[] = {4, 2, 4, 3, 2};
        int index[] = {0, 0, 1, 3, 1};


        // 2 2 4 4 3
        CreateTargetArray create = new CreateTargetArray();
        create.createTargetArray(nums, index);
    }


    /***
     *    解题思路:
     *      1: 采用顺序表方式移动数组元素（主要是insert 方法）
     *      2：时间复杂度为O(N)
     *      3: 空间复杂度为O(N)
     *
     * @param nums
     * @param index
     * @return
     */
    public int[] createTargetArray(int[] nums, int[] index) {

        int result[] = new int[index.length];

        if (index.length != nums.length) {
            return null;
        }

        int i = 0;
        Set<Integer> set = new HashSet<>();
        while (i < index.length) {
            int a = index[i];
            set.add(a);
            if (!set.contains(a)) {
                result[a] = nums[i];
            } else {
                insert(a, nums[i], result);
            }
            i++;
        }


        for (int j = 0; j < result.length; j++) {
            System.out.print(result[j] + " ");
        }
        return result;
    }

    public void insert(int i, int obj, int[] result) {

        int j = result.length - 1;

        while (j > i) {
            result[j] = result[j - 1];
            j--;
        }
        result[i] = obj;

    }


}
