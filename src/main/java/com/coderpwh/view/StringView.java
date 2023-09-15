package com.coderpwh.view;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class StringView {

    public static void main(String[] args) {

        String one = "ab&&2";

        String regex = "&&";

        StringView sv = new StringView();
        String[] arr = sv.getStringOne(one,regex);

        if(arr!=null&&arr.length>0){
            for(String str:arr){
                System.out.println(str);
            }
        }


    }

    public String[] getStringOne(String str, String regex) {

        List<String> list = new ArrayList<>();

      /*  if(str!=null&&str!=""){
           String arr[]  =str.split("&&");
          if(arr.length>0){
              for(String s:arr){
                  System.out.print(s);
                  System.out.print(" ");
              }
          }
        }*/

        if (str != null && str != "") {
            int numberFlag = str.indexOf(regex);
            for (int i = 0; i < str.length(); i++) {
                if (i != numberFlag) {
                    list.add(String.valueOf(str.charAt(i)));
                }
            }
        }

        if (list != null && list.size() > 0) {
            String arr[] = new String[list.size()];
            for (int i = 0; i < list.size(); i++) {
                arr[i] = list.get(i);
            }
            return  arr;
        }

        return null;
    }

    public void test(){
        List<String> list = new ArrayList<>();

       /* String str="";
        str.equals();
        str.*/

    }

}
