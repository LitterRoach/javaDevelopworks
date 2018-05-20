package com.developworks.jvmcode;

import javafx.util.Pair;

import java.util.Map;

/**
 * <p>Title: invokevirtual</p>
 * <p>Description: 调用实例方法，根据实例的类型进行分配(多态)</p>
 * <p>Author: ouyp </p>
 * <p>Date: 2018-05-20 14:17</p>
 */
public class invokevirtual {

    class Person {
        @Override
        public String toString() {
            return super.toString();
        }
    }

    public void invokevirtual() {
        Object o = new Person();
        o.toString();
    }
}
/**
 * public void invokevirtual();
 *     Code:
 *        0: new           #2                  // class com/developworks/jvmcode/invokevirtual$Person
 *        3: dup
 *        4: aload_0
 *        5: invokespecial #3                  // Method com/developworks/jvmcode/invokevirtual$Person."<init>":(Lcom/developworks/jvmcode/invokevirtual;)V
 *        8: astore_1
 *        9: aload_1
 *       10: invokevirtual #4                  // Method java/lang/Object.toString:()Ljava/lang/String;
 *       13: pop
 *       14: return
 */
