package com.coderpwh.test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author coderpwh
 * @date 2023/4/3 11:25
 */
public class TestList {


    public static void main(String[] args) {

//         test1();

//        test2();

        test3();

    }

    public static void test1() {

        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");

        for (String str : list) {
            if (str.equals("b")) {
                list.remove("b");
            }
        }

    }

    public static void test2() {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");

        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()) {
            String str = iterator.next();
            if (str.equals("b")) {
                System.out.println("--");
                iterator.remove();
            } else {
                System.out.println(str);
            }
        }
    }


    public static void test3() {
        String price = "19900.13000";
        
        BigDecimal bg = new BigDecimal(price);
        Integer priceInt = bg.intValue();
        System.out.println(priceInt);

        Integer priceInteger = Integer.valueOf(price);
        System.out.println(priceInteger);

    }


}
