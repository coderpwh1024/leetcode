package com.coderpwh.leetcode;

import java.util.List;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 解压缩编码列表
 * 给你一个以行程长度编码压缩的整数列表 nums 。
 * <p>
 * 考虑每对相邻的两个元素 [freq, val] = [nums[2*i], nums[2*i+1]] （其中 i >= 0 ），每一对都表示解压后子列表中有 freq 个值为 val 的元素，你需要从左到右连接所有子列表以生成解压后的列表。
 * <p>
 * 请你返回解压后的列表。
 * <p>
 *  
 * <p>
 * 示例：
 * <p>
 * 输入：nums = [1,2,3,4]
 * 输出：[2,4,4,4]
 * 解释：第一对 [1,2] 代表着 2 的出现频次为 1，所以生成数组 [2]。
 * 第二对 [3,4] 代表着 4 的出现频次为 3，所以生成数组 [4,4,4]。
 * 最后将它们串联到一起 [2] + [4,4,4] = [2,4,4,4]。
 * 示例 2：
 * <p>
 * 输入：nums = [1,1,2,3]
 * 输出：[1,3,3]
 *
 * @author coderpwh
 */
public class DecompressRLElist {


    public static void main(String[] args) {
//        int nums[] = {1, 2, 3, 4, 5, 6};

        int nums[] = {1, 2, 3, 4};
//        int nums[] = {39, 86, 8, 96, 5, 25, 64, 10, 39, 15, 69, 40, 92, 22, 64, 31, 98, 4};

        DecompressRLElist decompressRLElist = new DecompressRLElist();
        decompressRLElist.decompressRLElist(nums);
    }

    public int[] decompressRLElist(int[] nums) {

        Map<Integer, Integer> map = new LinkedHashMap<>();

        Integer sum = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i = i + 2) {
            System.out.println("nums[i]:" + nums[i] + " ,  nums[i+1]:" + nums[i + 1]);
            sum += nums[i];
            for (int j = 1; j <= nums[i]; j++) {
                list.add(nums[i + 1]);
            }
        }
        int arr[] = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
            arr[i] = list.get(i);
        }
        return arr;
    }

}
