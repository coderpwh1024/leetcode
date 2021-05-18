package com.coderpwh.leetcode;

/**
 * @author coderpwh
 */
public class CountTriplets {


    public static void main(String[] args) {


        int[] arr = {2, 3, 1, 6, 7};

        CountTriplets count = new CountTriplets();
        count.countTriplets(arr);

    }


    public int countTriplets(int[] arr) {


        int n = arr.length;

        int[] s = new int[n + 1];

        for (int i = 0; i < n; i++) {
            s[i + 1] = s[i] ^ arr[i];
        }

        int ans = 0;

        for (int i = 0; i < n; ++i) {
            for (int j = i + 1; j < n; ++j) {
                for (int k = j; k < n; ++k) {
                    if (s[i] == s[k + 1]) {
                        ++ans;
                    }
                }

            }
        }
        return ans;
    }


}
