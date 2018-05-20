package com.developworks.jvmcode;

/**
 * <p>Title: lastore</p>
 * <p>Description: 从操作数栈中取值存储到long数组中</p>
 * <p>Author: ouyp </p>
 * <p>Date: 2018-05-20 14:50</p>
 */
public class lastore {
    public void lastore(long[] arr, int i) {
        arr[i] = 0L;
    }
}
/**
 * public void lastore(long[], int);
 *     Code:
 *        0: aload_1
 *        1: iload_2
 *        2: lconst_0
 *        3: lastore
 *        4: return
 */
