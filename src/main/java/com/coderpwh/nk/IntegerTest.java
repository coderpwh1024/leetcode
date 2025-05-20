package com.coderpwh.nk;

public class IntegerTest {
    public static void main(String[] args) {
        Integer a = new Integer(100);
        Integer b = new Integer(100);

        Integer c = 100;

        Integer d = 100;


        /***
         * ~128~127 为jvm里面缓存的值 并且是同一对象
         */
        System.out.println(a == b);
        System.out.println(c == d);
        System.out.println(a.equals(b));

    }
}
