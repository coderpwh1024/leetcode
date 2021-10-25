package com.coderpwh.leetcode;

import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class Test {

    public static void main(String[] args) {

/*
        String path = "/Users/coderpwh/Downloads/9999_1_TDMF.jpg";


        String str = path.substring(path.lastIndexOf("/") + 1);

        System.out.println(str);


        String fid = "coderpwh/Desktop/images/9999_1.png";

        String result = fid.substring(0,fid.lastIndexOf("/")+1);
        System.out.println(result);

        System.out.println(result+str);*/


     /*   String str = "/Users/coderpwh/Desktop/up/b.jpeg";

        str.lastIndexOf("/");

        String result = str.substring(0,str.lastIndexOf("/")+1);

        System.out.println(result);
*/




  /*      Integer count = 0^2^4^6^8;
        System.out.println(count);
*/


    /*    String fid = "test/images/133_1620893435827.jpeg";

        String format = "png";

        String result = fid.substring(fid.lastIndexOf("/") + 1);


        System.out.println(result);*/

    /*    String str = "/Users/coderpwh/Desktop/up/c101_tmp.webp";

        String result = str.substring(str.lastIndexOf("/") + 1);

        System.out.println(result);

        String str2 = "test/images//c101.jpeg";

        String result2 = str2.substring(0, str2.lastIndexOf("//"));
        System.out.println(result2);
*/


//      Date date = new Date();

       /* String str = "c101_tmp.webp";

        str.contains(".");
        String resulst = str.substring(0, str.lastIndexOf("."));
        String a = str.substring(str.lastIndexOf("."),str.length());
        resulst=resulst+".cv"+a;
        System.out.println(resulst);*/


    /*   String str ="1.jpg";

      String r = str.substring(str.lastIndexOf(".")+1,str.length());
        System.out.println(r);*/


    /*    String fid = "d110.jpeg";

        String encryptOutput = "/Users/coderpwh/Desktop/up/d16_tmp_VTMH.webp";


        String a = "";
        if (fid.contains("/")) {
            a = fid.substring(0, fid.lastIndexOf("/"));
            System.out.println(a);
        }


        String b = encryptOutput.substring(encryptOutput.lastIndexOf("/") + 1);
        System.out.println(b);

//        if()
        fid = a + "/" + b;


        System.out.println(fid);*/


      /*  List<String> list = new ArrayList<>();

        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");


        int size = list.size();
        System.out.println(size);

        if (size > 0 && size % 2 != 0) {
            list.remove(size - 1);
            size=list.size();
        }

        System.out.println(list.size());
        System.out.println(list.size()/2);
        HashMap<String, String> hashMap = new HashMap<>();

        if (list != null && list.size() > 0) {
            for (int i = 0; i <((list.size()/2)); i++) {

                hashMap.put(list.get(i), list.get(size - i-1));
            }
        }


        for(String str:hashMap.keySet()){
            System.out.println("key:"+str+"  ,value:"+hashMap.get(str));
        }
*/
 /*         int m=6;

          int n=5;

          int count =m+321*n/100;
        System.out.println(count);*/

      Integer a = 2^32;

        System.out.println("a的大小为:"+a);


    }


}
