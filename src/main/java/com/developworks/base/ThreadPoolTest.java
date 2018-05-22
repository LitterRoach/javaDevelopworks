package com.developworks.base;

import org.junit.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * <p>Title: 线程池的使用做简单演示</p>
 * <p>Description: </p>
 * <p>Author: ouyp </p>
 * <p>Date: 2018-05-22 11:20</p>
 */
public class ThreadPoolTest {
    class MyThread implements Runnable {
        String name;
        public MyThread(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + " is running, Myname:" + name);
        }
    }

    @Test
    public void testMyThread() throws Exception {
        MyThread ma = new MyThread("a");
        MyThread mb = new MyThread("b");
        MyThread mc = new MyThread("c");
        MyThread md = new MyThread("d");

        ExecutorService threadPool = Executors.newFixedThreadPool(2);
        //ThreadPoolExecutor threadPool = (ThreadPoolExecutor)Executors.newCachedThreadPool();
        threadPool.submit(ma);
        threadPool.submit(mb);
        threadPool.submit(mc);
        threadPool.submit(md);

        Thread.sleep(20);
//        System.out.println("activeCount:" + threadPool.getActiveCount());
//        System.out.println("completedTaskCount:" + threadPool.getCompletedTaskCount());
//        System.out.println("corePoolSize:" + threadPool.getCorePoolSize());
        threadPool.shutdown();
    }
}
