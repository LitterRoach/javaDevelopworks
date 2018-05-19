package com.developworks.jvmcode;

/**
 * <p>Title: aastore</p>
 * <p>Description: 从操作数栈中读取一个引用类型数据存入到数组中</p>
 * <p>Author: ouyp </p>
 * <p>Date: 2018-05-19 15:23</p>
 */
public class aastore {

    public void aasotre(Object[] arr, Object x, int index) {
        arr[index] = x;
    }
}
/**
 * public void aasotre(java.lang.Object[], java.lang.Object, int);
 *     Code:
 *        0: aload_1
 *        1: iload_3
 *        2: aload_2
 *        3: aastore
 *        4: return
 */
