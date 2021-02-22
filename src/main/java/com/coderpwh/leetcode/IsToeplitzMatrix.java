package com.coderpwh.leetcode;

public class IsToeplitzMatrix {

    public static void main(String[] args) {

        int[][] arr = {{1, 2, 3, 4}, {5, 1, 2, 3}, {9, 5, 1, 2}};

        IsToeplitzMatrix matrix = new IsToeplitzMatrix();

        System.out.println(matrix.isToeplitzMatrix(arr));


        System.out.println(matrix.test(arr));

    }


    public boolean test(int[][] matrix) {

        int m = matrix.length;

        int n = matrix[0].length;

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] != matrix[i - 1][j - 1]) {
                    return false;
                }
            }
        }

        return true;
    }


    /****
     *     思路:
     *        1. 时间复杂度为O(mn)
     *        2. 空间复杂度为O(1)
     * @param matrix
     * @return
     */
    public boolean isToeplitzMatrix(int[][] matrix) {

        int m = matrix.length, n = matrix[0].length;
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] != matrix[i - 1][j - 1]) {
                    return false;
                }
            }
        }
        return true;
    }


}
