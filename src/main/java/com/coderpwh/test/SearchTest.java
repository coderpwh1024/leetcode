package com.coderpwh.test;

/**
 * @author coderpwh
 * @date 2023/10/13 17:25
 */
public class SearchTest {

    public static void main(String[] args) {

        int data[] = {1, 2, 6, 3, 8, 9, 19, 299, 300, 566};

        int target = 19;

        int l = 0;

        int r = data.length - 1;

        int index = search(data, l, r, target);
        System.out.println("下标为:" + index);
        System.out.println("结果值为:" + data[index]);

    }


    public static int search(int[] data, int l, int r, int target) {
        while (l < r) {
            int mid = (l + r) / 2;
            if (data[mid] > target) {
                r = mid + 1;
            } else if (data[mid] < target) {
                l = mid - 1;
            } else {
                return mid;
            }
        }

        return -1;
    }


}
