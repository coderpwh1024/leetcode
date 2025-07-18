package com.coderpwh.test;

import java.util.ArrayList;
import java.util.List;

public class Priority {


    private static volatile boolean notStart = true;


    private static volatile boolean notEnd = true;


    public static void main(String[] args) {

        List<Job> jobs = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            int priority = i < 5 ? Thread.MIN_PRIORITY : Thread.MAX_PRIORITY;
            Job job = new Job(priority);
            jobs.add(job);
            Thread thread = new Thread(job, "Thread:" + i);
            thread.setPriority(priority);
            thread.start();
        }
        notStart = false;
        while (notEnd) {
            for (Job job : jobs) {
                if (job.jobCount != 0) {
                    System.out.println(Thread.currentThread().getName() + "  " + job.priority + "  " + job.jobCount);
                }
            }
        }



    }


    static class Job implements Runnable {

        private int priority;

        private long jobCount;

        public Job(int priority) {
            this.priority = priority;
            jobCount = 0;
        }

        @Override
        public void run() {

            while (notStart) {
                Thread.yield();
            }

            while (notEnd) {
                Thread.yield();
                jobCount++;
            }

        }
    }

}
