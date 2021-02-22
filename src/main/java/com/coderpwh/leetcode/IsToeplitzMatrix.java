package com.coderpwh.leetcode;

/*****
 * 766. 托普利茨矩阵
 *
 *给你一个 m x n 的矩阵 matrix 。如果这个矩阵是托普利茨矩阵，返回 true ；否则，返回 false 。
 *
 * 如果矩阵上每一条由左上到右下的对角线上的元素都相同，那么这个矩阵是 托普利茨矩阵 。
 *
 *  
 *
 * 示例 1：
 *
 *
 * 输入：matrix = [[1,2,3,4],[5,1,2,3],[9,5,1,2]]
 * 输出：true
 * 解释：
 * 在上述矩阵中, 其对角线为:
 * "[9]", "[5, 5]", "[1, 1, 1]", "[2, 2, 2]", "[3, 3]", "[4]"。
 * 各条对角线上的所有元素均相同, 因此答案是 True 。
 * 示例 2：
 *
 *
 * 输入：matrix = [[1,2],[2,2]]
 * 输出：false
 * 解释：
 * 对角线 "[1, 2]" 上的元素不同。
 *
 */
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

