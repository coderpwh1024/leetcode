package com.coderpwh.leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class CheckRecord {

    public static void main(String[] args) {


//        String str = "PPALLP";

        String str = "PPALLL";


        CheckRecord check = new CheckRecord();
        check.checkRecord(str);

        System.out.println(check.test(str));

    }


    /***
     *  A - 1个
     *
     *  LL - 2个
     *
     *
     * @param s
     * @return
     */
    public boolean checkRecord(String s) {

        char arr[] = s.toCharArray();


        Queue queue = new LinkedList();


        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'A') {
                queue.add(arr[i]);
            }
        }


        return false;
    }

    public boolean test(String s) {

        int count = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == 'A') {
                count++;
            }
        }

        return count <= 1 && s.indexOf("LLL") < 0;

    }


}
