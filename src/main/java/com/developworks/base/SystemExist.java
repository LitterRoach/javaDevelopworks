package com.developworks.base;

import java.io.IOException;

/**
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Author: ouyp </p>
 * <p>Date: 2018-05-08 16:07</p>
 */
public class SystemExist {
    public static void main(String[] args) {
        try {
            System.out.println("try block!");
            //System.exit(0);
        } /*catch (IOException e) {
            System.out.println("catch block");
        }*/finally {
            System.out.println("finally block!");
        }
    }
}
