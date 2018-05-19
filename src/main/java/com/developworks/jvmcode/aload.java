package com.developworks.jvmcode;

/**
 * <p>Title: aload</p>
 * <p>Description: 从局部变量表加载一个reference类型值到操作数栈中</p>
 * <p>Author: ouyp </p>
 * <p>Date: 2018-05-19 15:30</p>
 */
public class aload {
    public void aload() {
        Object x = null;
        Object y = x;
    }
}
/**
 * public void aload();
 *     Code:
 *        0: aconst_null
 *        1: astore_1
 *        2: aload_1
 *        3: astore_2
 *        4: return
 */