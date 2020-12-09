package com.coderpwh.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * 有序数组中出现次数超过25%的元素
 * <p>
 * 给你一个非递减的 有序 整数数组，已知这个数组中恰好有一个整数，它的出现次数超过数组元素总数的 25%。
 * <p>
 * 请你找到并返回这个整数
 * <p>
 *  
 * <p>
 * 示例：
 * <p>
 * 输入：arr = [1,2,2,6,6,6,6,7,10]
 * 输出：6
 *  
 * <p>
 * 提示：
 * <p>
 * 1 <= arr.length <= 10^4
 * 0 <= arr[i] <= 10^5
 *
 * @author coderpwh
 */
public class FindSpecialInteger {

    public static void main(String[] args) {

        int arr[] = {1, 2, 2, 6, 6, 6, 6, 7, 10};

        FindSpecialInteger find = new FindSpecialInteger();
//        find.findSpecialInteger(arr);
//        System.out.println(find.findSpecialInteger(arr));

        System.out.println(find.test(arr));
    }


    /***
     *    1：运用整形int的特点，避免转换，丢失精确度
     *    2：时间复杂度为O(N)
     *    3: 空间复杂度为O(1)
     * @param arr
     * @return
     */
    public int test(int[] arr) {

        int length = arr.length;

        int cur = arr[0];

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == cur) {
                ++count;

                if (count * 4 > length) {
                    return cur;
                }
            } else {
                cur = arr[i];
                count = 1;
            }

        }

        return -1;

    }


    public int findSpecialInteger(int[] arr) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {

            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }

        for (Integer key : map.keySet()) {

            double b = map.get(key);
            double a = b / arr.length;
            System.out.println(a);
            if (a > 0.25) {
                return key;
            }
        }

        return 0;
    }


}
