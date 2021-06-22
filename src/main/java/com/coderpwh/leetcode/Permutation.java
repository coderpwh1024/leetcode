package com.coderpwh.leetcode;

import java.util.*;

/***
 *  剑指 Offer 38. 字符串的排列
 *
 *输入一个字符串，打印出该字符串中字符的所有排列。
 *
 *  
 *
 * 你可以以任意顺序返回这个字符串数组，但里面不能有重复元素。
 *
 *  
 *
 * 示例:
 *
 * 输入：s = "abc"
 * 输出：["abc","acb","bac","bca","cab","cba"]
 *
 *
 *
 */
public class Permutation {


    List<String> rec;
    boolean[] vis;

    public static void main(String[] args) {

        String str = "abc";

        Permutation per = new Permutation();
        String arr[] = per.permutation(str);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }


    public String[] permutation(String s) {

        int n = s.length();
        rec = new ArrayList<>();
        vis = new boolean[n];
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        StringBuffer perm = new StringBuffer();
        backtrack(arr, 0, n, perm);
        int size = rec.size();

        String[] recArr = new String[size];
        for (int i = 0; i < size; i++) {
            recArr[i] = rec.get(i);
        }
        return recArr;
    }


    public void backtrack(char[] arr, int i, int n, StringBuffer perm) {

        if (i == n) {
            rec.add(perm.toString());
            return;
        }

        for (int j = 0; j < n; j++) {
            if (vis[j] || (j > 0 && !vis[j - 1] && arr[j - 1] == arr[j])) {
                continue;
            }
            vis[j] = true;
            perm.append(arr[j]);
            backtrack(arr, i + 1, n, perm);
            perm.deleteCharAt(perm.length() - 1);
            vis[j] = false;
        }
    }


}

