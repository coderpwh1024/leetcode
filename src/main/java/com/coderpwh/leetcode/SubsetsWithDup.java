package com.coderpwh.leetcode;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *  90 子集II
 *
 *  给你一个整数数组 nums ，其中可能包含重复元素，请你返回该数组所有可能的子集（幂集）。
 *
 * 解集 不能 包含重复的子集。返回的解集中，子集可以按 任意顺序 排列。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：nums = [1,2,2]
 * 输出：[[],[1],[1,2],[1,2,2],[2],[2,2]]
 * 示例 2：
 *
 * 输入：nums = [0]
 * 输出：[[],[0]]
 *
 *
 *
 * @author coderpwh
 */
public class SubsetsWithDup {

    List<Integer> t = new ArrayList<>();
    List<List<Integer>> ans = new ArrayList<>();


    public static void main(String[] args) {


        int[] nums = {1, 2, 2};
        // {} {1} {1,2} {1,2,2} {2} {2,2}

        SubsetsWithDup sub = new SubsetsWithDup();
        sub.subsetsWithDup(nums);

    }


    /***
     *    思路:
     *      1: 时间复杂度为O(N^2)
     *      2: 空间复杂度为O(N)
     *      3: 主要采用递归方式实现
     *
     *
     * @param nums
     * @return
     */
    public List<List<Integer>> subsetsWithDup(int[] nums) {

        Arrays.sort(nums);
        dfs(false, 0, nums);

        for (List<Integer> list : ans) {
            System.out.println(list);
        }
        return ans;
    }


    public void dfs(boolean choosePre, int cur, int[] nums) {
        if (cur == nums.length) {
            ans.add(new ArrayList<Integer>(t));
            return;
        }
        dfs(false, cur + 1, nums);
        if (!choosePre && cur > 0 && nums[cur - 1] == nums[cur]) {
            return;
        }
        t.add(nums[cur]);
        dfs(true, cur + 1, nums);
        t.remove(t.size() - 1);
    }


}
