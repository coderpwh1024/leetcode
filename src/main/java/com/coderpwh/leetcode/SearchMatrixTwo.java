package com.coderpwh.leetcode;

/**
 * 面试题 10.09. 排序矩阵查找
 * 提示
 * 中等
 * 59
 * 相关企业
 * 给定M×N矩阵，每一行、每一列都按升序排列，请编写代码找出某元素。
 * <p>
 * 示例:
 * <p>
 * 现有矩阵 matrix 如下：
 * <p>
 * [
 * [1,   4,  7, 11, 15],
 * [2,   5,  8, 12, 19],
 * [3,   6,  9, 16, 22],
 * [10, 13, 14, 17, 24],
 * [18, 21, 23, 26, 30]
 * ]
 * 给定 target = 5，返回 true。
 * <p>
 * 给定 target = 20，返回 false。
 *
 * @author coderpwh
 * @date 2023/10/25 9:57
 */
public class SearchMatrixTwo {

    public static void main(String[] args) {

        int arr[][] = {{1, 4, 7, 11, 15}, {2, 5, 8, 12, 19}, {3, 6, 9, 16, 22}, {10, 13, 14, 17, 24}, {18, 21, 23, 26, 30}};

        int target = 5;


        SearchMatrixTwo search = new SearchMatrixTwo();
        boolean result = search.searchMatrix(arr, target);
        System.out.println(result);
    }


    /***
     *  1. 时间复杂度为O(N^2)
     *  2. 空间复杂度为O(1)
     * @param matrix
     * @param target
     * @return
     */
    public boolean searchMatrix(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == target) {
                    return true;
                }
            }
        }

        return false;
    }

}
