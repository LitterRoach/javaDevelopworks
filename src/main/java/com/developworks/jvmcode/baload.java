package com.developworks.jvmcode;

/**
 * <p>Title: baload</p>
 * <p>Description: 从数组中读取byte或者boolean类型数据</p>
 * <p>Author: ouyp </p>
 * <p>Date: 2018-05-19 15:45</p>
 */
public class baload {

    /**
     * byte数据
     * @param arr
     */
    public void baload_1(byte[] arr) {
        byte b = arr[0];
    }
    /**
     * public void baload_1(byte[]);
     *     Code:
     *        0: aload_1
     *        1: iconst_0
     *        2: baload
     *        3: istore_2
     *        4: return
     */

    /**
     * boolean数组
     */
    public void baload_2(boolean[] arr) {
        boolean bool = arr[0];
    }
    /**
     * public void baload_2(boolean[]);
     *     Code:
     *        0: aload_1
     *        1: iconst_0
     *        2: baload
     *        3: istore_2
     *        4: return
     */
}
