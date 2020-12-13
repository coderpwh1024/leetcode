package com.coderpwh.leetcode;


public class MySqrt {


    public static void main(String[] args) {
        MySqrt mySqrt = new MySqrt();
        System.out.println(mySqrt.mySqrt(4));

    }

    public int mySqrt(int x) {

        Double a = Math.sqrt(x);

        return a.intValue();


    }

}
