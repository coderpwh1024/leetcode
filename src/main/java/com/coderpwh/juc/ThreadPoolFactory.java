package com.coderpwh.juc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.*;

/**
 * @author coderpwh
 * @date 2023/10/9 14:02
 */
public class ThreadPoolFactory {

    private static Logger logger = LoggerFactory.getLogger(ThreadPoolFactory.class);
    private static int init_pool_size = 4;

    private static int max_pool_size = 10;


    /***
     * 线程池
     */
    public static final ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(init_pool_size, max_pool_size, 0, TimeUnit.MILLISECONDS, new LinkedBlockingDeque<>(), new ThreadPoolExecutor.AbortPolicy());


    /***
     * 异步
     * @param r
     * @return
     */
    public static String addTaskAttendanceRecordSubmit(Runnable r) {
        logger.info("当前运行的线程数为:{}", getActiveCount(threadPoolExecutor));
        logger.info("当前阻塞的队列数为:{}", getBlockingQueue(threadPoolExecutor));
        threadPoolExecutor.execute(r);
        return "success";
    }


    /***
     * 同步
     * @param r
     * @return
     */
    public static String addTaskAttendanceRecordSubmit(Callable r) {
        logger.info("当前运行的线程数为:{}", getActiveCount(threadPoolExecutor));
        logger.info("当前阻塞的队列数为:{}", getBlockingQueue(threadPoolExecutor));

        String result = null;

        Future future = threadPoolExecutor.submit(r);
        try {
            Object obj = future.get();
            if (obj != null) {
                result = (String) obj;
            }
        } catch (Exception e) {
            logger.error("同步线程错误信息为:{}", e.getMessage());
        }
        return "success";
    }


    /***
     * 当前线程数
     * @param pool
     * @return
     */
    public static Integer getActiveCount(ThreadPoolExecutor pool) {
        return pool.getActiveCount();
    }


    /**
     * 最大线程数
     *
     * @param pool
     * @return
     */
    public static Integer getMaximumPoolSize(ThreadPoolExecutor pool) {
        return pool.getMaximumPoolSize();
    }


    /***
     * 当前阻塞队里
     * @param pool
     * @return
     */
    public static Integer getBlockingQueue(ThreadPoolExecutor pool) {
        return pool.getQueue().size();
    }

}
