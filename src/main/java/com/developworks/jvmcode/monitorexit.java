package com.developworks.jvmcode;

/**
 * <p>Title: monitorexit</p>
 * <p>Description: 退出一个对象的monitor</p>
 * <p>Author: ouyp </p>
 * <p>Date: 2018-05-20 16:05</p>
 */
public class monitorexit {
    public void monitorexit() {
        synchronized (this) {

        }
    }
}
/**
 * public void monitorexit();
 *     Code:
 *        0: aload_0
 *        1: dup
 *        2: astore_1
 *        3: monitorenter
 *        4: aload_1
 *        5: monitorexit
 *        6: goto          14
 *        9: astore_2
 *       10: aload_1
 *       11: monitorexit
 *       12: aload_2
 *       13: athrow
 *       14: return
 *     Exception table:
 *        from    to  target type
 *            4     6     9   any
 *            9    12     9   any
 */