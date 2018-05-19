package com.developworks.jvmcode;

/**
 * <p>Title: iaload</p>
 * <p>Description: 从数组中加载一个int数值到操作栈中</p>
 * <p>Author: ouyp </p>
 * <p>Date: 2018-05-19 21:00</p>
 */
public class iaload {
    public void iaload(int[] arr, int i) {
        int a = arr[i];
    }
}
/**
 * public void iaload(int[], int);
 *     Code:
 *        0: aload_1
 *        1: iload_2
 *        2: iaload
 *        3: istore_3
 *        4: return
 */