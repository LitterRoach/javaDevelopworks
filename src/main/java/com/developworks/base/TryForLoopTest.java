package com.developworks.base;

/**
 * <p>Title: for与异常方式性能测试</p>
 * <p>Description: </p>
 * <p>Author: ouyp </p>
 * <p>Date: 2018-05-08 17:02</p>
 */
public class TryForLoopTest {

    static int[] tests = {1,2,3,4,5,6};
    static int size = 100 * 100 * 100;


    public static void excpetionLoop() {
        long start = System.currentTimeMillis();
        for (int i = 0; i < size; i ++) {
            try {
                int j = 0;
                while (true) {
                    tests[j++] = 0;
                    int kk = tests[j++] + 1;
                }
            } catch (Exception e) {
                //
            }
        }
        System.out.println("forLoop:" + (System.currentTimeMillis() - start));
    }

    public static void forLoop() {
       long start = System.currentTimeMillis();
        for (int i = 0; i < size; i ++) {
           for (int a : tests) {
                //
               a = 0;
               int kk = a + 1;
           }
       }
       System.out.println("forLoop:" + (System.currentTimeMillis() - start));
    }

    public  static void main(String[] args) {
        excpetionLoop();
        forLoop();
    }
}
