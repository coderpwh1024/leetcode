package com.coderpwh.leetcode;


/***
 *  给你一个数组 nums 和一个值 val，你需要 原地 移除所有数值等于 val 的元素，并返回移除后数组的新长度。
 *
 * 不要使用额外的数组空间，你必须仅使用 O(1) 额外空间并 原地 修改输入数组。
 *
 * 元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
 *
 *
 * 给定 nums = [3,2,2,3], val = 3,
 *
 * 函数应该返回新的长度 2, 并且 nums 中的前两个元素均为 2。
 *
 * 你不需要考虑数组中超出新长度后面的元素。
 *
 *
 *
 */
public class RemoveElement {

    public static int removeElement(int[] nums, int val) {

        if (nums == null || nums.length == 0) {
            return 0;
        }


        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[j] = nums[i];
                j++;
            }
        }


        for (int m = 0; m < nums.length; m++) {
            System.out.println(nums[m]);
        }


        return j;
    }


    /***
     *  衍生题
     *  {2, 0, 1, 2, 3, 0, 4, 2, 2, 2};
     *
     *  正确的顺序应该为
     *  「0，1，3，0，4，2，2，2，2，2」
     *
     *  在该数组中，如果目标val 参数为2 ，将该数组中所有为2全部移动到数组最末端，并且数组其他值保持不变
     *
     *
     * @param nums
     * @param val
     */
    public static  void test(int [] nums,int val){


         int i=0;
         int j=1;

         while (i<nums.length&&j<nums.length-1){
              if(nums[i]==val){
                  if(nums[j]==val){
                      int temp = nums[i];
                      j=j+1;
                      nums[i]=nums[j];
                      nums[j] = temp;
                  }else {
                      nums[i] = nums[j];
                      nums[j] = val;
                  }
              }
             i++;
             j++;
         }
        System.out.println(i-1);


         for(int m=0;m<nums.length;m++){
             System.out.println(nums[m]);
         }




    }



    public static void main(String[] args) {

//        int nums[] = {3, 2, 2, 3};

//        int nums[] = {2, 0, 1, 2, 3, 0, 4, 2, 2, 2};
        int nums[] = {2, 0, 1, 2, 3, 0, 4, 2, 2, 2};


//        removeElement(nums, 2);
        test(nums,2);


    }

}
