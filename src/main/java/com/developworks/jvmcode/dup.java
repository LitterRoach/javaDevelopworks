package com.developworks.jvmcode;

/**
 * <p>Title: dup</p>
 * <p>Description: 复制操作数栈顶的值，并插入到栈顶</p>
 * <p>Author: ouyp </p>
 * <p>Date: 2018-05-19 17:33</p>
 */
public class dup {
    //因为invokespecial会消耗掉操作数栈顶的引用作为传给构造器的“this”参数，所以如果我们希望在invokespecial调用后在操作数栈顶还维持有一个指向新建对象的引用，就得在invokespecial之前先“复制”一份引用——这就是这个dup的来源。
    //
    //作者：RednaxelaFX
    //链接：https://www.zhihu.com/question/52749416/answer/132831920
    //来源：知乎
    //著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
    public void dup() {
        Object o = new Object();
    }
    /**
     *   public void dup();
     *     Code:
     *        0: new           #2                  // class java/lang/Object
     *        3: dup
     *        4: invokespecial #1                  // Method java/lang/Object."<init>":()V
     *        7: astore_1
     *        8: return
     */
}