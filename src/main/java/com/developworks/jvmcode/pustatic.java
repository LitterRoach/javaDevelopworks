package com.developworks.jvmcode;

/**
 * <p>Title: pustatic</p>
 * <p>Description: 设置类静态对象</p>
 * <p>Author: ouyp </p>
 * <p>Date: 2018-05-20 16:29</p>
 */
public class pustatic {
    static String name;
    public void putstatic() {
        name = "1";
    }
}
/**
 * public void putstatic();
 *     Code:
 *        0: ldc           #2                  // String 1
 *        2: putstatic     #3                  // Field name:Ljava/lang/String;
 *        5: return
 */
