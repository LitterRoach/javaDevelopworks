package com.developworks.jvmcode;

/**
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Author: ouyp </p>
 * <p>Date: 2018-05-19 18:40</p>
 */
public class getstatic {
    public static String name;
    public String getName() {
        return name;
    }
    /**
     * public java.lang.String getName();
     *     Code:
     *        0: getstatic     #2                  // Field name:Ljava/lang/String;
     *        3: areturn
     */
}
