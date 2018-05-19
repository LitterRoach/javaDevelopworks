package com.developworks.jvmcode;

/**
 * <p>Title: getfield</p>
 * <p>Description: 获取对象的字段值</p>
 * <p>Author: ouyp </p>
 * <p>Date: 2018-05-19 18:37</p>
 */
public class getfield {
    private String name;

    public String getName() {
        return name;
    }
    /**
     * public java.lang.String getName();
     *     Code:
     *        0: aload_0
     *        1: getfield      #2                  // Field name:Ljava/lang/String;
     *        4: areturn
     */
}
