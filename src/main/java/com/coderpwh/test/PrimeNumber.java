package com.coderpwh.test;


/***
 * 找出不大N的最大质数
 */
public class PrimeNumber {

    public static void main(String[] args) {


         int n=10;

        PrimeNumber number = new PrimeNumber();

        Integer count = number.getMaxNumber(n);

        System.out.println("不大于n: "+n+",的最大的质数为:"+count);

    }


    public int getMaxNumber(int n){


        return  -1;
    }


}
