package com.developworks.jvmcode;

/**
 * <p>Title: new2</p>
 * <p>Description: 创建一个对象</p>
 * <p>Author: ouyp </p>
 * <p>Date: 2018-05-20 16:10</p>
 */
public class new2 {
    public void new2() {
        Object o = new Object();
    }
}
/**
 * public void new2();
 *     Code:
 *        0: new           #2                  // class java/lang/Object
 *        3: dup
 *        4: invokespecial #1                  // Method java/lang/Object."<init>":()V
 *        7: astore_1
 *        8: return
 */