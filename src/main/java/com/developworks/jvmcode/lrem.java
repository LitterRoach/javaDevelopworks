package com.developworks.jvmcode;

/**
 * <p>Title: lrem</p>
 * <p>Description: long值求余</p>
 * <p>Author: ouyp </p>
 * <p>Date: 2018-05-20 15:30</p>
 */
public class lrem {
    public void lrem(long L, long L2) {
        long LL = L % L2;
    }
}
/**
 * public void lrem(long, long);
 *     Code:
 *        0: lload_1
 *        1: lload_3
 *        2: lrem
 *        3: lstore        5
 *        5: return
 */
