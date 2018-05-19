package com.developworks.jvmcode;

/**
 * <p>Title: goto</p>
 * <p>Description: 无条件跳转</p>
 * <p>Author: ouyp </p>
 * <p>Date: 2018-05-19 18:44</p>
 */
public class goto2 {
    public void goto2() {
        try{
            int a = 0;
        }finally {
            int b = 0;
        }
    }
}
/**
 * public void goto2();
 *     Code:
 *        0: iconst_0
 *        1: istore_1
 *        2: iconst_0
 *        3: istore_1
 *        4: goto          12
 *        7: astore_2
 *        8: iconst_0
 *        9: istore_3
 *       10: aload_2
 *       11: athrow
 *       12: return
 *     Exception table:
 *        from    to  target type
 *            0     2     7   any
 */