package com.developworks.jvmcode;

/**
 * <p>Title: instanceof</p>
 * <p>Description: 判断对象是否指定类型</p>
 * <p>Author: ouyp </p>
 * <p>Date: 2018-05-19 22:54</p>
 */
public class instanceof2 {
    public void instanceof2(Object o) {
        boolean bool = o instanceof Object;
    }
}
/**
 *   public void instanceof2(java.lang.Object);
 *     Code:
 *        0: aload_1
 *        1: instanceof    #2                  // class java/lang/Object
 *        4: istore_2
 *        5: return
 */
