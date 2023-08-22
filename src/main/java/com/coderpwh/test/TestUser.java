package com.coderpwh.test;

import java.math.BigDecimal;

/**
 * @author coderpwh
 * @date 2022/8/1 14:13
 */
public class TestUser {

    public static void main(String[] args) {
        String orderNumbe = null;


//        test1(orderNumbe);
//
//        test2(orderNumbe);


        String str = "17.25000";

        BigDecimal d = new BigDecimal(str);
        System.out.println(d);

        BigDecimal c = d.multiply(new BigDecimal(100));
        System.out.println(c);

        System.out.println(c.intValue());
    }

    public static void test1(String orderNumber) {
        orderNumber = "a";

//        System.out.println("a:" + orderNumber);

    }

    public static void test2(String orderNumbe) {
        System.out.println(orderNumbe);
    }
}
