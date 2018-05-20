package com.developworks.jvmcode;

/**
 * <p>Title: lshl</p>
 * <p>Description: long数值左移操作</p>
 * <p>Author: ouyp </p>
 * <p>Date: 2018-05-20 15:32</p>
 */
public class lshl {
    public void lshl(long L) {
        long LL = L << 2;
    }
}
/**
 * public void lshl(long);
 *     Code:
 *        0: lload_1
 *        1: iconst_2
 *        2: lshl
 *        3: lstore_3
 *        4: return
 */