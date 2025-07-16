package com.coderpwh.leetcode;


/***
 * 238. 除自身以外数组的乘积
 * 中等
 * 相关标签
 * premium lock icon
 * 相关企业
 * 提示
 * 给你一个整数数组 nums，返回 数组 answer ，其中 answer[i] 等于 nums 中除 nums[i] 之外其余各元素的乘积 。
 *
 * 题目数据 保证 数组 nums之中任意元素的全部前缀元素和后缀的乘积都在  32 位 整数范围内。
 *
 * 请 不要使用除法，且在 O(n) 时间复杂度内完成此题。
 *
 *
 *
 * 示例 1:
 *
 * 输入: nums = [1,2,3,4]
 * 输出: [24,12,8,6]
 * 示例 2:
 *
 * 输入: nums = [-1,1,0,-3,3]
 * 输出: [0,0,9,0,0]
 *
 *
 * 提示：
 *
 * 2 <= nums.length <= 105
 * -30 <= nums[i] <= 30
 * 输入 保证 数组 answer[i] 在  32 位 整数范围内
 *
 *
 * 进阶：你可以在 O(1) 的额外空间复杂度内完成这个题目吗？（ 出于对空间复杂度分析的目的，输出数组 不被视为 额外空间。）
 */
public class ProductExceptSelf {


    public static void main(String[] args) {

        ProductExceptSelf product = new ProductExceptSelf();
        int[] nums = {1, 2, 3, 4};

//        int[] nums = {-1, 1, 0, -3, 3};

        int[] result = product.productExceptSelf(nums);
        if (result.length > 0) {
            for (int i = 0; i < result.length; i++) {
                System.out.print(result[i] + " ");
            }
        }
    }


    /***
     * 1. 时间复杂度为O(n^2)
     * 2. 空间复杂度为O(n)
     *
     *
     * @param nums
     * @return
     */
    /*public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];

        for(int i=0;i<nums.length;i++){
            int temp = 1;
            for(int j=0;j<nums.length;j++){
                if(i==j){
                    continue;
                }else{
                    temp *= nums[j];
                }
            }
            result[i] = temp;
        }
       return  result;
    }*/
    public int[] productExceptSelf(int nums[]) {

        int length = nums.length;

        int[] L = new int[length];
        int[] R = new int[length];

        int[] answer = new int[length];

        L[0] = 1;

        for (int i = 1; i < length; i++) {
            L[i] = nums[i - 1] * L[i - 1];
        }

        R[length - 1] = 1;

        for (int i = length - 2; i >= 0; i--) {
            R[i] = nums[i + 1] * R[i + 1];
        }

        for (int i = 0; i < length; i++) {
            answer[i] = L[i] * R[i];
        }

        return answer;
    }


}
