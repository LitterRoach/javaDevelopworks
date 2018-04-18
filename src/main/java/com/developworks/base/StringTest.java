package com.developworks.base;

import com.google.common.base.Joiner;

public class StringTest {

    public static void main(String[] args) {
        Joiner joiner = Joiner.on(";").skipNulls();
        String s = joiner.join("Harry", null, "Rob", "Herminate");
        System.out.println(s);
    }
}
