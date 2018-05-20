package com.developworks.jvmcode;

import org.apache.commons.lang.StringUtils;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * <p>Title: invokestatic</p>
 * <p>Description: 调用类（静态）方法</p>
 * <p>Author: ouyp </p>
 * <p>Date: 2018-05-20 14:12</p>
 */
public class invokestatic {
    public void invokestatic(String s) {
        boolean isBlank = StringUtils.isBlank(s);
    }
}
/**
 * public void invokestatic(java.lang.String);
 *     Code:
 *        0: aload_1
 *        1: invokestatic  #2                  // Method org/apache/commons/lang/StringUtils.isBlank:(Ljava/lang/String;)Z
 *        4: istore_2
 *        5: return
 */
