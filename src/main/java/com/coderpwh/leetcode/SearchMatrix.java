package com.coderpwh.leetcode;

/**
 * @author coderpwh
 */
public class SearchMatrix {

    public static void main(String[] args) {

        int arr[][] = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        int target = 3;

        SearchMatrix search = new SearchMatrix();
        search.searchMatrix(arr, target);
        System.out.println(search.searchMatrix(arr, target));


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

}
