package com.developworks.jvmcode;

/**
 * <p>Title: bastore</p>
 * <p>Description: 从操作数栈中读取一个byte或者boolean数据存入数组中</p>
 * <p>Author: ouyp </p>
 * <p>Date: 2018-05-19 15:49</p>
 */
public class bastore {
    /**
     * byte数组
     * @param arr
     * @param b
     * @param index
     */
    public void bastore_1(byte[] arr, byte b, int index) {
        arr[index] = b;
    }
    /**
     * public void bastore_1(byte[], byte, int);
     *     Code:
     *        0: aload_1
     *        1: iload_3
     *        2: iload_2
     *        3: bastore
     *        4: return
     */

    /**
     * boolean数组
     * @param arr
     * @param bool
     * @param index
     */
    public void bastore_2(boolean[] arr, boolean bool, int index) {
        arr[index] = bool;
    }
    /**
     * public void bastore_2(boolean[], boolean, int);
     *     Code:
     *        0: aload_1
     *        1: iload_3
     *        2: iload_2
     *        3: bastore
     *        4: return
     */
}
