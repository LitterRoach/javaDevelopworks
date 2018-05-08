package com.developworks.base;

/**
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Author: ouyp </p>
 * <p>Date: 2018-05-08 15:59</p>
 */
public class UnwelcomeGuest {
    static final long GUEST_USER_ID = -1;
    static long USER_ID;
    static {
        try {
            USER_ID = getRandomUserId();
        } catch (Exception e) {
            USER_ID = GUEST_USER_ID;
            System.out.println("loging as gust!");
        }
    }

    static long getRandomUserId() {
        throw new RuntimeException();
    }

    public static void main(String[] args) {
        System.out.println(USER_ID);
    }
}
