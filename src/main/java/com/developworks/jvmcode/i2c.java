package com.developworks.jvmcode;

/**
 * <p>Title: i2c</p>
 * <p>Description: 将int数值转换为char类型</p>
 * <p>Author: ouyp </p>
 * <p>Date: 2018-05-19 20:48</p>
 */
public class i2c {
    public void i2c(int i) {
        char c = (char)i;
    }
}
/**
 * public void i2c(int);
 *     Code:
 *        0: iload_1
 *        1: i2c
 *        2: istore_2
 *        3: return
 */