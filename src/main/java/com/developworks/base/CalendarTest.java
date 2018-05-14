package com.developworks.base;

import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import java.util.logging.SimpleFormatter;

/**
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Author: ouyp </p>
 * <p>Date: 2018-05-14 21:46</p>
 */
public class CalendarTest {

    @Test
    public void getMaxNum() {
        Calendar c = Calendar.getInstance();
        int maximum = c.getActualMaximum(Calendar.DAY_OF_MONTH);
        System.out.println(maximum);
    }

    @Test
    public void testAllSections() {
        testSection(Calendar.getInstance(), Calendar.ERA, "Calendar.EAR");
        testSection(Calendar.getInstance(), Calendar.YEAR, "Calendar.YEAR");
        testSection(Calendar.getInstance(), Calendar.MONTH, "Calendar.MONTH");
    }

    public void testSection(Calendar c, int field, String title) {
        Random random = new Random();
        Date d = c.getTime();

        int min = c.getMinimum(field); //获取字段“最小值”
        int max = c.getMaximum(field); //获取字段“最大值”

        int aMin = c.getActualMinimum(field); //获取字段“实际最小值”
        int aMax = c.getActualMaximum(field); //获取字段“实际最大值”

        int ori = c.get(field);
        int r1 = random.nextInt(max);
        c.set(field, r1);

        int set = c.get(field);
        try {
            c.roll(field, -max);
        }catch (IllegalArgumentException e) {
            e.printStackTrace();
        }

        int roll = c.get(field);
        int sign = random.nextInt(2) == 1 ? 1 : -1;
        int r2 = sign * random.nextInt(max);
        try {
            c.roll(field, r2);
        } catch (Exception e) {
            e.printStackTrace();
        }

        int add = c.get(field);
        System.out.printf("%s:\n\trange is [%d - %d] actualRange is [%d - %d].  original=%d, set(%d)=%d, roll(%d)=%d, add(%d)=%d\n",  title, min, max, aMin, aMax, ori, r1, set, -max, roll, r2, add);
    }

    @Test
    public void testLenientCalendar() {
        Calendar c = Calendar.getInstance();
        c.set(Calendar.MONTH, 50);
        printDate(c);
        c = Calendar.getInstance();
        c.setLenient(false);
        c.set(Calendar.MONTH, 40);
        printDate(c);
    }

    private  void printDate(Calendar calendar) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String format = dateFormat.format(calendar.getTime());
        System.out.println(format);
    }

    @Test
    public void testGetLastDate() {
        Calendar c = Calendar.getInstance();
        c.set(Calendar.DATE, 1);
        c.roll(Calendar.DATE, -1);
        printDate(c);
    }

    @Test
    public void testroll() {
        Calendar c = Calendar.getInstance();
        //roll只会对当前域做出来
        c.roll(Calendar.MONTH, -5);
        printDate(c);
    }
}
