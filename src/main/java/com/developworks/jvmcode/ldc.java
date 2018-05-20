package com.developworks.jvmcode;

/**
 * <p>Title: ldc</p>
 * <p>Description: 从运行时常量池提取数据并压入操作数栈</p>
 * <p>Author: ouyp </p>
 * <p>Date: 2018-05-20 15:04</p>
 */
public class ldc {
    public void ldc() {
        String s = "hello world!";
    }
}
/**
 *   public void ldc();
 *     Code:
 *        0: ldc           #2                  // String hello world!
 *        2: astore_1
 *        3: return
 */
