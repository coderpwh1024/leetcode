package com.coderpwh.test;

import org.springframework.util.StringUtils;

import java.io.UnsupportedEncodingException;

/**
 * @author coderpwh
 * @date 2023/3/11 10:57
 */
public class EncodeTest {
    public static void main(String[] args) throws UnsupportedEncodingException {


        String chinese = "88Ԫ��ֵ200Ԫ���ѣ��������Ǽٵ�";
//        getEncoding(chinese);
//        System.out.println(getEncoding(chinese));
        System.out.println("---------------------------------------------------");

//        System.out.println(checkUTF(chinese));
//        System.out.println(checkUnicode(chinese));
//        System.out.println(checkISO(chinese));
        System.out.println("------------------------------------------------------");

        test();
        System.out.println("------------------------------------------------------");
//        test2();

    }

    public static void test() throws UnsupportedEncodingException {

//        String chinese = "����ͨappΥ����ȡ��Ա���ṩ���\uE8EC������ȡ���ã�������Ա�ͽ�\uECBB��������Ҫ����Ա�����á�Υ����ȡ����";

        //java内部编码
        String chinese = "投诉";
        //转换成gbk编码
        String gbkChinese = new String(chinese.getBytes("GBK"), "ISO-8859-1");
        System.out.println("gbk:" + gbkChinese);
        //java内部编码
        String unicodeChinese = new String(gbkChinese.getBytes("ISO-8859-1"), "GBK");
        //中文
        System.out.println(unicodeChinese);
        //utf--8编码
        String utf8Chinese = new String(unicodeChinese.getBytes("UTF-8"), "ISO-8859-1");
        //乱码
        System.out.println(utf8Chinese);
        //java内部编码
        unicodeChinese = new String(utf8Chinese.getBytes("ISO-8859-1"), "UTF-8");
        //中文
        System.out.println(unicodeChinese);
    }

    public static void test2() throws UnsupportedEncodingException {
        String str = "投诉";
        String unicodeChinese = new String(str.getBytes("GBK"), "UTF-8");
        System.out.println(unicodeChinese);

        String str2 = "投诉风险（收到客户投诉）";
        String unicodeChinese2 = new String(str2.getBytes("GBK"), "UTF-8");
        System.out.println(unicodeChinese2);

    }


    public static boolean checkISO(String str) {
        boolean flag = java.nio.charset.Charset.forName("ISO-8859-1").newEncoder().canEncode(str);
        return flag;
    }

    /**
     * 判断是否为UTF-8
     *
     * @return
     */
    public static boolean checkUTF(String str) {

        boolean flag = java.nio.charset.Charset.forName("UTF-8").newEncoder().canEncode(str);
        return flag;
    }

    public static boolean checkUnicode(String str) {
        boolean flag = java.nio.charset.Charset.forName("unicode").newEncoder().canEncode(str);
        return flag;
    }


    public static String getEncoding(String str) {
        String encode = "unicode";
        try {
            if (str.equals(new String(str.getBytes(encode), encode))) {
                String s = encode;
                return s;
            }
        } catch (Exception exception) {
        }
        encode = "ISO-8859-1";
        try {
            if (str.equals(new String(str.getBytes(encode), encode))) {
                String s1 = encode;
                return s1;
            }
        } catch (Exception exception1) {
        }
        encode = "UTF-8";
        try {
            if (str.equals(new String(str.getBytes(encode), encode))) {
                String s2 = encode;
                return s2;
            }
        } catch (Exception exception2) {
        }
        encode = "GBK";
        try {
            if (str.equals(new String(str.getBytes(encode), encode))) {
                String s3 = encode;
                return s3;
            }
        } catch (Exception exception3) {
        }
        return "";
    }

    private static String unicode2String(String unicode) {
        if (StringUtils.isEmpty(unicode)) {
            return null;
        }

        StringBuilder sb = new StringBuilder();
        int i = -1;
        int pos = 0;

        while ((i = unicode.indexOf("\\u", pos)) != -1) {
            sb.append(unicode.substring(pos, i));
            if (i + 5 < unicode.length()) {
                pos = i + 6;
                sb.append((char) Integer.parseInt(unicode.substring(i + 2, i + 6), 16));
            }
        }
        //如果pos位置后，有非中文字符，直接添加
        sb.append(unicode.substring(pos));

        return sb.toString();
    }


}
