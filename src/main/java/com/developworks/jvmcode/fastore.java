package com.developworks.jvmcode;

/**
 * <p>Title: fastore</p>
 * <p>Description: 将float数值存放到float数组中</p>
 * <p>Author: ouyp </p>
 * <p>Date: 2018-05-19 18:05</p>
 */
public class fastore {
    public void fstore(float[] arr, float f, int index) {
        arr[index] = f;
    }
}
/**
 * public void fstore(float[], float, int);
 *     Code:
 *        0: aload_1
 *        1: iload_3
 *        2: fload_2
 *        3: fastore
 *        4: return
 */