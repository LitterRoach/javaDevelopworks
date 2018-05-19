package com.developworks.jvmcode;

/**
 * <p>Title: iastore</p>
 * <p>Description: 从操作栈栈中存储int数值存放到数组中</p>
 * <p>Author: ouyp </p>
 * <p>Date: 2018-05-19 21:12</p>
 */
public class iastore {
    public void iastore(int[] arr, int index, int i) {
        arr[index] = i;
    }
}
/**
 * public void iastore(int[], int, int);
 *     Code:
 *        0: aload_1
 *        1: iload_2
 *        2: iload_3
 *        3: iastore
 *        4: return
 */