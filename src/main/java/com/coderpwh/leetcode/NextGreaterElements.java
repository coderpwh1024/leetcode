package com.coderpwh.leetcode;

import java.util.Stack;

/**
 * 503 下一个更大元素 II
 * 给定一个循环数组（最后一个元素的下一个元素是数组的第一个元素），输出每个元素的下一个更大元素。
 * 数字 x 的下一个更大的元素是按数组遍历顺序，这个数字之后的第一个比它更大的数，这意味着你应该循环地搜索它的下一个更大的数。如果不存在，则输出 -1。
 * <p>
 * 示例 1:
 * <p>
 * 输入: [1,2,1]
 * 输出: [2,-1,2]
 * 解释: 第一个 1 的下一个更大的数是 2；
 * 数字 2 找不到下一个更大的数；
 * 第二个 1 的下一个最大的数需要循环搜索，结果也是 2。
 *
 * @author coderpwh
 */
public class NextGreaterElements {

    public static void main(String[] args) {
        // 2 -1 2
//         int[] nums = {1,2,1};
        int[] nums = {1, 5, 3, 6, 8};
//        int[] nums = {5,4,3,2,1};


        NextGreaterElements nextGreaterElements = new NextGreaterElements();
//        nextGreaterElements.nextGreaterElements(nums);
        nextGreaterElements.test(nums);
    }


    /****
     *   思路:
     *     1：
     * 
     * 
     * @param nums
     * @return
     */
    public int[] test(int[] nums) {
        int[] arr = new int[nums.length];

        Stack<Integer> stack = new Stack<>();
        for (int i = 2 * nums.length - 1; i >= 0; i--) {
            while (!stack.empty() && nums[stack.peek()] <= nums[i % nums.length]) {
                stack.pop();
            }
            arr[i % nums.length] = stack.empty() ? -1 : nums[stack.peek()];
            stack.push(i % nums.length);
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        return arr;
    }


    /****
     *   思路:
     *      1:时间复杂度为O(N^2)
     *      2: 空间复杂度为O(N)
     *      3：未通过测试用例,未处理好数组的小标
     *
     *
     * @param nums
     * @return
     */
    public int[] nextGreaterElements(int[] nums) {
        int arr[] = new int[nums.length];
        Stack<Integer> stack = new Stack<>();

        for (int i = nums.length - 1; i >= 0; i--) {
            stack.push(nums[i]);
        }
        for (int i = 0; i < nums.length; i++) {

            for (int j = 0; j < nums.length; j++) {

                if (nums[j] > stack.peek() && j > i) {
                    arr[i] = nums[j];
                    stack.pop();
                    break;
                } else if (i == nums.length - 1 && nums[j] > stack.peek()) {
                    arr[i] = nums[j];
                    stack.pop();
                    break;
                }
                if (j == nums.length - 1) {
                    arr[i] = -1;
                    stack.pop();
                    break;
                }

            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }


        return arr;
    }

}
