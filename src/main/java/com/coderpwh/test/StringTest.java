package com.coderpwh.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

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


        String str = "B";

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
        }


    }
}
