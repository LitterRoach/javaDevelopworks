package com.developworks.jvmcode;

import java.util.Date;

/**
 * <p>Title: invokespecial</p>
 * <p>Description: 调用实例方法，专门用于调用父类方法，私有方法和实例初始化方法</p>
 * <p>Author: ouyp </p>
 * <p>Date: 2018-05-20 14:08</p>
 */
public class invokespecial {
    public void invokespecial_1(){
        super.toString();
    }
    /**
     * public void invokespecial_1();
     *     Code:
     *        0: aload_0
     *        1: invokespecial #2                  // Method java/lang/Object.toString:()Ljava/lang/String;
     *        4: pop
     *        5: return
     */

    private void pm() {

    }
    public void invokespecial_2() {
        pm();
    }
    /**
     * public void invokespecial_2();
     *     Code:
     *        0: aload_0
     *        1: invokespecial #3                  // Method pm:()V
     *        4: return
     */

    public void invokespecial_3() {
        Date d = new Date();
    }
    /**
     * public void invokespecial_3();
     *     Code:
     *        0: new           #4                  // class java/util/Date
     *        3: dup
     *        4: invokespecial #5                  // Method java/util/Date."<init>":()V
     *        7: astore_1
     *        8: return
     */

}
