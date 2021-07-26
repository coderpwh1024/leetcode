package com.coderpwh.leetcode;

import javax.print.attribute.HashPrintJobAttributeSet;
import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Map;

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
