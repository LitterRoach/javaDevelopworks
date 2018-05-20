package com.developworks.jvmcode;

/**
 * <p>Title: invokeinterface</p>
 * <p>Description: 调用接口方法</p>
 * <p>Author: ouyp </p>
 * <p>Date: 2018-05-20 14:03</p>
 */
public class invokeinterface {
    public void invokeinterface(Runnable r){
        r.run();
    }
}
/**
 *   public void invokeinterface(java.lang.Runnable);
 *     Code:
 *        0: aload_1
 *        1: invokeinterface #2,  1            // InterfaceMethod java/lang/Runnable.run:()V
 *        6: return
 */
