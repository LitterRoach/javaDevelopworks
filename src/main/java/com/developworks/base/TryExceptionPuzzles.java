package com.developworks.base;

import org.junit.Test;

/**
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Author: ouyp </p>
 * <p>Date: 2018-05-08 15:30</p>
 */
public class TryExceptionPuzzles {

    @Test
    public void f1() {
        try{
            System.out.println("hello world");
        }catch (RuntimeException e) {
        //}catch (IOException e) {//无法编译成功
            System.out.println("catch block!");
        }
    }

    @Test
    public void f2() {
        try{
            //System.out.println("hello world");
        }catch (Exception e) {//无法编译成功
            System.out.println("catch block!");
        }
    }

    @Test
    public void f3() {
       T4 t4 = new T4();
       t4.f1();
    }

    interface T1 {
        void f1() throws ClassNotFoundException;
    }

    interface  T2 {
        void f1() throws InterruptedException;
    }

    interface  T3 extends  T1, T2{
    }

    class T4 implements T3 {
        public void f1() {//一个方法可以抛出的被检查异常集合是它所适用的所有类型声明要抛出的被检查异常集合的交集,而不是合集。因此,静态类型为 Type3 的对象上的 f 方法根本就不能抛出任何被检查异常。
            System.out.println("hello world!");
        }
    }
}
