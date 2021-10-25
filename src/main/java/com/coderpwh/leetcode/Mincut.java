package com.coderpwh.leetcode;

import java.util.Arrays;

/**
 * @author coderpwh
 */
public class Mincut {

    public static void main(String[] args) {


        // aa  b
        String s = "aab";

        // a  b
//        String s = "ab";

        Mincut cut = new Mincut();
        cut.minCut(s);
    }

    public int minCut(String s) {
        int n = s.length();
        boolean[][] g = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            Arrays.fill(g[i], true);
        }

        return 0;
    }


}
