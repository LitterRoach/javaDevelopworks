package com.developworks.base;

import org.junit.Test;

import java.util.Locale;

/**
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Author: ouyp </p>
 * <p>Date: 2018-05-18 14:17</p>
 */
public class LocaleTest {

    @Test
    public  void test01() {
        Locale[] availableLocales = Locale.getAvailableLocales();
        for (Locale locale : availableLocales) {
            System.out.println(locale);
        }
    }

    @Test
    public void test02() {
        Locale locale = new Locale("zh", "CN", "hunan");
        System.out.println(locale);
    }


}
