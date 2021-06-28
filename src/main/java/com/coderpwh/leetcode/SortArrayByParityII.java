package com.coderpwh.leetcode;

import java.util.ArrayList;
import java.util.List;


/***
 *给定一个非负整数数组 A， A 中一半整数是奇数，一半整数是偶数。
 *
 * 对数组进行排序，以便当 A[i] 为奇数时，i 也是奇数；当 A[i] 为偶数时， i 也是偶数。
 *
 * 你可以返回任何满足上述条件的数组作为答案。
 *
 示例：

 输入：[4,2,5,7]
 输出：[4,5,2,7]
 解释：[4,7,2,5]，[2,5,4,7]，[2,7,4,5] 也会被接受。
 *
 *
 *
 *
 */
public class SortArrayByParityII {

    public static void main(String[] args) {


        //  4 ，5 ，2，7
        int nums[] = {4, 2, 5, 7};

//        int nums[] = {4, 1, 2, 1};
        SortArrayByParityII sort = new SortArrayByParityII();
        sort.sortArrayByParityII(nums);

        sort.test(nums);

    }


    /***
     *    思路:
     *       1. 时间复杂度为O(logN)
     *       2. 空间复杂度为O(N)，定义了3个未知大小的集合
     *       3. for循环区分开奇偶数，算法效率不够高
     *
     *
     * @param nums
     * @return
     */
    public int[] sortArrayByParityII(int[] nums) {


        int arr[] = new int[nums.length];


        List<Integer> list = new ArrayList<>();
        List<Integer> date = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {

            if (nums[i] % 2 == 0) {
                list.add(nums[i]);
            } else {
                date.add(nums[i]);
            }
        }


        int count = 0;
        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                arr[i] = list.get(count);
                ++count;
            } else {
                arr[i] = date.get(num);
                ++num;
            }

        }
        return arr;
    }


    public int[] test(int nums[]) {

        int n = nums.length;

        int j = 1;

        for (int i = 0; i < n; i += 2) {

            if (nums[i] % 2 == 1) {

                while (nums[j] % 2 == 1) {
                    j += 2;
                }
                swap(nums, i, j);
            }
        }


        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
        return nums;

    }

    public void swap(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }


}


