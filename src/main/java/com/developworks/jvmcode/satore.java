package com.developworks.jvmcode;

/**
 * <p>Title: satore</p>
 * <p>Description: 将操作数栈中的数据存储到short数组中</p>
 * <p>Author: ouyp </p>
 * <p>Date: 2018-05-20 16:40</p>
 */
public class satore {
    public void satore(short[] arr, int index, short s) {
        arr[index] = s;
    }
}
/**
 *   public void satore(short[], int, short);
 *     Code:
 *        0: aload_1
 *        1: iload_2
 *        2: iload_3
 *        3: sastore
 *        4: return
 */
