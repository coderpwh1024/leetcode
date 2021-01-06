package com.coderpwh.leetcode;

/**
 * @author coderpwh
 */
public class Shuffle {

    public static void main(String[] args) {

//        int arr[] = {2, 5, 1, 3, 4, 7};
//        int n = 3;

//        int arr[]={1,2,3,4,4,3,2,1};
//        int n=4;

        int arr[] ={1,1,2,2};
        int n=2;


        /****
         *    2  5  1
         *    3  4  7
         *
         *    2 3 5 4 1 7
         *
         */
        Shuffle shuffle = new Shuffle();
        shuffle.shuffle(arr, n);
    }


    public int[] shuffle(int[] nums, int n) {

        if (n <= 1) {
            return nums;
        }

        int arr1[] = new int[n];
        int arr2[] = new int[n];

        for (int i = 0; i < nums.length; i++) {
            if (i < n) {
                arr1[i] = nums[i];
            } else {
                arr2[i - n] = nums[i];
            }
        }

        int t = 0;
        int j = 0;
        int m = 0;
        while (m < nums.length) {

            if (m % 2 == 0&&t<n) {
                nums[m] = arr1[t];
                t++;
            } else if(m%2!=0&&j<n) {
                nums[m] = arr2[j];
                j++;
            }
            m++;

        }




      /*  for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                if (i < n) {
                    nums[i] =arr1[i];
                }else{
                    nums[i]=arr1[i-n];
                }
            } else {
                if (i < n) {
                    nums[i] =arr2[i];
                }else{
                    nums[i]=arr2[i-n];
                }
            }
        }*/

        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }

        System.out.println();
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }

        System.out.println();
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }


        return nums;
    }


}
