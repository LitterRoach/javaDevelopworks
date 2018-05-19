package com.developworks.jvmcode;

/**
 * <p>Title: i2b</p>
 * <p>Description: 将int类型转换为byte类型</p>
 * <p>Author: ouyp </p>
 * <p>Date: 2018-05-19 20:46</p>
 */
public class i2b {
    public void i2b(int i) {
        byte b = (byte)i;
    }
}
/**
 * public void i2b(int);
 *     Code:
 *        0: iload_1
 *        1: i2b
 *        2: istore_2
 *        3: return
 */