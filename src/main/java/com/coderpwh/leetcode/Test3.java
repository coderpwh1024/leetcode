package com.coderpwh.leetcode;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class Test3 {

    public static void main(String[] args) {

    /*    List<Integer> list = new ArrayList<>();

        for (int i = 0; i <= 9; i++) {
            list.add(i);
        }
//        list.removeIf(r -> r % 2 == 0);

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer count = iterator.next();
            if (count % 2 == 0) {
                iterator.remove();
            }

        }


        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            System.out.print("  ");
        }*/

   /*   List<Integer> list = new ArrayList<>();
      for(int i=0;i<500;i++){
          list.add(i);
      }


      int total = 5+ list.size()*1/100;
        System.out.println(total);

    }*/

        String endDate = "2021-09-27 23:59:59";

        String startDate = "2021-09-27 23:58:59";


        long count = getTest(startDate, endDate);

        System.out.println(count);


    }


    public static Long getTest(String startDate, String endDate) {

        try {

            SimpleDateFormat dfs = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

            Date start = dfs.parse(startDate);

            Date end = dfs.parse(endDate);

            Long coount = (end.getTime() - start.getTime())/1000;

            System.out.println(coount);


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


        return 0L;


    }


    public static Long getMills(String startDate, String endDate) {


        Long between;
        try {
            SimpleDateFormat dfs = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

            Date start = dfs.parse(startDate);

            Date end = dfs.parse(endDate);

            between = (end.getTime() - start.getTime());

            long day = between / (24 * 60 * 60 * 1000);
            long hour = (between / (60 * 60 * 1000) - day * 24);
            long min = ((between / (60 * 1000)) - day * 24 * 60 - hour * 60);
            long s = (between / 1000 - day * 24 * 60 * 60 - hour * 60 * 60 - min * 60);

            return s;


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return 0L;
    }


}
