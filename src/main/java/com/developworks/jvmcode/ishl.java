package com.developworks.jvmcode;

/**
 * <p>Title: ishl</p>
 * <p>Description: int数值左移操作</p>
 * <p>Author: ouyp </p>
 * <p>Date: 2018-05-20 14:26</p>
 */
public class ishl {
    public void ishl(int i){
        int ii = i << 2;
    }
}
/**
 *   public void ishl(int);
 *     Code:
 *        0: iload_1
 *        1: iconst_2
 *        2: ishl
 *        3: istore_2
 *        4: return
 */