package com.developworks.jvmcode;

/**
 * <p>Title: faload从数组中加载一个float数据到操作数栈</p>
 * <p>Description: </p>
 * <p>Author: ouyp </p>
 * <p>Date: 2018-05-19 18:03</p>
 */
public class faload {
    public void faload(float[] arr, int index) {
        float f = arr[index];
    }
}
/**
 * public void faload(float[], int);
 *     Code:
 *        0: aload_1
 *        1: iload_2
 *        2: faload
 *        3: fstore_3
 *        4: return
 */
