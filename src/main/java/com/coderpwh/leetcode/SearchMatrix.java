package com.coderpwh.leetcode;

/**
 * 74 搜索二维矩阵
 * <p>
 * 编写一个高效的算法来判断 m x n 矩阵中，是否存在一个目标值。该矩阵具有如下特性：
 * <p>
 * 每行中的整数从左到右按升序排列。
 * 每行的第一个整数大于前一行的最后一个整数。
 *  
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
 *
 * @author coderpwh
 */
public class SearchMatrix {

    public static void main(String[] args) {

        int arr[][] = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        int target = 3;

        SearchMatrix search = new SearchMatrix();
        search.searchMatrix(arr, target);
        System.out.println(search.searchMatrix(arr, target));
        System.out.println(search.test(arr, target));


    }


    /***
     *
     *     思路:
     *        1. 时间复杂度为O(MN),M,N分别为二维数组的长度
     *        2. 空间复杂度为O(1)没有增加额外的空间
     *        3. 直接用最暴力的方式双重for循环既可以解决
     *
     * @param matrix
     * @param target
     * @return
     */
    public boolean searchMatrix(int[][] matrix, int target) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (target == matrix[i][j]) {
                    return true;
                }
            }
        }

        return false;
    }


    /***
     *    思路
     *       1. 时间复杂度为O(logmn),m,n分别为二维数组的长度与宽度
     *       2. 空间富足度为O(1)，没有额外的储存空间开销
     *       3. 主要用二分查找来遍历，提高遍历的速度
     *
     *
     * @param matrix
     * @param target
     * @return
     */
    public boolean test(int[][] matrix, int target) {
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
