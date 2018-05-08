package com.developworks.base;

/**
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Author: ouyp </p>
 * <p>Date: 2018-05-08 16:23</p>
 */
public class Reluctant {
    private Reluctant instance = new Reluctant();
    public Reluctant() {
        throw new RuntimeException("i'm not come in!");
    }
    public static void main(String[] args) {
        try {
            Reluctant r = new Reluctant();
        } catch (Exception e) {
            System.out.println("Opps, Exception occur!");
        }
    }
}
