package com.developworks.jvmcode;

/**
 * <p>Title: ldc2_w</p>
 * <p>Description: 从运行时常量中提取long或者double数值到操作数栈中</p>
 * <p>Author: ouyp </p>
 * <p>Date: 2018-05-20 15:09</p>
 */
public class ldc2_w {
    public void ldc2_w() {
        double d = 22221.33343233D;
    }
}
/**
 *   public void ldc2_w();
 *     Code:
 *        0: ldc2_w        #2                  // double 22221.33343233d
 *        3: dstore_1
 *        4: return
 */
