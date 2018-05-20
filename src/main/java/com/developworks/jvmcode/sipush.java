package com.developworks.jvmcode;

/**
 * <p>Title: sipush</p>
 * <p>Description: 将一个short值入栈</p>
 * <p>Author: ouyp </p>
 * <p>Date: 2018-05-20 16:42</p>
 */
public class sipush {
    public void sipush(short[] arr, int index) {
        int s = 1024; //当int取值-32768~32767时，JVM采用sipush指令将常量压入栈中。
    }
}
/**
 *   public void sipush(short[], int);
 *     Code:
 *        0: sipush        1024
 *        3: istore_3
 *        4: return
 */