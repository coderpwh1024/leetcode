package com.coderpwh.leetcode;

/**
 * 1470. 重新排列数组
 * 给你一个数组 nums ，数组中有 2n 个元素，按 [x1,x2,...,xn,y1,y2,...,yn] 的格式排列。
 * <p>
 * 请你将数组按 [x1,y1,x2,y2,...,xn,yn] 格式重新排列，返回重排后的数组。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：nums = [2,5,1,3,4,7], n = 3
 * 输出：[2,3,5,4,1,7]
 * 解释：由于 x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 ，所以答案为 [2,3,5,4,1,7]
 * 示例 2：
 * <p>
 * 输入：nums = [1,2,3,4,4,3,2,1], n = 4
 * 输出：[1,4,2,3,3,2,4,1]
 * 示例 3：
 * <p>
 * 输入：nums = [1,1,2,2], n = 2
 * 输出：[1,2,1,2]
 *
 * @author coderpwh
 */
public class Shuffle {

    public static void main(String[] args) {

//        int arr[] = {2, 5, 1, 3, 4, 7};
//        int n = 3;

//        int arr[]={1,2,3,4,4,3,2,1};
//        int n=4;

        int arr[] = {1, 1, 2, 2};
        int n = 2;


        /****
         *    2  5  1
         *    3  4  7
         *
         *    2 3 5 4 1 7
         *
         */
        Shuffle shuffle = new Shuffle();
        shuffle.shuffle(arr, n);
    }


    /****
     *    思路:
     *      1：空间复杂度为O(2N) 创建了2个长度为N的数组
     *      2: 时间复杂度为O(2N) 2次循环遍历
     *
     *
     * @param nums
     * @param n
     * @return
     */
    public int[] shuffle(int[] nums, int n) {

        if (n <= 1) {
            return nums;
        }

        int arr1[] = new int[n];
        int arr2[] = new int[n];

        for (int i = 0; i < nums.length; i++) {
            if (i < n) {
                arr1[i] = nums[i];
            } else {
                arr2[i - n] = nums[i];
            }
        }

        int t = 0;
        int j = 0;
        int m = 0;
        while (m < nums.length) {

            if (m % 2 == 0 && t < n) {
                nums[m] = arr1[t];
                t++;
            } else if (m % 2 != 0 && j < n) {
                nums[m] = arr2[j];
                j++;
            }
            m++;

        }

        return nums;
    }


}
