package com.developworks.jvmcode;

/**
 * <p>Title: dcmp</p>
 * <p>Description: 比较两个double数据大小
 *  dcmpl 比较栈顶两double型数值大小，并且结果（1，0，-1）进栈；当其中一个数值为NaN时，-1进栈
 *  dcmpg 比较栈顶两double型数值大小，并且结果（1，0，-1）进栈；当其中一个数值为NaN时，1进栈
 * </p>
 * <p>Author: ouyp </p>
 * <p>Date: 2018-05-19 16:16</p>
 */
public class dcmp {
    public boolean dcmp_lt(double d1, double d2) {
        return d1 < d2;
    }
    /**
     * public boolean dcmp_lt(double, double);
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

    public boolean dcmp_le(double d1, double d2) {
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

    public boolean dcmp_e(double d1, double d2) {
        return d1 == d2;
    }
    /**
     * public boolean dcmp_e(double, double);
     *     Code:
     *        0: dload_1
     *        1: dload_3
     *        2: dcmpl
     *        3: ifne          10
     *        6: iconst_1
     *        7: goto          11
     *       10: iconst_0
     *       11: ireturn
     */

    public boolean dcmp_ne(double d1, double d2) {
        return d1 != d2;
    }
    /**
     * public boolean dcmp_ne(double, double);
     *     Code:
     *        0: dload_1
     *        1: dload_3
     *        2: dcmpl
     *        3: ifeq          10
     *        6: iconst_1
     *        7: goto          11
     *       10: iconst_0
     *       11: ireturn
     */

    public boolean dcmp_ge(double d1, double d2) {
        return d1 >= d2;
    }
    /**
     * public boolean dcmp_ge(double, double);
     *     Code:
     *        0: dload_1
     *        1: dload_3
     *        2: dcmpl
     *        3: iflt          10
     *        6: iconst_1
     *        7: goto          11
     *       10: iconst_0
     *       11: ireturn
     */

    public boolean dcmp_gt(double d1, double d2) {
        return d1 >= d2;
    }
    /**
     * public boolean dcmp_gt(double, double);
     *     Code:
     *        0: dload_1
     *        1: dload_3
     *        2: dcmpl
     *        3: iflt          10
     *        6: iconst_1
     *        7: goto          11
     *       10: iconst_0
     *       11: ireturn
     */
}
