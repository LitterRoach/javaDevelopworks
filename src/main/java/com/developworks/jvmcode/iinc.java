package com.developworks.jvmcode;

/**
 * <p>Title: iinc</p>
 * <p>Description: 以常量为增量的局部变量自增</p>
 * <p>Author: ouyp </p>
 * <p>Date: 2018-05-19 22:37</p>
 */
public class iinc {
    public void iinc(int i) {
        int a = 0;
        a += 3;
    }
}
/**
 * public void iinc(int);
 *     Code:
 *        0: iconst_0
 *        1: istore_2
 *        2: iinc          2, 3
 *        5: return
 */