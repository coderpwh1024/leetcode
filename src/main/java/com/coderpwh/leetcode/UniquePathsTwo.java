package com.coderpwh.leetcode;

/**
 * 63 不同的路径2
 *
 * @author coderpwh
 * @date 2023/9/1 10:48
 */
public class UniquePathsTwo {

    public static void main(String[] args) {

        //  1
//        int[][] f = {{0, 1}, {0, 0}};


        // 2
        int[][] f = {{0, 0, 0}, {0, 1, 0}, {0, 0, 0}};

        UniquePathsTwo paths = new UniquePathsTwo();
        Integer result = paths.uniquePathsWithObstacles(f);
        System.out.println(result);
    }


    /***
     * 时间复杂度为O(m*n)
     * 获取路径
     * @param obstacleGrid
     * @return
     */
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int n = obstacleGrid.length;
        int m = obstacleGrid[0].length;

        int[] f = new int[m];

        f[0] = obstacleGrid[0][0] == 0 ? 1 : 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (obstacleGrid[i][j] == 1) {
                    f[j] = 0;
                    continue;
                }
                if (j - 1 >= 0 && obstacleGrid[i][j - 1] == 0) {
                    f[j] = f[j] + f[j - 1];
                }
            }
        }
        return f[m - 1];
    }

}
