package com.developworks.jvmcode;

/**
 * <p>Title: invokedynamic</p>
 * <p>Description: 调用动态方法</p>
 * <p>Author: ouyp </p>
 * <p>Date: 2018-05-19 23:15</p>
 */
public class invokedynamic {
    public void invokedynamic(Object[] args) {
        Runnable r = () -> {};
    }
}
/**
 *   public void invokedynamic(java.lang.Object[]);
 *     Code:
 *        0: invokedynamic #2,  0              // InvokeDynamic #0:run:()Ljava/lang/Runnable;
 *        5: astore_2
 *        6: return
 */