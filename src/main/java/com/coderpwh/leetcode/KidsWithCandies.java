package com.coderpwh.leetcode;


import java.util.*;

/**
 * 拥有最多糖果的孩子
 * <p>
 * 给你一个数组 candies 和一个整数 extraCandies ，其中 candies[i] 代表第 i 个孩子拥有的糖果数目。
 * <p>
 * 对每一个孩子，检查是否存在一种方案，将额外的 extraCandies 个糖果分配给孩子们之后，此孩子有 最多 的糖果。注意，允许有多个孩子同时拥有 最多 的糖果数目。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：candies = [2,3,5,1,3], extraCandies = 3
 * 输出：[true,true,true,false,true]
 * 解释：
 * 孩子 1 有 2 个糖果，如果他得到所有额外的糖果（3个），那么他总共有 5 个糖果，他将成为拥有最多糖果的孩子。
 * 孩子 2 有 3 个糖果，如果他得到至少 2 个额外糖果，那么他将成为拥有最多糖果的孩子。
 * 孩子 3 有 5 个糖果，他已经是拥有最多糖果的孩子。
 * 孩子 4 有 1 个糖果，即使他得到所有额外的糖果，他也只有 4 个糖果，无法成为拥有糖果最多的孩子。
 * 孩子 5 有 3 个糖果，如果他得到至少 2 个额外糖果，那么他将成为拥有最多糖果的孩子。
 * 示例 2：
 * <p>
 * 输入：candies = [4,2,1,1,2], extraCandies = 1
 * 输出：[true,false,false,false,false]
 * 解释：只有 1 个额外糖果，所以不管额外糖果给谁，只有孩子 1 可以成为拥有糖果最多的孩子。
 * 示例 3：
 * <p>
 * 输入：candies = [12,1,12], extraCandies = 10
 * 输出：[true,false,true]
 *  
 * <p>
 * 提示：
 * <p>
 * 2 <= candies.length <= 100
 * 1 <= candies[i] <= 100
 * 1 <= extraCandies <= 50
 *
 * @author coderpwh
 */
public class KidsWithCandies {

    public static void main(String[] args) {

//        int arr[] = {2, 3, 5, 1, 3};
//        int nums = 3;

        int arr[] = {12, 1, 12};
        int nums = 10;


        KidsWithCandies kid = new KidsWithCandies();
//        kid.kidsWithCandies(arr, nums);
        kid.test(arr,nums);

    }


    /****
     *     思路:
     *        1：时间复杂度为：O(N)
     *        2: 空间复杂度为: O(1)
     * @param candies
     * @param extraCandies
     * @return
     */
    public List<Boolean> test(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<>();

        int max = 0;

        for (int i = 0; i < candies.length; i++) {
            max = Math.max(max, candies[i]);
        }


        for (int i = 0; i < candies.length; i++) {
            list.add(candies[i] + extraCandies >=max);
        }


        for(int j=0;j<list.size();j++){
            System.out.print(list.get(j)+" ");
        }


        return list;


    }


    /***
     *    思路:
     *        1: 时间复杂度为:O(N^2)
     *        2:  空间复杂度为O(2)
     *
     *
     * @param candies
     * @param extraCandies
     * @return
     */
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<>();

        for (int i = 0; i < candies.length; i++) {
            Integer sum = candies[i] + extraCandies;
            boolean flag = true;
            for (int j = 0; j < candies.length; j++) {
                if (i != j) {
                    if (sum < candies[j]) {
                        flag = false;
                        break;
                    }
                }
            }
            list.add(flag);
        }

        for (int j = 0; j < list.size(); j++) {
            System.out.print(list.get(j) + " ");
        }
        return list;
    }


}
