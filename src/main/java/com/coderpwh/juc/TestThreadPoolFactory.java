package com.coderpwh.juc;

import java.util.concurrent.Callable;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author coderpwh
 * @date 2023/10/9 15:09
 */
public class TestThreadPoolFactory {

    public static void main(String[] args) {

        TestThreadPoolFactory factory = new TestThreadPoolFactory();

        long n = 100000000L;

        // 异步
        ThreadPoolFactory.addTaskAttendanceRecordSubmit(new Runnable() {
            @Override
            public void run() {
                Long result = factory.printOne(n);
                System.out.println(result);
                String stringResult = factory.printTwo(n);
                System.out.println(stringResult);
            }
        });


        // 同步
        /*ThreadPoolFactory.addTaskAttendanceRecordSubmit(new Callable() {
            @Override
            public Object call() throws Exception {
                Long result = factory.printOne(n);
                System.out.println(result);
                String stringResult = factory.printTwo(n);
                System.out.println(stringResult);
                return "success";
            }
        });*/


    }

    public long printOne(long n) {
        long sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public String printTwo(long n) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i <= n; i++) {
            builder.append(i);
        }
        return builder.toString();
    }

}
