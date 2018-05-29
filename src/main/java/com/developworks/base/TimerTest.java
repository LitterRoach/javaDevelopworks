package com.developworks.base;

import org.junit.Test;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * <p>Title: Timer测试</p>
 * <p>Description: </p>
 * <p>Author: ouyp </p>
 * <p>Date: 2018-05-29 21:19</p>
 */
public class TimerTest {

    @Test
    public void test01() throws InterruptedException {
        final Timer timer = new Timer ();
        timer.schedule (new TimerTask () {
            @Override
            public void run() {
                System.out.println("nowTime:" + this.scheduledExecutionTime ());
            }
        }, 1000, 1000);
        new Thread(){
            @Override
            public void run() {
                try {
                    Thread.sleep (1000 * 3);
                } catch (Exception e) {

                }
                System.out.println (Thread.currentThread ().getName () + ":停止timer");
                timer.cancel ();
            }
        }.start ();
        Thread.sleep (10 * 1000);
    }

    @Test
    public void test2() throws InterruptedException {
        Timer timer = new Timer();
        final AtomicInteger counter = new AtomicInteger(0);
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                int i = counter.incrementAndGet();
                System.out.println("当前线程：" + Thread.currentThread() + ",T1执行中，已将i自增到:" + i);
                if (i == 10) {
                    throw new RuntimeException("我只想抛出个异常玩玩!!");
                }
            }
        }, 1000, 1000);
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                System.out.println("当前线程：" + Thread.currentThread() + "T2已执行执行,当前时间" + this.scheduledExecutionTime());
            }
        }, 1000, 500);
        Thread.sleep(1000 * 20);
    }

}
