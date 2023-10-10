package com.coderpwh.juc;

import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author coderpwh
 * @date 2023/10/10 15:11
 */
public class HashMapTest {


    public static void main(String[] args) {

        getHashMap();

        getConcurrentHashMap();
    }


    public static void getHashMap() {

        final HashMap<String, String> map = new HashMap<String, String>(2);

        try {
            Thread t = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i < 10000; i++) {
                        new Thread(() -> {
                            map.put(UUID.randomUUID().toString(), "");
                        }, "ftf" + i).start();
                    }
                }
            }, "ftf");
            t.start();
//            t.join();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void getConcurrentHashMap() {
        ConcurrentHashMap<String, String> concurrentHashMap = new ConcurrentHashMap<>();
        try {
            Thread t = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i < 10000; i++) {
                        new Thread(() -> {
                            concurrentHashMap.put(UUID.randomUUID().toString(), "");
                        }, "ftf" + i).start();
                    }
                }
            }, "ftf");
            t.start();
            t.join();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
