package com.coderpwh.leetcode;

/**
 * LCR 173. 点名
 * 某班级 n 位同学的学号为 0 ~ n-1。点名结果记录于升序数组 records。假定仅有一位同学缺席，请返回他的学号。
 * <p>
 * <p>
 * <p>
 * 示例 1:
 * <p>
 * 输入: records = [0,1,2,3,5]
 * 输出: 4
 * 示例 2:
 * <p>
 * 输入: records = [0, 1, 2, 3, 4, 5, 6, 8]
 * 输出: 7
 *
 * @author coderpwh
 * @date 2023/10/9 10:32
 */
public class TakeAttendance {

    public static void main(String[] args) {

        int[] records = {0, 1, 2, 3, 5};

//        int[] records = {0, 1, 2, 3, 4, 5, 6, 8};


//        int[] records = {0};

//        int[] records = {1};

        TakeAttendance take = new TakeAttendance();
        /*Integer result = take.takeAttendance(records);
        System.out.println(result);*/

        Integer count = take.takeAttendanceBySearch(records);
        System.out.println(count);

    }


    /***
     * 1. 时间复杂度为O(N)
     * @param records
     * @return
     */
    public int takeAttendance(int[] records) {
        if (records != null && records.length > 0) {
            if (records.length == 1) {
                return 1;
            }
            for (int i = 0; i < records.length; i++) {
                if (i != records[i]) {
                    return i;
                }
            }
        }
        return -1;
    }


    /**
     * 1. 时间复杂度为O(logN)
     * 2. 二分查找
     *
     * @param records
     * @return
     */
    public int takeAttendanceBySearch(int[] records) {
        int i = 0;
        int j = records.length - 1;

        while (i <= j) {
            int m = (i + j) / 2;
            if (records[m] == m) {
                i = m + 1;
            } else {
                j = m - 1;
            }
        }
        return i;
    }


}
