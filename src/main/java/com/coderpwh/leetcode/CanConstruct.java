package com.coderpwh.leetcode;

import javax.print.attribute.HashPrintJobAttributeSet;
import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Map;


/****
 *
 *  383. 赎金信
 *  
 *  给定一个赎金信 (ransom) 字符串和一个杂志(magazine)字符串，判断第一个字符串 ransom 能不能由第二个字符串 magazines 里面的字符构成。如果可以构成，返回 true ；否则返回 false。
 *
 * (题目说明：为了不暴露赎金信字迹，要从杂志上搜索各个需要的字母，组成单词来表达意思。杂志字符串中的每个字符只能在赎金信字符串中使用一次。)
 *
 *  
 *
 * 示例 1：
 *
 * 输入：ransomNote = "a", magazine = "b"
 * 输出：false
 * 示例 2：
 *
 * 输入：ransomNote = "aa", magazine = "ab"
 * 输出：false
 * 示例 3：
 *
 * 输入：ransomNote = "aa", magazine = "aab"
 * 输出：true
 *
 *
 *
 */
public class CanConstruct {

    public static void main(String[] args) {


        String ransomNote = "a";

        String magazine = "b";

        CanConstruct can = new CanConstruct();
//        can.canConstruct(ransomNote, magazine);

        System.out.println(can.canConstruct(ransomNote, magazine));

    }


    /***
     *    思路:
     *       1. 时间复杂度为O(N+M)
     *       2. 空间复杂度为O(N)
     *       3. 利用哈希与遍历实现，算法效率不算太高效
     *
     *
     * @param ransomNote
     * @param magazine
     * @return
     */
    public boolean canConstruct(String ransomNote, String magazine) {

        HashMap<Character, Integer> map = new HashMap<>();


        for (char c : magazine.toCharArray()) {

            map.put(c, map.getOrDefault(c, 0) + 1);
        }


        for (char c : ransomNote.toCharArray()) {

            Integer count = map.getOrDefault(c,0);
            if (count <= 0) {
                return false;
            }
            count-=1;
            map.put(c, count);
        }

        return true;


    }
}

