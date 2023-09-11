package com.coderpwh.leetcode;

/**
 * 392 判断子序列
 *
 * @author coderpwh
 * @date 2023/9/11 16:25
 */
public class Subsequence {

    public static void main(String[] args) {

        String s = "abc";
        String t = "ahbgdc";

//        String s = "axc";
//        String t = "ahbgdc";

        Subsequence subsequence = new Subsequence();
        boolean result = subsequence.isSubsequence(s, t);

        boolean flagResult = subsequence.isSubsequenceTwo(s, t);
        System.out.println(flagResult);


    }


    public boolean isSubsequenceTwo(String s, String t) {
        int n = s.length();
        int m = t.length();
        int i = 0;
        int j = 0;

        while (i < n && j < m) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }
        return i == n;
    }


    /***
     *  1.时间复杂度为O(N^2)
     * @param s
     * @param t
     * @return
     */
    public boolean isSubsequence(String s, String t) {
        int arr[] = new int[s.length()];

        char[] arrt = t.toCharArray();
        char[] arrs = s.toCharArray();

        for (int i = 0; i <= arrt.length - 1; i++) {
            for (int j = 0; j <= arrs.length - 1; j++) {
                if (arrt[i] == arrs[j]) {
                    arr[j] = arrs[j];
                }
            }
        }

        if (arr[0] < arr[arr.length - 1]) {
            return true;
        }

        return false;
    }
}
