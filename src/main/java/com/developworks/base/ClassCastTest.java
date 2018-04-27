package com.developworks.base;

import org.junit.Test;

/**
 * <p>Title: 父类与子类转换</p>
 * <p>Description: Java父类强制转换子类原则</p>
 * <p>Author: ouyp </p>
 * <p>Date: 2018-04-27 14:37</p>
 */
public class ClassCastTest {

    static class Fruit {
    }
    static class Apple extends Fruit {
    }

    @Test(expected = ClassCastException.class)
    public void test01() {
        Fruit fruit = new Fruit();
        Apple apple = new Apple();
        apple = (Apple)fruit;
        System.out.println("test01转换正常");
    }

    @Test
    public void test02() {
        Fruit fruit = new Apple();
        Apple apple = new Apple();
        apple = (Apple)fruit;
        System.out.println("test02转换正常");
    }

    public static void main(String[] args) {
        ClassCastTest main = new ClassCastTest();
        main.test01();
        main.test02();
    }
}
