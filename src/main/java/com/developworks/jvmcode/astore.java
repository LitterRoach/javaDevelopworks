package com.developworks.jvmcode;

/**
 * <p>Title: astore</p>
 * <p>Description: 将一个引用类型数据保存到本地变量表</p>
 * <p>Author: ouyp </p>
 * <p>Date: 2018-05-19 15:43</p>
 */
public class astore {
    public void astore(Object obj) {
        Object x = obj;
    }
}
/**
 * public void astore(java.lang.Object);
 *     Code:
 *        0: aload_1
 *        1: astore_2
 *        2: return
 */