package com.coderpwh.view;

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
