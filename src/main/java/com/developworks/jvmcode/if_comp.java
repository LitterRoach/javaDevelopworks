package com.developworks.jvmcode;

/**
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Author: ouyp </p>
 * <p>Date: 2018-05-19 21:41</p>
 */
public class if_comp {
    public void if_comp_lt(int i, int i2) {
        if (i < i2) {

        }
    }
    /**
     * public void if_comp_lt(int, int);
     *     Code:
     *        0: iload_1
     *        1: iload_2
     *        2: if_icmpge     5
     *        5: return
     */

    public void if_comp_le(int i, int i2) {
        if (i <= i2) {

        }
    }
    /**
     * public void if_comp_le(int, int);
     *     Code:
     *        0: iload_1
     *        1: iload_2
     *        2: if_icmpgt     5
     *        5: return
     */

    public void if_comp_eq(int i, int i2) {
        if (i != i2) {

        }
    }
    /**
     * public void if_comp_eq(int, int);
     *     Code:
     *        0: iload_1
     *        1: iload_2
     *        2: if_icmpeq     5
     *        5: return
     */

    public void if_comp_ne(int i, int i2) {
        if (i != i2) {

        }
    }
    /**
     * public void if_comp_eq(int, int);
     *     Code:
     *        0: iload_1
     *        1: iload_2
     *        2: if_icmpeq     5
     *        5: return
     */

    public void if_comp_gt(int i, int i2) {
        if (i > i2) {

        }
    }
    /**
     *   public void if_comp_gt(int, int);
     *     Code:
     *        0: iload_1
     *        1: iload_2
     *        2: if_icmple     5
     *        5: return
     */

    public void if_comp_ge(int i, int i2) {
        if (i >= i2) {

        }
    }
    /**
     * public void if_comp_gt(int, int);
     *     Code:
     *        0: iload_1
     *        1: iload_2
     *        2: if_icmple     5
     *        5: return
     */


}
