package com.coderpwh.leetcode;

import java.util.*;
import java.util.stream.Collectors;

/**
 * 1299. 将每个元素替换为右侧最大元素
 * <p>
 * 给你一个数组 arr ，请你将每个元素用它右边最大的元素替换，如果是最后一个元素，用 -1 替换。
 * <p>
 * 完成所有替换操作后，请你返回这个数组。
 * <p>
 *  
 * <p>
 * 示例：
 * <p>
 * 输入：arr = [17,18,5,4,6,1]
 * 输出：[18,6,6,6,1,-1]
 *  
 * <p>
 * 提示：
 * <p>
 * 1 <= arr.length <= 10^4
 * 1 <= arr[i] <= 10^5
 *
 * @author coderpwh
 */
public class ReplaceElements {

    public static void main(String[] args) {

        int nums[] = {17, 18, 5, 4, 6, 1};

//        int nums[] = {56903,18666,60499,57517,26961};

        ReplaceElements replace = new ReplaceElements();

//        System.out.println(replace.replaceElements(nums));

//        replace.test(nums);

        replace.test2(nums);
    }


    /***
     *  1。采用数组逆序遍历
     *  逐步遍历rr[i+1} 与arr[i+2] .....
     *  2. 采用 nums[i] =Math.max(nums[i+1],arr[i+1])
     *   比较大小
     *  3. 整个时间复杂度为O(N)
     *  4. 空间复杂度为 O(1)
     *
     * @param arr
     * @return
     */
    public int[] test2(int[] arr) {
        int n = arr.length;
        int[] nums = new int[arr.length];
        nums[n - 1] = -1;

        for(int i=n-2;i>=0;--i){
            nums[i] = Math.max(nums[i+1],arr[i+1]);
        }

        for(int i=0;i<nums.length;++i){
            System.out.print(nums[i]+" ");
        }
        return nums;

    }


    /****
     *    1.多个for循环 时间复杂度为: 2*O(N)
     *    2. 用collections 排序与反转 增加了 时间复杂度 nlogn
     *    3.空间复杂度为O(2)
     *
     * @param arr
     * @return
     */
    public int[] test(int[] arr) {
        int nums[] = new int[arr.length];

        List<Integer> list = new ArrayList<>();
        for (int i = 1; i < arr.length; i++) {
            list.add(arr[i]);
        }

        Collections.sort(list);
        Collections.reverse(list);

        for (int i = 0; i < arr.length; i++) {

            if (i == arr.length - 1) {
                nums[i] = -1;
            } else {
                nums[i] = list.get(0);
                if (list.get(0) < arr[i + 1]) {
                    list.remove(0);
                } else {
                    Integer a = arr[i + 1];
                    list.remove(a);
                }

            }
        }

        return nums;
    }


    /***
     *   暴力方式：(超出时间限制)
     *     双重for循环
     *     时间复杂度为 O(N^2)+ N*(logn)
     *     总的时间复杂度为O(N^2)
     *
     * @param arr
     * @return
     */
    public int[] replaceElements(int[] arr) {

        int nums[] = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {

            List<Integer> list = new ArrayList<>();
            for (int j = i + 1; j < arr.length; j++) {
                list.add(arr[j]);
            }
            list.sort(Comparator.reverseOrder());
            if (i == arr.length - 1) {
                nums[i] = -1;
            } else {
                nums[i] = list.get(0);
            }

        }
        return nums;
    }


}
