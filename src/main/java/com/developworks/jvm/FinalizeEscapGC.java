package com.developworks.jvm;

/**
 * <p>Title: 1.对象可以在被GC时自我拯救; 2.这种自救的机会只有一次，因为一个对象的finalize()方法最多只能被系统自动调用一次</p>
 * <p>Description: </p>
 * <p>Author: ouyp </p>
 * <p>Date: 2018-05-28 14:52</p>
 */
public class FinalizeEscapGC {
    static FinalizeEscapGC SAVE_HOOK = null;

    @Override
    protected void finalize() throws Throwable {
        super.finalize ();
        System.out.println("finalize method executed!");
        SAVE_HOOK = this;
    }

    public static void main(String[] args) throws Exception {
        SAVE_HOOK = new FinalizeEscapGC ();

        SAVE_HOOK = null;
        System.gc ();
        Thread.sleep (500);
        if (SAVE_HOOK  != null) {
            System.out.println("Opps, I'm still alive!");
        } else {
            System.out.println("no, I'm dead!");
        }

        SAVE_HOOK = null;
        System.gc ();
        Thread.sleep (500);
        if (SAVE_HOOK != null) {
            System.out.println("Opps, I'm still alive!");
        } else {
            System.out.println("no, I'm dead!");
        }
    }
    /**
     * finalize method executed!
     * Opps, I'm still alive!
     * no, I'm dead!
     */
}
