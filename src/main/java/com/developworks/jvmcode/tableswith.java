package com.developworks.jvmcode;

/**
 * <p>Title: tableswith</p>
 * <p>Description: 根据索引值在跳转表中寻找配对的分支进行跳转</p>
 * <p>Author: ouyp </p>
 * <p>Date: 2018-05-20 16:52</p>
 */
public class tableswith {
    public void tableswith(int i) {
        switch (i) {
            case 0 : break;
            case 1 : break;
            case 2 : break;
            case 3 : break;
            case 4 : break;
            default : break;
        }
    }
}
/**
 * public void tableswith(int);
 *     Code:
 *        0: iload_1
 *        1: tableswitch   { // 0 to 4
 *                      0: 36
 *                      1: 39
 *                      2: 42
 *                      3: 45
 *                      4: 48
 *                default: 51
 *           }
 *       36: goto          51
 *       39: goto          51
 *       42: goto          51
 *       45: goto          51
 *       48: goto          51
 *       51: return
 */