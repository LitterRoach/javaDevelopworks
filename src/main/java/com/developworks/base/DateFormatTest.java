package com.developworks.base;

import org.junit.Test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Author: ouyp </p>
 * <p>Date: 2018-05-18 10:58</p>
 */
public class DateFormatTest {
    @Test
    public void test01() {
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.FULL);
        String string = dateFormat.format(new Date());
        System.out.println(string);
    }

    @Test
    public void test02() {
        SimpleDateFormat format = new SimpleDateFormat("F-HH-kk");
        String s = format.format(new Date());
        System.out.println(s);
    }
}
