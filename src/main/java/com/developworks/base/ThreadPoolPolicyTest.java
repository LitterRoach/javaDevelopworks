package com.developworks.base;

import org.junit.Test;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * <p>Title: ThreadPoolPolicy</p>
 * <p>Description: </p>
 * <p>Author: ouyp </p>
 * <p>Date: 2018-05-22 15:08</p>
 */
public class ThreadPoolPolicyTest {

    /**
     * 当任务添加到线程池中被拒绝时，线程池将丢弃被拒绝的任务。
     */
    @Test
    public void DiscardPolicyTest() {
        exuecute (new ThreadPoolExecutor.DiscardPolicy () {
            @Override
            public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
                System.out.println("r" + r.toString () + " rejected!");
            }
        });
    }

    /**
     * 当任务添加到线程池中被拒绝时，线程池将丢弃被拒绝的任务。
     */
    @Test
    public void DiscardOldestPolicyTest() {
        exuecute (new ThreadPoolExecutor.DiscardOldestPolicy (){
            @Override
            public void rejectedExecution(Runnable r, ThreadPoolExecutor e) {
                if (!e.isShutdown()) {
                    Runnable or = e.getQueue ().poll ();
                    System.out.println ("Runable:" + r.toString () + " rejected!");
                    System.out.println ("oldRunable:" + or.toString () + " replaced!");
                    e.execute(r);
                }
            }
        });
    }

    /**
     * 当任务添加到线程池中被拒绝时，它将抛出 RejectedExecutionException 异常。
     */
    @Test
    public void AbortPolicyTest() {
        exuecute (new ThreadPoolExecutor.AbortPolicy ());
    }

    /**
     *  当任务添加到线程池中被拒绝时，会在线程池当前正在运行的Thread线程池中处理被拒绝的任务。
     */
    @Test
    public void CallerRunsPolicyTest() {
        exuecute (new ThreadPoolExecutor.CallerRunsPolicy ());
    }


    public void exuecute(RejectedExecutionHandler rejectedExecutionHandler) {
        ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor (1, 2, 60, TimeUnit.SECONDS, new ArrayBlockingQueue<Runnable> (1));
        poolExecutor.setRejectedExecutionHandler (rejectedExecutionHandler);

        for (int i = 0; i < 10; i++) {
            poolExecutor.execute(new MyThread ("a" + i));
        }
        poolExecutor.shutdown ();
    }

    class MyThread extends Thread {
        String name;
        MyThread(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            System.out.println(Thread.currentThread ().getName () + " is running, my name:" + name);
            try {
                Thread.sleep (10);
            } catch (InterruptedException e) {
                e.printStackTrace ();
            }
        }
    }


}
