package com.coderpwh.leetcode;

public class XorOperation {

    public static void main(String[] args) {


        int n = 10;
        int start = 5;

        XorOperation operation = new XorOperation();
        operation.xorOperation(n, start);


    }


    public int xorOperation(int n, int start) {


        Integer count = 0;
        Integer sum = 0;
        for (int i = 0; i < n; i++) {

            count = start + 2 * i;
            sum ^= count;
        }
        System.out.println(sum);


        return sum;
    }


}
