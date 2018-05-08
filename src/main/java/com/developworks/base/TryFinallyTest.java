package com.developworks.base;

/**
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Author: ouyp </p>
 * <p>Date: 2018-05-08 15:02</p>
 */
public class TryFinallyTest {

    public static void main(String[] args) {
        System.out.println(decision());
    }

    /**
     * finally语句中return,break,continue,throw会导致意外终止，代码中请禁止此语法
     * @return
     */
    public static boolean decision() {
        try {
            return true;
        } finally {
            return false;
        }
    }
}
