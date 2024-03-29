package com.coderpwh.leetcode;

/**
 * 74. 搜索二维矩阵
 * 给你一个满足下述两条属性的 m x n 整数矩阵：
 * <p>
 * 每行中的整数从左到右按非严格递增顺序排列。
 * 每行的第一个整数大于前一行的最后一个整数。
 * 给你一个整数 target ，如果 target 在矩阵中，返回 true ；否则，返回 false 。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * 输入：matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
 * 输出：true
 * 示例 2：
 * <p>
 * <p>
 * 输入：matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 13
 * 输出：false
 * <p>
 * <p>
 * 提示：
 * <p>
 * m == matrix.length
 * n == matrix[i].length
 * 1 <= m, n <= 100
 * -104 <= matrix[i][j], target <= 104
 *
 * @author coderpwh
 * @date 2023/10/30 13:47
 */
public class SearchMatrixThree {

    public static void main(String[] args) {

        int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        int target = 3;

        SearchMatrixThree three = new SearchMatrixThree();
        Boolean flag = three.searchMatrix(matrix, target);
        System.out.println(flag);


        System.out.println("-------------------------------------------------");
        Boolean result = three.searchMatrixByTwo(matrix, target);
        System.out.println(result);


    }


    /***
     *  1. 时间复杂度为O(N^2)
     *  2. 空间复杂度为O(1)
     *
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


    /**
     *  1. 时间复杂度为O(logN)
     *  2. 空间复杂度为O(1)
     *  3. 二分化查询
     *
     * @param matrix
     * @param target
     * @return
     */
    public boolean searchMatrixByTwo(int[][] matrix, int target) {

        int m = matrix.length;
        int n = matrix[0].length;
        int low = 0;
        int high = m * n - 1;

        while (low <= high) {
            int mid = (high - low) / 2 + low;

            int x = matrix[mid / n][mid % n];

            if (x < target) {
                low = mid + 1;
            } else if (x > target) {
                high = mid - 1;
            } else {
                return true;
            }
        }
        return false;
    }

}
