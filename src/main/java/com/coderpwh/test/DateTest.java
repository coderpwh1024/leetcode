package com.coderpwh.test;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjusters;

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


    }

}
