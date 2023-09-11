package com.coderpwh.leetcode;

/**
 * @author coderpwh
 * @date 2023/9/11 15:55
 */
public class TestTime {

    public static void main(String[] args) {

        int arr[] = {5, 3, 1, 9, 2, 4,};
        TestTime testTime = new TestTime();
        testTime.test2(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        System.out.println("----------------------------------------------------------------");

        int target = 4;
        Integer result = testTime.test3(arr, target);
        System.out.println(result);

    }


    /***
     * 时间复杂度为O(N)
     * @param n
     */
    public void test1(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(i);
        }
    }


    /***
     * 时间复杂度为O(N^2),arr数组大小未知
     * @param arr
     */
    public void test2(int[] arr) {
        for (int i = 0; i <= arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }


    /***
     *  1.时间复杂度为O(logN)
     * @param arr
     * @param target
     * @return
     */
    public int test3(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] > target) {
                high = mid - 1;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }


}
