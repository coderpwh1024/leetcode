 package com.coderpwh.leetcode;


/***
 *
 *符合下列属性的数组 arr 称为 山脉数组 ：
 * arr.length >= 3
 * 存在 i（0 < i < arr.length - 1）使得：
 * arr[0] < arr[1] < ... arr[i-1] < arr[i]
 * arr[i] > arr[i+1] > ... > arr[arr.length - 1]
 * 给你由整数组成的山脉数组 arr ，返回任何满足 arr[0] < arr[1] < ... arr[i - 1] < arr[i] > arr[i + 1] > ... > arr[arr.length - 1] 的下标 i 。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：arr = [0,1,0]
 * 输出：1
 * 示例 2：
 *
 * 输入：arr = [0,2,1,0]
 * 输出：1
 * 示例 3：
 *
 * 输入：arr = [0,10,5,2]
 * 输出：1
 * 示例 4：
 *
 * 输入：arr = [3,4,5,1]
 * 输出：2
 * 示例 5：
 *
 * 输入：arr = [24,69,100,99,79,78,67,36,26,19]
 * 输出：2
 */

public class PeakIndexInMountainArray {

    public static void main(String[] args) {


        int arr[] = {24, 69, 100, 99, 79, 78, 67, 36, 26, 19};

        PeakIndexInMountainArray array = new PeakIndexInMountainArray();
//        array.peakIndexInMountainArray(arr);

        System.out.println(array.peakIndexInMountainArray(arr));

    }


    /***
     *   思路:
     *      1. 时间复杂度为O(N)
     *      2. 空间复杂度为O(1)
     *      3. 找出最大值既可以解决
     *
     *
     *
     * @param arr
     * @return
     */
    public int peakIndexInMountainArray(int arr[]) {


        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }


        for (int i = 0; i < arr.length; i++) {
            if (max == arr[i]) {
                return i;
            }
        }

        return 0;
    }

}
