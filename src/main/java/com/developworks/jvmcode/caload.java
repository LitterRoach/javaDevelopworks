package com.developworks.jvmcode;

/**
 * <p>Title: caload</p>
 * <p>Description: 从数组中加载一个char类型数据到操作数栈中</p>
 * <p>Author: ouyp </p>
 * <p>Date: 2018-05-19 15:58</p>
 */
public class caload {
    public void caload(char[] arr) {
        char c = arr[0];
    }
}
/**
 * public void caload(char[]);
 *     Code:
 *        0: aload_1
 *        1: iconst_0
 *        2: caload
 *        3: istore_2
 *        4: return
 */