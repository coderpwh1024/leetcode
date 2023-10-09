package com.coderpwh.juc;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author coderpwh
 * @date 2023/10/9 15:54
 */
public class LockExample {

    private Lock lock = new ReentrantLock();


    public static void main(String[] args) {
        LockExample example = new LockExample();
        example.fun();

    }

    public void fun() {
        lock.lock();
        try {
            for (int i = 0; i <= 100; i++) {
                System.out.println(i);
            }
        } finally {
            lock.unlock();
        }
    }


}
