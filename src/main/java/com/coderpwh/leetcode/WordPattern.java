package com.coderpwh.leetcode;

import java.util.HashMap;

/**
 * 给定一种规律 pattern 和一个字符串 str ，判断 str 是否遵循相同的规律。
 * <p>
 * 这里的 遵循 指完全匹配，例如， pattern 里的每个字母和字符串 str 中的每个非空单词之间存在着双向连接的对应规律。
 * <p>
 * 示例1:
 * <p>
 * 输入: pattern = "abba", str = "dog cat cat dog"
 * 输出: true
 * 示例 2:
 * <p>
 * 输入:pattern = "abba", str = "dog cat cat fish"
 * 输出: false
 * 示例 3:
 * <p>
 * 输入: pattern = "aaaa", str = "dog cat cat dog"
 * 输出: false
 * 示例 4:
 * <p>
 * 输入: pattern = "abba", str = "dog dog dog dog"
 * 输出: false
 * 说明:
 * 你可以假设 pattern 只包含小写字母， str 包含了由单个空格分隔的小写字母。    
 *
 * @author coderpwh
 */
public class WordPattern {


    public static void main(String[] args) {

//        String pattern = "abba";

        String pattern = "abc";

//        String str = "dog cat cat dog";
//        String str = "dog dog dog dog";

        String str = "dog cat dog";


        WordPattern word = new WordPattern();
        word.worrdPattern(pattern, str);

        System.out.println(word.worrdPattern(pattern, str));


    }


    /***
     *    思路:"
     *       1：空间复杂度为O(3)
     *       2：时间复杂度为O(MN) M为 字符串数组长度，N则为map长度大小
     *
     * @param pattern
     * @param s
     * @return
     */
    public boolean worrdPattern(String pattern, String s) {

        String strarr[] = s.split(" ");
        char arr[] = pattern.toCharArray();
        HashMap<String, String> map = new HashMap<>();

        if (strarr.length != arr.length) {
            return false;
        }

        for (int i = 0; i < strarr.length; i++) {
            String key = pattern.charAt(i) + "";

            if (map.containsKey(key)) {
                if (!map.get(key).equals(strarr[i])) {
                    return false;
                }
            } else {

                for (String str : map.keySet()) {
                    if (strarr[i].equals(map.get(str))) {
                        return false;
                    }
                }
                map.put(key, strarr[i]);
            }

        }

        return true;
    }


}
