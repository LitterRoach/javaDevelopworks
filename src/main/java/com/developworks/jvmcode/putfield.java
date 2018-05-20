package com.developworks.jvmcode;

/**
 * <p>Title: putfield</p>
 * <p>Description: 设置对象字段</p>
 * <p>Author: ouyp </p>
 * <p>Date: 2018-05-20 16:27</p>
 */
public class putfield {
    String name;
    public void putfield() {
        this.name = "kk";
    }
}
/**
 *   public void putfield();
 *     Code:
 *        0: aload_0
 *        1: ldc           #2                  // String kk
 *        3: putfield      #3                  // Field name:Ljava/lang/String;
 *        6: return
 */
