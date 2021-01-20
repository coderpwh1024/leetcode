package com.coderpwh.leetcode;

import java.io.Serializable;
import java.util.*;

/**
 * @author coderpwh
 */
public class MaximumProduct implements Serializable {

    public static void main(String[] args) {


//        int arr[] = {1, 2, 3, 4};

//        int arr[] = {1,0,100};

        int arr[] = {-1, -2, -3, -4};


//        int arr[] = {-100, -98, -1, 2, 3, 4};

        MaximumProduct max = new MaximumProduct();
//        max.maximumProduct(arr);
//        System.out.println(max.maximumProduct(arr));
        System.out.println(max.test(arr));

    }


    public int test(int[] nums) {

        Arrays.sort(nums);
        int n = nums.length;

        Integer count = Math.max(nums[0] * nums[1] * nums[n - 1], nums[n - 3] * nums[n - 2] * nums[n - 1]);

        return count;
    }

    public int maximumProduct(int[] nums) {
        Integer count = 1;

        Deque<Integer> deque = new LinkedList<>();
        Deque<Integer> statck = new LinkedList<>();

        int number = 0;

        Arrays.sort(nums);

        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] < 0 && (Math.abs(nums[i]) > nums[0])) {
                deque.push(nums[i]);
            }
            number = nums[nums.length - 1];
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= 0) {
                statck.push(nums[i]);
            }
        }


        int i = 0;
        while (!deque.isEmpty()) {
            count = deque.pop() * count;
            i++;
            if (i == 2 && number > 0) {
                return count * number;
            } else if (i == 3) {
                return count;
            }
        }


        int j = 0;
        while (!statck.isEmpty()) {
            count = statck.pop() * count;
            j++;
            if (j == 3) {
                break;
            }

        }


        return count;
    }


}
