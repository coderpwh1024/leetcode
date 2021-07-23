package com.coderpwh.leetcode;

import com.sun.tools.javac.code.Attribute;

public class MatrixReshape {

    public static void main(String[] args) {


        int nums[][] = {{1, 2}, {3, 4}};

        int r = 1;

        int c = 4;

        MatrixReshape matrixReshape = new MatrixReshape();
        matrixReshape.matrixReshape(nums, r, c);

    }

    public int[][] matrixReshape(int[][] mat, int r, int c) {

        int m = mat.length;
        int n = mat[0].length;

        if (m * n != r * c) {

            return mat;
        }

        int[][] ans = new int[r][c];

        for (int x = 0; x < m * n; x++) {
            ans[x / c][x % c] = mat[x / n][x % n];
        }


        return ans;
    }


}
