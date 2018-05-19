package com.developworks.jvmcode;

/**
 * <p>Title: d2f</p>
 * <p>Description: 将double类型数据转换为float</p>
 * <p>Author: ouyp </p>
 * <p>Date: 2018-05-19 16:05</p>
 */
public class d2f {
    public void d2f(double d, float f) {
        f = (float)d;
    }
}
/**
 * public void d2f(double, float);
 *     Code:
 *        0: dload_1
 *        1: d2f
 *        2: fstore_3
 *        3: return
 */