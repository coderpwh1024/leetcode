package com.coderpwh.leetcode;

import java.util.Deque;
import java.util.LinkedList;

/***
 * 496. 下一个更大元素 I
 * 
 *给定两个 没有重复元素 的数组 nums1 和 nums2 ，其中nums1 是 nums2 的子集。找到 nums1 中每个元素在 nums2 中的下一个比其大的值。
 *
 * nums1 中数字 x 的下一个更大元素是指 x 在 nums2 中对应位置的右边的第一个比 x 大的元素。如果不存在，对应位置输出 -1 。
 *
 *  
 *
 * 示例 1:
 *
 * 输入: nums1 = [4,1,2], nums2 = [1,3,4,2].
 * 输出: [-1,3,-1]
 * 解释:
 *     对于num1中的数字4，你无法在第二个数组中找到下一个更大的数字，因此输出 -1。
 *     对于num1中的数字1，第二个数组中数字1右边的下一个较大数字是 3。
 *     对于num1中的数字2，第二个数组中没有下一个更大的数字，因此输出 -1。
 * 示例 2:
 *
 * 输入: nums1 = [2,4], nums2 = [1,2,3,4].
 * 输出: [3,-1]
 * 解释:
 *     对于 num1 中的数字 2 ，第二个数组中的下一个较大数字是 3 。
 *     对于 num1 中的数字 4 ，第二个数组中没有下一个更大的数字，因此输出 -1 。
 *
 */
public class NextGreaterElement {

    public static void main(String[] args) {

//        int[] nums1 = {4, 1, 2};
//        int[] nums2 = {1, 3, 4, 2};
        // -1 3 -1


//        int[] nums1 = {2,4};
//        int[] nums2 = {1, 2,3,4};


        int[] nums1 = {1, 3, 5, 2, 4};
        int[] nums2 = {6, 5, 4, 3, 2, 1, 7};
//       [7,7,7,7,7]

//        [1,3,5,2,4]
//        [6,5,4,3,2,1,7]


        //  -1 3 -1
        NextGreaterElement next = new NextGreaterElement();
        next.nextGreaterElement(nums1, nums2);

    }


    /*****
     *      思路:
     *         1. 时间复杂度为O(N^2) N1*N2 ,双层循环，消耗时间略长
     *         2. 空间复杂度为O(N1),N1为数组nums1的长度
     *         3. 主要借助了栈的应用接口与类Deque，LinkedList
     *         4. 不难但并非最优或者高效解法
     *
     *
     * @param nums1
     * @param nums2
     * @return
     */
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Deque deque = new LinkedList<Integer>();


        int arr[] = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {
            deque.push(nums1[i]);
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            int a = (Integer) deque.peek();

            int b = -1;
            for (int j = 0; j < nums2.length; j++) {
                if (nums2[j]==a) {
                    b = j;
                }
            }

            for (int j = 0; j < nums2.length; j++) {
                if ((nums2[j] > a) && (j > b)) {
                    arr[i] = nums2[j];
                    deque.pop();
                    break;
                }
                if (j == nums2.length - 1) {
                    arr[i]=-1;
                    deque.pop();
                }
            }


        }


        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        return arr;
    }





}
