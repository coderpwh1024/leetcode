package com.coderpwh.leetcode;

public class IsPowerOfFour {

    public static void main(String[] args) {

        int n = 0;


        IsPowerOfFour power = new IsPowerOfFour();
//        power.isPowerOfFour(n);

        System.out.println(power.isPowerOfFour(n));

    }

    public boolean isPowerOfFour(int n) {

        if (n <= 0) {
            return false;
        }

        while (true) {

            if (n % 4 == 0) {
                n = n / 4;
            } else if (n == 1) {
                return true;
            } else {
                return false;
            }

        }
    }


}
