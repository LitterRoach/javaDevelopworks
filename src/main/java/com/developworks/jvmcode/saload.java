package com.developworks.jvmcode;

/**
 * <p>Title: saload</p>
 * <p>Description: 从数组中加载一个short数组到操作数栈</p>
 * <p>Author: ouyp </p>
 * <p>Date: 2018-05-20 16:38</p>
 */
public class saload {
    public void saload(short[] arr, int index) {
        short s = arr[index];
    }
}
/**
 *   public void saload(short[], int);
 *     Code:
 *        0: aload_1
 *        1: iload_2
 *        2: saload
 *        3: istore_3
 *        4: return
 */
