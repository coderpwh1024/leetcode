package com.coderpwh.test;

import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.util.Date;
import java.util.Locale;

public class DateTest {

    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now();

        System.out.println("当月第一天 0:00时刻" + now.withDayOfMonth(1).toLocalDate().atStartOfDay());
        System.out.println("当月的第一天:" + now.with(TemporalAdjusters.firstDayOfNextMonth()));
        System.out.println("下月第一天:" + now.with(TemporalAdjusters.firstDayOfNextMonth()));
        System.out.println("明年第一天:" + now.with(TemporalAdjusters.firstDayOfNextYear()));
        System.out.println("本年的第一天:" + now.with(TemporalAdjusters.firstDayOfYear()));
        System.out.println("当月的最后一天:" + now.with(TemporalAdjusters.lastDayOfMonth()));
        System.out.println("本年最后一天:" + now.with(TemporalAdjusters.lastDayOfYear()));
        System.out.println("当月第三周星期五:" + now.with(TemporalAdjusters.dayOfWeekInMonth(3, DayOfWeek.FRIDAY)));
        System.out.println("上周一:" + now.with(TemporalAdjusters.previous(DayOfWeek.MONDAY)));
        System.out.println("下周日:" + now.with(TemporalAdjusters.next(DayOfWeek.SUNDAY)));


        System.out.println("----------------------------------------------------------------------------");

        ZonedDateTime zbj = ZonedDateTime.now(ZoneId.of("Asia/Shanghai"));
        // 转换为纽约时间:
        ZonedDateTime zny = zbj.withZoneSameInstant(ZoneId.of("America/New_York"));
        System.out.println(zbj);
        System.out.println(zny);


        System.out.println("----------------------------------------------------------------------------");
        ZonedDateTime zdt = ZonedDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm ZZZZ");
        System.out.println(formatter.format(zdt));

        DateTimeFormatter zhFormatter = DateTimeFormatter.ofPattern("yyyy MMM dd EE HH:mm", Locale.CHINA);
        System.out.println(zhFormatter.format(zdt));


        DateTimeFormatter usFormatter = DateTimeFormatter.ofPattern("E, MMMM/dd/yyyy HH:mm", Locale.US);
        System.out.println(usFormatter.format(zdt));
        System.out.println("-----------------------------LocalTime与Date相互转换-------------------------------------");


        LocalDateTime localDateTime = LocalDateTime.now();
        ZonedDateTime zonedDateTime = localDateTime.atZone(ZoneId.systemDefault());
        Date date = Date.from(zonedDateTime.toInstant());
        System.out.println("date:" + date);


        Date date2 = new Date();
        Instant instant = date2.toInstant();
        LocalDateTime localDateTime2 = instant.atZone(ZoneId.systemDefault()).toLocalDateTime();
        System.out.println(localDateTime2);


    }

}
