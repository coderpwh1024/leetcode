package com.coderpwh.leetcode;

import java.util.*;

/**
 * 杨辉三角
 * <p>
 * 给定一个非负整数 numRows，生成杨辉三角的前 numRows 行。
 * <p>
 * <p>
 * <p>
 * 在杨辉三角中，每个数是它左上方和右上方的数的和。
 * <p>
 * 示例:
 * <p>
 * 输入: 5
 * 输出:
 * [
 * [1],
 * [1,1],
 * [1,2,1],
 * [1,3,3,1],
 * [1,4,6,4,1]
 * ]
 * <p>
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/pascals-triangle
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author coderpwh
 */
public class Generate {


    public static void main(String[] args) {

        Generate g = new Generate();
        g.generate(7);

        System.out.println("--------------------------------------");
        System.out.println(g.getRow(1));

        System.out.println("--------------------------------------");
        System.out.println(g.test(7));
    }


    /***
     *  简洁版
     *
     * @param rowIndex
     * @return
     */
    public List<Integer> test(int rowIndex) {
        List<Integer> cur = new ArrayList<>();
        cur.add(1);

        for (int i = 1; i <= rowIndex; i++) {
            for (int j = i - 1; j > 0; j--) {
                cur.set(j, cur.get(j - 1) + cur.get(j));
            }
            cur.add(1);
        }
        return cur;
    }

    /****
     *  杨辉三角||
     *
     * 返回指定的行数
     * @param rowIndex
     * @return
     */
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> list = new ArrayList<>();

        List<Integer> date = new ArrayList<>();

        date.add(1);
        list.add(date);
        if (rowIndex == 0) {
            return date;
        }

        date = new ArrayList<>();
        date.add(1);
        date.add(1);
        list.add(date);
        if (rowIndex == 1) {
            return date;
        }


        for (int i = 2; i < rowIndex + 1; i++) {

            List<Integer> dateList = new ArrayList<>();
            dateList.add(1);
            List<Integer> typeList = list.get(i - 1);
            for (int j = 0; j < typeList.size() - 1; j++) {
                int sum = typeList.get(j) + typeList.get(j + 1);
                dateList.add(sum);
            }
            dateList.add(1);
            list.add(dateList);
        }


        return list.get(rowIndex);
    }


    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> list = new ArrayList<>();


        if (numRows == 0) {
            return list;
        }

        List<Integer> date = new ArrayList<>();
        date.add(1);
        list.add(date);

        if (numRows == 1) {
            return list;
        }

        date = new ArrayList<>();
        date.add(1);
        date.add(1);
        list.add(date);
        if (numRows == 2) {
            return list;
        }


        for (int i = 2; i < numRows; i++) {

            List<Integer> dateList = new ArrayList<>();
            dateList.add(1);
            List<Integer> typeList = list.get(i - 1);
            for (int j = 0; j < typeList.size() - 1; j++) {
                int sum = typeList.get(j) + typeList.get(j + 1);
                dateList.add(sum);
            }
            dateList.add(1);
            list.add(dateList);
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }


        return list;
    }


}
