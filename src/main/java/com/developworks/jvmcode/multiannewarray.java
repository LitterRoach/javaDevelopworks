package com.developworks.jvmcode;

/**
 * <p>Title: multiannewarray</p>
 * <p>Description: 创建多维数组</p>
 * <p>Author: ouyp </p>
 * <p>Date: 2018-05-20 16:07</p>
 */
public class multiannewarray {
    public void multiannewarray() {
        int[][] multi = new int[10][9];
    }
}
/**
 *  public void multiannewarray();
 *     Code:
 *        0: bipush        10
 *        2: bipush        9
 *        4: multianewarray #2,  2             // class "[[I"
 *        8: astore_1
 *        9: return
 * }
 */
