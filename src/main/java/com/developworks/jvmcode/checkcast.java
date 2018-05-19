package com.developworks.jvmcode;

/**
 * <p>Title: checkcast</p>
 * <p>Description: 坚持对象是否符合给定的类型</p>
 * <p>Author: ouyp </p>
 * <p>Date: 2018-05-19 16:02</p>
 */
public class checkcast {
    public void checkcast(Object o) {
        String s = (String)o;
    }
}
/**
 * public void checkcast(java.lang.Object);
 *     Code:
 *        0: aload_1
 *        1: checkcast     #2                  // class java/lang/String
 *        4: astore_2
 *        5: return
 */