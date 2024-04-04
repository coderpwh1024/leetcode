package com.coderpwh.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 示例 1：
 *
 * 输入：words = ["one.two.three","four.five","six"], separator = "."
 * 输出：["one","two","three","four","five","six"]
 * 解释：在本示例中，我们进行下述拆分：
 *
 * "one.two.three" 拆分为 "one", "two", "three"
 * "four.five" 拆分为 "four", "five"
 * "six" 拆分为 "six"
 *
 * 因此，结果数组为 ["one","two","three","four","five","six"] 。
 * @author coderpwh
 */
public class SplitWordsBySeparator {


    public static void main(String[] args) {

        SplitWordsBySeparator  sp = new SplitWordsBySeparator();

        List<String> words = new ArrayList<>();
        words.add("one.two.three");
        words.add("four.five");
        words.add("six");

 /*      String arr[] = {"one.two.three","four.five","six"};

       words = Arrays.asList(arr);*/

        char  separator ='.';

        List<String> result =  sp.splitWordsBySeparator(words,separator);

        for(String str:result){
            System.out.println(str);
        }
    }


    /***
     *  1. 时间复杂度为O(N*M)
     *  2. 空间复杂度为O(N)
     * @param words
     * @param separator
     * @return
     */
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> res = new ArrayList<String>();
        for (String word : words) {
            StringBuilder sb = new StringBuilder();
            int length = word.length();
            for (int i = 0; i < length; i++) {
                char c = word.charAt(i);
                if (c == separator) {
                    if (sb.length() > 0) {
                        res.add(sb.toString());
                        sb.setLength(0);
                    }
                } else {
                    sb.append(c);
                }
            }
            if (sb.length() > 0) {
                res.add(sb.toString());
            }
        }
        return res;
    }


}
