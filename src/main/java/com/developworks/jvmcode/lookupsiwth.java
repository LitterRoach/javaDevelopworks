package com.developworks.jvmcode;

/**
 * <p>Title: lookupsiwth</p>
 * <p>Description: 根据键值在跳转表中寻找匹配的分支然后进行跳转</p>
 * <p>Author: ouyp </p>
 * <p>Date: 2018-05-20 15:21</p>
 */
public class lookupsiwth {
    public void lookupswith(int i) {
        switch (i) {
            case -10 : break;
            case 0 : break;
            case 10 : break;
            default:
        }
    }
}
/**
 * public void lookupswith(int);
 *     Code:
 *        0: iload_1
 *        1: lookupswitch  { // 3
 *                    -10: 36
 *                      0: 39
 *                     10: 42
 *                default: 45
 *           }
 *       36: goto          45
 *       39: goto          45
 *       42: goto          45
 *       45: return
 * }
 */