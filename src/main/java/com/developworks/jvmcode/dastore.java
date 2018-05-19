package com.developworks.jvmcode;

/**
 * <p>Title: dastore</p>
 * <p>Description: 将操作数栈中的一个double值存入到数组中</p>
 * <p>Author: ouyp </p>
 * <p>Date: 2018-05-19 16:13</p>
 */
public class dastore {
    public void dastore(double[] arr, double d, int index) {
        arr[index] = d;
    }
}
/**
 * public void dastore(double[], double, int);
 *     Code:
 *        0: aload_1
 *        1: iload         4
 *        3: dload_2
 *        4: dastore
 *        5: return
 */