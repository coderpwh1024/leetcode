package com.coderpwh.leetcode;

/**
 * 面试题 01.08. 零矩阵
 * <p>
 * 编写一种算法，若M × N矩阵中某个元素为0，则将其所在的行与列清零。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入：
 * [
 * [1,1,1],
 * [1,0,1],
 * [1,1,1]
 * ]
 * 输出：
 * [
 * [1,0,1],
 * [0,0,0],
 * [1,0,1]
 * ]
 * 示例 2：
 * <p>
 * 输入：
 * [
 * [0,1,2,0],
 * [3,4,5,2],
 * [1,3,1,5]
 * ]
 * 输出：
 * [
 * [0,0,0,0],
 * [0,4,5,0],
 * [0,3,1,0]
 * ]
 *
 * @author coderpwh
 * @date 2023/10/12 14:17
 */
public class SetZeroes {

    public static void main(String[] args) {

        SetZeroes zeroes = new SetZeroes();

//        int[][] matrix = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};

        int[][] matrix = {{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};


        zeroes.setZeroes(matrix);
    }


    /***
     *  1.时间复杂度为O(N^M)
     *  2.空间复杂度为O(N+M)
     *
     * @param matrix
     */
    public void setZeroes(int[][] matrix) {


        boolean[] row = new boolean[matrix.length];
        boolean[] col = new boolean[matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    row[i] = true;
                    col[j] = true;
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (col[j] == true) {
                    matrix[i][j] = 0;
                }
                if (row[i] == true) {
                    matrix[i][j] = 0;
                }
            }
        }


        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }

}
