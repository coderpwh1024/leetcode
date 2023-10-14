package com.coderpwh.leetcode;


import java.util.HashMap;

/***
 * 136. 只出现一次的数字
 *
 * 给你一个 非空 整数数组 nums ，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 *
 * 你必须设计并实现线性时间复杂度的算法来解决此问题，且该算法只使用常量额外空间。
 *
 *
 *
 * 示例 1 ：
 *
 * 输入：nums = [2,2,1]
 * 输出：1
 * 示例 2 ：
 *
 * 输入：nums = [4,1,2,1,2]
 * 输出：4
 * 示例 3 ：
 *
 * 输入：nums = [1]
 * 输出：1
 *
 */
public class SingleNumberTwo {
    public static void main(String[] args) {
         int[] nums={4,1,2,1,1,2};

        SingleNumberTwo number = new SingleNumberTwo();
        Integer result= number.singleNumber(nums);
        System.out.println(result);
    }


    /***
     * 1. 时间复杂度为O(N)
     * 2. 空间复杂度为O(N)
     * 3.  hash方式
     * @param nums
     * @return
     */
    public int singleNumber(int[] nums) {

        HashMap<Integer,Integer> map = new HashMap();

        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                int count =map.get(nums[i])+1;
                map.put(nums[i],count);
            }else{
                map.put(nums[i],1);
            }
        }

        for(Integer key:map.keySet()){
            if(map.get(key)<=1){
                return  key;
            }
        }


        return -1;
    }


}
