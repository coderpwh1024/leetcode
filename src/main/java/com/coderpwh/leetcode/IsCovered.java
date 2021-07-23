package com.coderpwh.leetcode;

public class IsCovered {

    public static void main(String[] args) {


//        ranges = [[1, 2],[3, 4],[5, 6]]

        int[][] rangs = {{1, 2}, {3, 4}, {5, 6}};


//        int[][] rangs = {{1, 1}};

        int left = 1;

        int right = 50;

        IsCovered isCovered = new IsCovered();
        isCovered.isCovered(rangs, left, right);
//        System.out.println(isCovered.isCovered(rangs, left, right));

    }


    public boolean isCovered(int[][] ranges, int left, int right) {

        boolean[] flag = new boolean[51];

        for (int[] range : ranges) {
            for (int i = range[0]; i <= range[1]; i++) {
                flag[i] = true;
            }
        }

        for (int i = left; i <= right; i++) {
            if (flag[i] == false) {
                return false;
            }
        }
        return true;
    }

}
