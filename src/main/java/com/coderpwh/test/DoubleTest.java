package com.coderpwh.test;


/**
 * @author coderpwh
 * @date 2023/10/10 17:44
 */
public class DoubleTest {

    private static String str = "This is static";

    private String testString = "this is testString";

    public static void main(String[] args) {

     /*   System.out.println(str);
        DoubleTest test = new DoubleTest();

        DoubleTest test2 = new DoubleTest("222");
        System.out.println(test.testString);*/

        double b=0.6332;
        System.out.println(b);
        Double d = 0.6332;
        System.out.println(d);


    }

    static {
        System.out.println("静态构造模块!");
    }

    public DoubleTest() {
        System.out.println("无参构造");
    }

    public DoubleTest(String test) {
        System.out.println("有参构造模块");
    }

    {
        System.out.println("普通模块");

    }


}
