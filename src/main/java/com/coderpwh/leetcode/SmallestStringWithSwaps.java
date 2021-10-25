package com.coderpwh.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 给你一个字符串 s，以及该字符串中的一些「索引对」数组 pairs，其中 pairs[i] = [a, b] 表示字符串中的两个索引（编号从 0 开始）。
 *
 * 你可以 任意多次交换 在 pairs 中任意一对索引处的字符。
 *
 * 返回在经过若干次交换后，s 可以变成的按字典序最小的字符串。
 *
 *  
 *
 * 示例 1:
 *
 * 输入：s = "dcab", pairs = [[0,3],[1,2]]
 * 输出："bacd"
 * 解释：
 * 交换 s[0] 和 s[3], s = "bcad"
 * 交换 s[1] 和 s[2], s = "bacd"
 * 示例 2：
 *
 * 输入：s = "dcab", pairs = [[0,3],[1,2],[0,2]]
 * 输出："abcd"
 * 解释：
 * 交换 s[0] 和 s[3], s = "bcad"
 * 交换 s[0] 和 s[2], s = "acbd"
 * 交换 s[1] 和 s[2], s = "abcd"
 * 示例 3：
 *
 * 输入：s = "cba", pairs = [[0,1],[1,2]]
 * 输出："abc"
 * 解释：
 * 交换 s[0] 和 s[1], s = "bca"
 * 交换 s[1] 和 s[2], s = "bac"
 * 交换 s[0] 和 s[1], s = "abc"
 *

 *
 * @author coderpwh
 */
public class SmallestStringWithSwaps {


    /***
     * 输入：s = "dcab", pairs = [[0,3],[1,2]]
     * 输出："bacd"
     * 解释：
     * 交换 s[0] 和 s[3], s = "bcad"
     * 交换 s[1] 和 s[2], s = "bacd"
     *      List<Integer> data2 = new ArrayList<>();
     *         data2.add(1);
     *         data2.add(2);
     * @param args
     */
    public static void main(String[] args) {

        String str = "dcab";
        List<Integer> data = new ArrayList<>();
        data.add(0);
        data.add(3);


        List<Integer> data2 = new ArrayList<>();
        data2.add(1);
        data2.add(2);

        List<Integer> data3 = new ArrayList<>();
        data3.add(0);
        data3.add(2);

        List<List<Integer>> list = new ArrayList<>();
        list.add(data);
        list.add(data2);
//        list.add(data3);


        SmallestStringWithSwaps smallestStringWithSwaps = new SmallestStringWithSwaps();
        System.out.println(smallestStringWithSwaps.smallestStringWithSwaps(str, list));
    }


    /****
     *
     * @param s
     * @param pairs
     * @return
     */
    public String smallestStringWithSwaps(String s, List<List<Integer>> pairs) {




        for (List<Integer> list : pairs) {

            StringBuilder sb = new StringBuilder();
            int a = list.get(0);
            int b = list.get(1);

            char cha = s.charAt(a);
            char chb = s.charAt(b);

            for (int i = 0; i < s.length(); i++) {
                if (i == a) {
                    sb.append(chb);
                } else if (i == b) {
                    sb.append(cha);
                } else {
                    sb.append(s.charAt(i));
                }

            }
            s=sb.toString();
        }


        return s;

    }

}
