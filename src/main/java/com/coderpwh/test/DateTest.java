package com.coderpwh.test;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @author coderpwh
 * @date 2022/9/8 9:55
 */
public class DateTest {

    public static void main(String[] args) {

    /*    ZonedDateTime zdt = ZonedDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm ZZZZ");
        System.out.println(formatter.format(zdt));

        DateTimeFormatter zhFormatter = DateTimeFormatter.ofPattern("yyyy MMM dd EE HH:mm", Locale.CHINA);
        System.out.println(zhFormatter.format(zdt));

        DateTimeFormatter usFormatter = DateTimeFormatter.ofPattern("E, MMMM/dd/yyyy HH:mm", Locale.US);
        System.out.println(usFormatter.format(zdt));

        System.out.println("--------------------------------------------------------------");

        DateTimeFormatter chinaFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss", Locale.CHINA);
        System.out.println(chinaFormatter.format(zdt));

        String time = chinaFormatter.format(zdt);

        DateTimeFormatter timeFormatter = DateTimeFormatter.ISO_OFFSET_DATE_TIME;
        timeFormatter.format(zdt);
        System.out.println(timeFormatter.format(zdt));*/


        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("");
        list.add("");
        List<String> dateList = list.stream().filter(r ->r!=null&&r!="").collect(Collectors.toList());
        System.out.println(list.size());
        System.out.println(dateList.size());
        System.out.println(dateList);


    }

}
