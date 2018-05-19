package com.developworks.jvmcode;

/**
 * <p>Title: fcmp</p>
 * <p>Description: 比较两个float类型数值大小</p>
 * <p>Author: ouyp </p>
 * <p>Date: 2018-05-19 18:10</p>
 */
public class fcmp {
    public boolean fcmp_lt(float f, float f2) {
        return f < f2;
    }
    /**
     * public boolean fcmp(float, float);
     *     Code:
     *        0: fload_1
     *        1: fload_2
     *        2: fcmpg
     *        3: ifge          10
     *        6: iconst_1
     *        7: goto          11
     *       10: iconst_0
     *       11: ireturn
     */

    public boolean fcmp_le(float f, float f2) {
        return f <= f2;
    }
    /**
     * public boolean fcmp_le(float, float);
     *     Code:
     *        0: fload_1
     *        1: fload_2
     *        2: fcmpg
     *        3: ifgt          10
     *        6: iconst_1
     *        7: goto          11
     *       10: iconst_0
     *       11: ireturn
     */

    public boolean fcmp_gt(float f, float f2) {
        return f > f2;
    }
    /**
     * public boolean fcmp_gt(float, float);
     *     Code:
     *        0: fload_1
     *        1: fload_2
     *        2: fcmpl
     *        3: ifle          10
     *        6: iconst_1
     *        7: goto          11
     *       10: iconst_0
     *       11: ireturn
     */

    public boolean fcmp_ge(float f, float f2) {
        return f > f2;
    }
    /**
     * public boolean fcmp_ge(float, float);
     *     Code:
     *        0: fload_1
     *        1: fload_2
     *        2: fcmpl
     *        3: ifle          10
     *        6: iconst_1
     *        7: goto          11
     *       10: iconst_0
     *       11: ireturn
     */
}
