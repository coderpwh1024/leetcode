package com.coderpwh.leetcode;

public class ConvertToTitle {

    public static void main(String[] args) {


        // AA
//        int num = 27;

        // BA
        int num = 53;

        ConvertToTitle convert = new ConvertToTitle();
//        convert.convertToTitle(num);
        System.out.println(convert.convertToTitle(num));

    }


    /***
     *   A -1
     *   B- 2
     *   C- 3
     *
     *   Z -26
     *
     *   AA- 27
     *   AB- 28
     *
     *
     *
     * @param columnNumber
     * @return
     */
    public String convertToTitle(int columnNumber) {

        StringBuffer sb = new StringBuffer();

        while (columnNumber != 0) {
            columnNumber--;
            sb.append((char) (columnNumber % 26 + 'A'));
            columnNumber /= 26;
        }
        return sb.reverse().toString();

    }


}
