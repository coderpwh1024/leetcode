package com.coderpwh.leetcode;

/**
 * @author coderpwh
 * @date 2023/10/12 11:22
 */
public class RotateTwo {


    public static void main(String[] args) {

        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        RotateTwo rotate = new RotateTwo();
        rotate.rotate(matrix);


    }


    /***
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
