package com.developworks.jvmcode;

/**
 * <p>Title: d2l</p>
 * <p>Description: double数据类型转换为long类型</p>
 * <p>Author: ouyp </p>
 * <p>Date: 2018-05-19 16:08</p>
 */
public class d2l {
    public void d2l(double d, long L) {
        L = (long)d;
    }
}
/**
 * public void d2l(double, long);
 *     Code:
 *        0: dload_1
 *        1: d2l
 *        2: lstore_3
 *        3: return
 */
