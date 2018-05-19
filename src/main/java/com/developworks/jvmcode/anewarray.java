package com.developworks.jvmcode;

/**
 * <p>Title: anewarray</p>
 * <p>Description: 创建一个组件类型为引用类型的数组</p>
 * <p>Author: ouyp </p>
 * <p>Date: 2018-05-19 15:35</p>
 */
public class anewarray {
    public void anewarray() {
        Object[] arr = new Object[2];
    }
}
/**
 * public void anewarray();
 *     Code:
 *        0: iconst_2
 *        1: anewarray     #2                  // class java/lang/Object
 *        4: astore_1
 *        5: return
 */
