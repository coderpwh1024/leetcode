package com.coderpwh.test;

import java.math.BigDecimal;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author coderpwh
 * @date 2023/10/20 11:01
 */
public class IntegerTest {
    public static void main(String[] args) {
       /* Integer a=100000;
        Integer b=100000;

//        System.out.println(a==b);

        System.out.println(a.equals(b));


        Long count=1000001L;

        System.out.println(count%200);*/

       /* Integer a = 200;
        Integer b = 200;
        System.out.println(a==b);*/


       /* BigDecimal price = null;

        BigDecimal count = new BigDecimal(1);

        int priceResult = count.compareTo(price);
        System.out.println(priceResult);

        int result = price.compareTo(count);

        System.out.println(result);*/


        int a = 1;
        AtomicInteger atomicInteger = new AtomicInteger(a);
        atomicInteger.incrementAndGet();
        System.out.println(atomicInteger.get());


    }
}
