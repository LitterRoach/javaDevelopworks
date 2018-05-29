package com.developworks.jvm;

import org.apache.commons.lang.StringUtils;

import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.List;

/**
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Author: ouyp </p>
 * <p>Date: 2018-05-28 16:45</p>
 */
public class Mbean {
    public static void main(String[] args) {
        List<GarbageCollectorMXBean> list = ManagementFactory.getGarbageCollectorMXBeans ();
        for (GarbageCollectorMXBean bean : list) {
            System.out.println(bean.getName () + ":" + StringUtils.join (bean.getMemoryPoolNames (), ","));
        }
    }
}
