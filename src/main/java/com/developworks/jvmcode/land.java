package com.developworks.jvmcode;

/**
 * <p>Title: land</p>
 * <p>Description: 对long数值做按位与操作</p>
 * <p>Author: ouyp </p>
 * <p>Date: 2018-05-20 14:49</p>
 */
public class land {
    public void land(long L1, long L2) {
        long LL = L1 & L2;
    }
}
/**
 * public void land(long, long);
 *     Code:
 *        0: lload_1
 *        1: lload_3
 *        2: land
 *        3: lstore        5
 *        5: return
 */