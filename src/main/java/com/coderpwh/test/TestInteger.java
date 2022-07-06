package com.coderpwh.test;

public class TestInteger {

    public static void main(String[] args) {

        Integer a=100;

        Integer b=100;

        Integer c=100;

        Integer d=new Integer(100);


        System.out.println(a==b);
        System.out.println(b==c);

        System.out.println(c==d);


        System.out.println("---------------------------");

        Double double1 = 200.0;

        Double double2=200.0;

        Double double3=200.0;

        Double double4 = new Double(200.0);

        System.out.println(double1==double2);

        System.out.println(double2==double3);

        System.out.println(double1==double4);


        System.out.println("--------------------------");

        System.out.println("------------------------------");
        System.out.println(3*0.1==0.3);


        System.out.println("-----------------------------------");

        String str1="a";

        String str2="a";

        String str3= new String("a");

        System.out.println(str1==str2);
        System.out.println(str1==str3);



    }


}
