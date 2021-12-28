 package com.coderpwh.leetcode;

/**
 * Created by pengwenhao on 2021/12/28.
 */
public class NumTrees {

    public static void main(String[] args) {

        int n = 4;

        NumTrees trees = new NumTrees();
        trees.numTrees(n);

    }


    /**
     * 1.时间复杂度为 O(N)
     * 2.空间复杂度为 O(1)
     *
     * @param n
     * @return
     */
    public int numTrees(int n) {
        long c = 1;

        for (int i = 0; i < n; i++) {
            c = c * 2 * (2 * i + 1) / (i + 2);
        }

        System.out.println(c);
        return (int) c;
    }

}
