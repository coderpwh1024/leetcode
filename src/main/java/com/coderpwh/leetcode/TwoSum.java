package com.coderpwh.leetcode;

/****
 *
 *  两数之和 II - 输入有序数组
 *
 *给定一个已按照升序排列 的有序数组，找到两个数使得它们相加之和等于目标数。
 *
 * 函数应该返回这两个下标值 index1 和 index2，其中 index1 必须小于 index2。
 *
 * 说明:
 *
 * 返回的下标值（index1 和 index2）不是从零开始的。
 * 你可以假设每个输入只对应唯一的答案，而且你不可以重复使用相同的元素。
 * 示例:
 *
 * 输入: numbers = [2, 7, 11, 15], target = 9
 * 输出: [1,2]
 * 解释: 2 与 7 之和等于目标数 9 。因此 index1 = 1, index2 = 2 。
 *
 *
 *
 */
public class TwoSum {

    public static void main(String[] args) {

//        int nums[] = {2, 7, 11, 15};

        int nums[] = {2, 3, 4};

        TwoSum twoSum = new TwoSum();
        twoSum.twoSum(nums, 6);

        System.out.println("----------------------------");
        int[] arr = twoSum.test(nums, 6);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }


    }


    /*****
     *    1：二分法查找数组，利用了数组的有序性
     *    2： for 循环的时间复杂度为O(N)
     *     while 的时间复杂度为 logN ,整体的时间复杂度为 nlogn
     *      相对于暴力求解，时间上减少了不少
     *   3: 二分法 ，外循环固定其中一值，while 从数组中间遍历
     *
     *
     * @param numbers
     * @param target
     * @return
     */
    public int[] test(int[] numbers, int target) {

        for (int i = 0; i < numbers.length; ++i) {
            int low = i + 1, high = numbers.length - 1;
            while (low <= high) {
                int mid = (high - low) / 2 + low;
                if (numbers[mid] == target - numbers[i]) {
                    return new int[]{i + 1, mid + 1};
                } else if (numbers[mid] > target - numbers[i]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
        }
        return new int[]{-1, -1};
    }


    /****
     *
     *     双重for循环，时间复杂度为O(N^2)
     *     暴力解决，未用到数组的有序性
     *
     *
     * @param numbers
     * @param target
     * @return
     */
    public int[] twoSum(int[] numbers, int target) {

        int arr[] = new int[2];

        for (int i = 0; i < numbers.length; i++) {

            for (int j = i + 1; j <= numbers.length - 1; j++) {
                if (target == numbers[i] + numbers[j]) {
                    arr[0] = i + 1;
                    arr[1] = j + 1;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        return arr;
    }

}
