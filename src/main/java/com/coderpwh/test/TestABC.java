package com.coderpwh.test;

import java.math.BigDecimal;

public class TestABC {


    public static void main(String[] args) {

        A a = new A();
        B b = new B();


//        System.out.println(a.cc()==b.cc());
//        System.out.println(a.bb()=b.cc());
//        System.out.println(a.cc()==b.bb());
//        System.out.println(a.getM()==b.cc());
//        System.out.println(a.bb()==b.getM());


//        BigDecimal bigDecimal = new BigDecimal(0.0006);
//
//        BigDecimal total = bigDecimal.multiply(new BigDecimal(12)).setScale(4, BigDecimal.ROUND_HALF_UP);
//
//
//        BigDecimal result = total.divide(new BigDecimal(100)).setScale(6, BigDecimal.ROUND_HALF_UP);
//
//
//        System.out.println(total);
//
//        System.out.println(result);


/*        BigDecimal bigDecimal = new BigDecimal(7800);
        BigDecimal result = bigDecimal.multiply(new BigDecimal(0.006));
        System.out.println("结果为:" + result);
        BigDecimal total = result.setScale(8, BigDecimal.ROUND_HALF_UP);
        System.out.println("处理后的结果为:" + total);*/

//        order.setServiceCharge(result.setScale(8, BigDecimal.ROUND_HALF_UP));

      /*  String str = "【万恒科技】 验证码：#{code}，短信验证码，2分钟后失效，请输入进行身份认证登录万恒科技平台。敬请妥善保管，切勿泄露给他人。";

        Boolean flag = str.contains("#{code}");

        System.out.println(flag);

        String content = str.replace("#{code}", "413431");
        System.out.println(content);*/

        String money = "12";

        BigDecimal test = new BigDecimal(money);
        System.out.println(test);

        BigDecimal result = test.divide(new BigDecimal(100));

        System.out.println(result);
//        System.out.println(String.valueOf());


    }


}
