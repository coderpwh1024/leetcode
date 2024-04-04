package com.coderpwh.view;

import java.util.ArrayList;
import java.util.List;

/**
 * 1. 字符串拆分成数组 如 "ab&&2" 通过 &&做分隔符，分割得到字符串数组["ab",2]
 * <p>
 * 2. 实现字符串组合, 如["ab","2"] 通过“&&”分隔符，组合成字符串“ab&&2”;
 *
 * @author coderpwh
 */
public class StringTest {

    public static void main(String[] args) {

        String arr[] = {"ab", "2"};
        String str = "&&";

        String result = getStringResult(arr, str);
        System.out.println(result);

        System.out.println("---------------------------------");

        String strArray ="ab&&2&&c&&ef";


        List<String> list =   getStringArrayResult(strArray,str);

        for(String resultString:list){
            System.out.println(resultString);
        }

    }



    public static List<String> getStringArrayResult(String arr,String str){

        if(arr.length()<=0){
            return  null;
        }

        List<String> list = new ArrayList<>();

        StringBuilder builder = new StringBuilder();
        for(int i=0;i<arr.length();i++){
            int j = arr.indexOf(str);
            if(i==j){
                if(builder.length()>0){
                    list.add(builder.toString());
                    builder.setLength(0);
                }
                i+=str.length();
            }else{
                builder.append(arr.charAt(i));
            }
        }
        if(builder.length()>0){
            list.add(builder.toString());
        }

        return  list;
    }


    public static String getStringResult(String[] arr, String str) {

        if (arr.length <= 0) {
            return null;
        }

        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i <= arr.length - 1; i++) {
            if (i == arr.length - 1) {
                buffer.append(arr[i]);
            } else {
                buffer.append(arr[i]).append(str);
            }

        }
        return buffer.toString();
    }
}
