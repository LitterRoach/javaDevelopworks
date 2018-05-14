package com.developworks.base;

import org.junit.Test;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Author: ouyp </p>
 * <p>Date: 2018-05-08 21:43</p>
 */
public class CallableTest {

    class MyCallale implements Callable<Integer> {
        public Integer call() {
            int sum = 0;
            System.out.println("====================开始执行任务=================");
            for (int i = 0; i < 100; i++) {
                sum += new Random(i).nextInt();
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("====================结束执行任务=================");
            return sum;
        }
    }

    @Test
    public void testCall() throws Exception {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Callable<Integer> callable = new MyCallale();
        long start = System.currentTimeMillis();
        Future<Integer> future = executor.submit(callable);
        Integer integer = future.get();
        System.out.println("执行时间：" + (System.currentTimeMillis() - start));
        System.out.println("结果：" + integer);
        executor.shutdown();
    }

}
