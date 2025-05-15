package com.coderpwh.juc;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumer {


    private static BlockingQueue<String> queue = new ArrayBlockingQueue<>(5);


    /***
     * 生产者
     */
    private static  class  Producer extends  Thread{
        @Override
        public void run(){
            try {
                queue.put("product");
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }


    /***
     * 消费者
     */
    private  static  class  Consumer extends  Thread{
        @Override
        public void run(){
            try {
                String product = queue.take();
            }catch (Exception e){
                e.printStackTrace();
            }
            System.out.println("consumer.....");
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 2; i++) {
            Producer producer = new Producer();
            producer.start();
        }
        for (int i = 0; i < 5; i++) {
            Consumer consumer = new Consumer();
            consumer.start();
        }
        for (int i = 0; i < 3; i++) {
            Producer producer = new Producer();
            producer.start();
        }
    }

}
