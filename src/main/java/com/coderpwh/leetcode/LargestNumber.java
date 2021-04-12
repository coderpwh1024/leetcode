package com.coderpwh.leetcode;

/**
 * @author coderpwh
 */
public class LargestNumber {


    public static void main(String[] args) {


        //  9534330
//        int nums[] = {3, 30, 34, 5, 9};

//        int nums[] = {10, 2};

        int nums[] = {10, 2, 9, 39, 17};

        LargestNumber number = new LargestNumber();
        number.largestNumber(nums);
        System.out.println(number.largestNumber(nums));


    }



    public String largestNumber(int[] nums) {
        StringBuilder sb = new StringBuilder();


        for (int i = 0; i < nums.length - 1; i++) {

            for (int j = i + 1; j < nums.length; j++) {

                String str1 = "" + nums[j] + nums[i];
                String str2 = "" + nums[i] + nums[j];

                if (Long.parseLong(str1) > Long.parseLong(str2)) {
                    Integer temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }

            }
        }


        if (nums[0] == 0) {
            return "0";
        }

        for (int i = 0; i < nums.length; i++) {
            sb.append(nums[i]);
        }
        return sb.toString();
    }


}
