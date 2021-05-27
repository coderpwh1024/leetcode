package com.coderpwh.leetcode;

/**
 * @author coderpwh
 */
public class HammingDistance {

    public static void main(String[] args) {

        int x = 1;
        int y = 4;


        HammingDistance hammingDistance = new HammingDistance();

        Integer count = hammingDistance.hammingDistance(x, y);
        System.out.println(count);


    }


    /**
     * 0 0 0 1
     * 0 1 0 0
     *
     * @param x
     * @param y
     * @return
     */
    public int hammingDistance(int x, int y) {

        return Integer.bitCount(x ^ y);
    }


}
