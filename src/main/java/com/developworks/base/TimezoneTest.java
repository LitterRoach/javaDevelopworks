package com.developworks.base;

import org.junit.Test;

import java.sql.Time;
import java.text.DateFormat;
import java.util.Date;
import java.util.TimeZone;

/**
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Author: ouyp </p>
 * <p>Date: 2018-05-18 14:52</p>
 */
public class TimezoneTest {
    @Test
    public void test01() {
        TimeZone tz = TimeZone.getDefault();
        System.out.println(tz);
    }

    @Test
    public void test02() {
        String[] availableIDs = TimeZone.getAvailableIDs();
        for (String id : availableIDs) {
            TimeZone timeZone = TimeZone.getTimeZone(id);
            System.out.println(timeZone);
        }
    }

    @Test
    public  void test03() {
        Date d = new Date();
        for (String id : TimeZone.getAvailableIDs()) {
            TimeZone timeZone = TimeZone.getTimeZone(id);
            DateFormat dateInstance = DateFormat.getTimeInstance(DateFormat.FULL);
            dateInstance.setTimeZone(timeZone);
            System.out.println(id + ":" + dateInstance.format(d));
        }
    }
}
