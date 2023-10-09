package com.coderpwh.juc;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author coderpwh
 * @date 2023/10/9 14:02
 */
public class ThreadPoolFactory {


    private static int init_pool_size = 4;

    private static int max_pool_size = 10;


    /***
     * 线程池
     */
    public static final ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(init_pool_size, max_pool_size, 0, TimeUnit.MILLISECONDS, new LinkedBlockingDeque<>(), new ThreadPoolExecutor.AbortPolicy());


    public static String addTaskAttendanceRecordSubmit(Runnable r) {
        threadPoolExecutor.execute(r);
        return "success";
    }


    public static Integer getActiveCount(ThreadPoolExecutor pool) {
        return pool.getActiveCount();
    }


    public static Integer getMaximumPoolSize(ThreadPoolExecutor pool) {
        return pool.getMaximumPoolSize();
    }


    public static Integer getBlockingQueue(ThreadPoolExecutor pool) {
        return pool.getQueue().size();
    }

}
