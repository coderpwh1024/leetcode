package com.coderpwh.leetcode;

/**
 * 62. 不同路径
 * 一个机器人位于一个 m x n 网格的左上角 （起始点在下图中标记为 “Start” ）。
 * 机器人每次只能向下或者向右移动一步。机器人试图达到网格的右下角（在下图中标记为 “Finish” ）。
 * 问总共有多少条不同的路径？
 *
 * @author coderpwh
 * @date 2023/8/30 17:16
 */
public class UniquePaths {


    public static void main(String[] args) {

//        int m = 3;
//        int n = 7;

        int m = 3;
        int n = 2;

        UniquePaths paths = new UniquePaths();
        Integer count = paths.uniquePaths(m, n);
        System.out.println(count);


        Integer result = paths.getUniquePaths(m, n);
        System.out.println(result);

    }


    /***
     *时间复杂度为: O(N^2)
     *
     * m:3 n:7 result:28
     * @param m
     * @param n
     * @return
     */
    public int uniquePaths(int m, int n) {
        int f[][] = new int[m][n];

        f[0][0] = 1;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i > 0) {
                    f[i][j] += f[i - 1][j];
                }
                if (j > 0) {
                    f[i][j] += f[i][j - 1];
                }
            }
        }
        return f[m - 1][n - 1];
    }


    /***
     * 动态规范,时间复杂度为O(N^2)
     * @param m
     * @param n
     * @return
     */
    public int getUniquePaths(int m, int n) {
        int[][] f = new int[m][n];

        for (int i = 0; i < m; ++i) {
            f[i][0] = 1;
        }

        for (int j = 0; j < n; j++) {
            f[0][j] = 1;
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                f[i][j] = f[i - 1][j] + f[i][j - 1];
            }
        }
        return f[m - 1][n - 1];
    }


}
