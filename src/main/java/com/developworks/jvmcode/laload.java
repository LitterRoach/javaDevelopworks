package com.developworks.jvmcode;

/**
 * <p>Title: laload</p>
 * <p>Description: 从数组中加载一个long数值到操作数栈</p>
 * <p>Author: ouyp </p>
 * <p>Date: 2018-05-20 14:46</p>
 */
public class laload {
    public void laload(long[] arr, int i) {
        long L = arr[i];
    }
}
/**
 * public void laload(long[], int);
 *     Code:
 *        0: aload_1
 *        1: iload_2
 *        2: laload
 *        3: lstore_3
 *        4: return
 */
