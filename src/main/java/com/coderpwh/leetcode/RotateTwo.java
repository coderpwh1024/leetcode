package com.coderpwh.leetcode;

/**
 * 面试题 01.07. 旋转矩阵
 * 给你一幅由 N × N 矩阵表示的图像，其中每个像素的大小为 4 字节。请你设计一种算法，将图像旋转 90 度。
 * <p>
 * 不占用额外内存空间能否做到？
 * <p>
 * <p>
 * <p>
 * 示例 1:
 * <p>
 * 给定 matrix =
 * [
 * [1,2,3],
 * [4,5,6],
 * [7,8,9]
 * ],
 * <p>
 * 原地旋转输入矩阵，使其变为:
 * [
 * [7,4,1],
 * [8,5,2],
 * [9,6,3]
 * ]
 * 示例 2:
 * <p>
 * 给定 matrix =
 * [
 * [ 5, 1, 9,11],
 * [ 2, 4, 8,10],
 * [13, 3, 6, 7],
 * [15,14,12,16]
 * ],
 * <p>
 * 原地旋转输入矩阵，使其变为:
 * [
 * [15,13, 2, 5],
 * [14, 3, 4, 1],
 * [12, 6, 8, 9],
 * [16, 7,10,11]
 * ]
 *
 * @author coderpwh
 * @date 2023/10/12 11:22
 */
public class RotateTwo {


    public static void main(String[] args) {

        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        RotateTwo rotate = new RotateTwo();
//        rotate.rotate(matrix);

        rotate.rorates(matrix);

    }




    public void rorates(int[][] matrix) {

        int[][] temp = new int[matrix[0].length][matrix.length];

        int depth = matrix[0].length - 1;


        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                temp[j][depth] = matrix[i][j];
            }
            depth--;
        }

        for (int i = 0; i < temp.length; i++) {
            for (int j = 0; j < temp[i].length; j++) {
                matrix[i][j] = temp[i][j];
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }


    /***
     * 1. 时间复杂度为O(N^2);
     * 2. 空间复杂度为O(N^2);
     * 3. 额外地创建数组
     * 旋转
     * @param matrix
     */
    public void rotate(int[][] matrix) {


        int[][] temp = new int[matrix[0].length][matrix.length];

        int depth = matrix[0].length - 1;


        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                temp[j][depth] = matrix[i][j];
            }
            depth--;
        }


        for (int i = 0; i < temp.length; i++) {
            for (int j = 0; j < temp[i].length; j++) {
                System.out.print(temp[i][j] + " ");
            }
            System.out.println();
        }


    }

}
