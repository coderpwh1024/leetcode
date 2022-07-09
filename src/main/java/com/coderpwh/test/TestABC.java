package com.coderpwh.test;

public class TestABC {


    public static void main(String[] args) {

            A a = new A();
            B b =new B();


        System.out.println(a.cc()==b.cc());
//        System.out.println(a.bb()=b.cc());
        System.out.println(a.cc()==b.bb());
        System.out.println(a.getM()==b.cc());
        System.out.println(a.bb()==b.getM());





    }


}
