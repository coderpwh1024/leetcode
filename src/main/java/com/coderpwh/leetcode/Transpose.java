package com.coderpwh.leetcode;

/**
 * 867. 转置矩阵
 * <p>
 * <p>
 * 给你一个二维整数数组 matrix， 返回 matrix 的 转置矩阵 。
 * <p>
 * 矩阵的 转置 是指将矩阵的主对角线翻转，交换矩阵的行索引与列索引。
 * <p>
 * 示例 1：
 * <p>
 * 输入：matrix = [[1,2,3],[4,5,6],[7,8,9]]
 * 输出：[[1,4,7],[2,5,8],[3,6,9]]
 * 示例 2：
 * <p>
 * 输入：matrix = [[1,2,3],[4,5,6]]
 * 输出：[[1,4],[2,5],[3,6]]
 *
 * @author coderpwh
 */
public class Transpose {


    public static void main(String[] args) {


        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};


        Transpose transpose = new Transpose();
        transpose.transpose(matrix);

    }


    /***
     *
     *      思路：
     *         1. 时间复杂度为O(MN)，数组的长度为M,N
     *         2. 空间复杂度为O(1)
     *         3. 主要是数组对角线，交换位置即可
     *
     * @param matrix
     * @return
     */
    public int[][] transpose(int[][] matrix) {

        int m = matrix.length;
        int n = matrix[0].length;

        int[][] arr = new int[n][m];


        for (int i = 0; i < m; i++) {

            for (int j = 0; j < n; j++) {
                arr[j][i] = matrix[i][j];
            }
        }
        return arr;
    }


}
