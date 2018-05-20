package com.developworks.jvmcode;

/**
 * <p>Title: lushr</p>
 * <p>Description: long数值无符号右移</p>
 * <p>Author: ouyp </p>
 * <p>Date: 2018-05-20 15:39</p>
 */
public class lushr {
    public void lushr(long L) {
        L >>>= 2;
    }
}
/**
 * public void lushr(long);
 *     Code:
 *        0: lload_1
 *        1: iconst_2
 *        2: lushr
 *        3: lstore_1
 *        4: return
 */