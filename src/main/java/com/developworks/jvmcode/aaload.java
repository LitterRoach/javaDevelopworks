package com.developworks.jvmcode;

/**
 * <p>Title: aastore指令</p>
 * <p>Description: 从数组中加载一个引用对象到操作栈中</p>
 * <p>Author: ouyp </p>
 * <p>Date: 2018-05-19 15:08</p>
 */
public class aaload {
    public void aaload(Object[] arr) {
        Object x = arr[0];
    }
}
/**
 * public void aaload(java.lang.Object[]);
 *     Code:
 *        0: aload_1
 *        1: iconst_0
 *        2: aaload
 *        3: astore_2
 *        4: return
 */


