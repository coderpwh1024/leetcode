package com.coderpwh.juc;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author coderpwh
 * @date 2023/10/9 16:00
 */
public class AwaitSignalExample {

    private Lock lock = new ReentrantLock();

    private Condition condition = lock.newCondition();


    public void before() {
        lock.lock();
        try {
            System.out.println("before");
            condition.signalAll();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void after() {
        lock.lock();
        try {
            condition.await();
            System.out.println("after");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        AwaitSignalExample example = new AwaitSignalExample();

        ThreadPoolFactory.addTaskAttendanceRecordSubmit(new Runnable() {
            @Override
            public void run() {
                example.after();
                example.before();
            }
        });


    }


}
