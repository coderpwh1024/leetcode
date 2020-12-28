package com.coderpwh.leetcode;

/**
 * @author coderpwh
 */
public class IsPowerOfTwo {

    public static void main(String[] args) {
        IsPowerOfTwo power = new IsPowerOfTwo();


//        System.out.println(power.isPowerOfTwo(1073741825));

        System.out.println(power.test(8));
    }


    public boolean test(int n) {

        if (n <= 0) {
            return false;
        }

        while (n % 2 == 0) {
            n = n / 2;
        }
        return n == 1;

    }


    public boolean isPowerOfTwo(int n) {

        if (n <= 0) {
            return false;
        }
        if (n == 1) {
            return true;
        }

        int result = 1;
        while (true) {
            result = result * 2;
            if (result == n) {
                return true;
            } else if (result > n) {
                return false;
            }

        }
    }
}
