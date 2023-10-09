package com.coderpwh.juc;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author coderpwh
 * @date 2023/10/9 16:24
 */
public class CountdownLatchExample {

    public static void main(String[] args) {
        int totalThread = 50;

        CountDownLatch countDownLatch = new CountDownLatch(totalThread);

//        ExecutorService executorService = Executors.newCachedThreadPool();

        try {
            for (int i = 0; i < totalThread; i++) {
                ThreadPoolFactory.addTaskAttendanceRecordSubmit(() -> {
                    System.out.println("run...");
                    countDownLatch.countDown();
                });
            }
            countDownLatch.await();
            System.out.println("end");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
