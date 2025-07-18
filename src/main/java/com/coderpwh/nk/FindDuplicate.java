package com.coderpwh.nk;


import java.util.HashSet;
import java.util.Set;

/***
 * nums = [3,1,3,4,2]
 */
public class FindDuplicate {

    public static void main(String[] args) {

        int[] nums = {3, 1, 3, 4, 2};

//        int[] nums = {1,3,4,2,2};

        FindDuplicate find = new FindDuplicate();
//        int result = find.findDuplicate(nums);
//
//        System.out.println(result);
        System.out.println("-------------------------------");

        int resultTwo  = find.findDuplicateOne(nums);
        System.out.println(resultTwo);

    }


    public int findDuplicateOne(int[] nums) {

        int left = 0;
        int right = nums.length - 1;
        int ans = -1;

        while (left <= right){
            int mid = (left + right) / 2;
            int count = 0;
            for (int num : nums) {
                if (num <= mid) {
                    count++;
                }
            }
            if (count > mid) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }


    public int findDuplicate(int[] nums) {
        Set<Integer> set = new HashSet();
        int result = -1;
        for (int num : nums) {
            if (set.contains(num)) {
                result = num;
            } else {
                set.add(num);
            }
        }
        return result;
    }

}
