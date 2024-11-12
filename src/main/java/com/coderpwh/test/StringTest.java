package com.coderpwh.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringTest {

    public static void main(String[] args) {

/*        for(int i=0;i<10;i++){
//            return new BaseResponseInfo(RespCodeEnum.R500.getCode(), "", "第" + i + 1 + "条数据的SPU不存在");
            System.out.println("第"+i+1+"条数据的SPU不存在");
        }*/



    /*    String str = UUID.randomUUID().toString();
        System.out.println(str);
*/


       /* List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");

        StringBuffer buffer = new StringBuffer();
        list.stream().forEach(r -> {
            buffer.append(r).append(",");
        });

        System.out.println(buffer.toString());

        String str = buffer.toString();

        String[] arr = str.split(",");
        System.out.println(arr.length);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
*/


      /*  String str = "B";

        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        for (String s : list) {
            if (str.charAt(0) >= s.charAt(0)) {
                continue;
            } else {
                System.out.println(s);
            }
        }*/

//        String str = "0,(0,0.1]";

//        String str = "1,(0.05,0.1]";
//
//        str.split(",");
//
//        List<String> list = Arrays.asList(str.split(",", 2));
//        System.out.println("大小:"+list.size());
//
//        for (String s : list) {
//            System.out.println(s);
//        }

        String input="认识的人脸{触发间隔:60s}";

//        String input = "{12345}";

//        String input = "手机Z轴角度1秒内变化10度";

         boolean flag= input.contains("{");
        System.out.println(flag);

        Pattern pattern = Pattern.compile("\\d+"); // 匹配一个或多个数字
        Matcher matcher = pattern.matcher(input);
        if (matcher.find()) {
            System.out.println(matcher.group()); // 输出匹配到的数字
        }




    }
}
