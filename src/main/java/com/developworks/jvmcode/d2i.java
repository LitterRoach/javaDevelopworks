package com.developworks.jvmcode;

/**
 * <p>Title: d2i</p>
 * <p>Description: double转换为整型</p>
 * <p>Author: ouyp </p>
 * <p>Date: 2018-05-19 16:07</p>
 */
public class d2i {
    public void d2i(double d, int i) {
        i = (int)d;
    }
}
/**
 * public void d2i(double, int);
 *     Code:
 *        0: dload_1
 *        1: d2i
 *        2: istore_3
 *        3: return
 */