package com.coderpwh.leetcode;

import com.sun.org.apache.regexp.internal.RE;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

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
