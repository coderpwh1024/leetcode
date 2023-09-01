package com.coderpwh.leetcode;

/**
 * @author coderpwh
 * @date 2023/9/1 10:48
 */
public class UniquePathsTwo {

    public static void main(String[] args) {

        int[][] f = new int[3][3];


        UniquePathsTwo paths = new UniquePathsTwo();
        Integer result = paths.uniquePathsWithObstacles(f);
        System.out.println(result);
    }


    /***
     * 获取路径
     * @param obstacleGrid
     * @return
     */
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {

        return -1;
    }

}
