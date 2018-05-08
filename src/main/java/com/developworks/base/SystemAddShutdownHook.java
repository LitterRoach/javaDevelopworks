package com.developworks.base;

/**
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Author: ouyp </p>
 * <p>Date: 2018-05-08 16:12</p>
 */
public class SystemAddShutdownHook {

    public static void main(String[] args) throws InterruptedException {
        Runtime.getRuntime().addShutdownHook(new Thread(){
            @Override
            public void run() {
                System.out.println("收到关闭信号，hook开始启动!");
                for (int i = 1; i <= 100; i ++) {
                    System.out.print(i);
                    System.out.print("\t");
                    if (i % 10 == 0) {
                        System.out.println();
                    }
                    try {
                        Thread.sleep(5);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        System.out.println("暂停会儿！");
        Thread.sleep(100);
        System.exit(0);
    }
}
