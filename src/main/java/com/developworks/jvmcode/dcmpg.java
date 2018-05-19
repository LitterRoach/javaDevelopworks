package com.developworks.jvmcode;

/**
 * <p>Title: dcmpg</p>
 * <p>Description: </p>
 * <p>Author: ouyp </p>
 * <p>Date: 2018-05-19 16:31</p>
 */
public class dcmpg {

    public boolean dcmpg_lt(double d1, double d2) {
        return d1 < d2;
    }
    /**
     * public boolean dcmpg_lt(double, double);
     *     Code:
     *        0: dload_1
     *        1: dload_3
     *        2: dcmpg
     *        3: ifge          10
     *        6: iconst_1
     *        7: goto          11
     *       10: iconst_0
     *       11: ireturn
     */

    public boolean dcmpg_le(double d1, double d2) {
        return d1 <= d2;
    }
    /**
     * public boolean dcmp_le(double, double);
     *     Code:
     *        0: dload_1
     *        1: dload_3
     *        2: dcmpg
     *        3: ifgt          10
     *        6: iconst_1
     *        7: goto          11
     *       10: iconst_0
     *       11: ireturn
     */
}
