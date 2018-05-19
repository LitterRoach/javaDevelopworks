package com.developworks.jvmcode;

/**
 * <p>Title: castore</p>
 * <p>Description: 从操作数栈中读取一个char类型的数据并存入到数组中</p>
 * <p>Author: ouyp </p>
 * <p>Date: 2018-05-19 16:00</p>
 */
public class castore {
    public void castore(char[] arr, char c, int index) {
        arr[index] = c;
    }
}
/**
 * public void castore(char[], char, int);
 *     Code:
 *        0: aload_1
 *        1: iload_3
 *        2: iload_2
 *        3: castore
 *        4: return
 */