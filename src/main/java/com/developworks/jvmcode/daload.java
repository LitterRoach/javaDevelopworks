package com.developworks.jvmcode;

/**
 * <p>Title: daload</p>
 * <p>Description: 从数组中加载一个double类型数据到操作数栈中</p>
 * <p>Author: ouyp </p>
 * <p>Date: 2018-05-19 16:11</p>
 */
public class daload {
    public void daload(double[] arr, int index) {
        double d = arr[index];
    }
}
/**
 * public void daload(double[], int);
 *     Code:
 *        0: aload_1
 *        1: iload_2
 *        2: daload
 *        3: dstore_3
 *        4: return
 */
