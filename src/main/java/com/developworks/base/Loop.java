package com.developworks.base;

/**
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Author: ouyp </p>
 * <p>Date: 2018-05-08 16:41</p>
 */
public class Loop {
    public  static void main(String[] args) {
        int[][] tests = {{6, 5, 4, 3, 2, 1}, {1,2}, {1,2,3}, {1, 2, 3, 4}, {1}};
        int ss = 0;
//        try {
//            int i = 0;
//            while (true) {
//                if (thirdElementIsThree(tests[i++])) {
//                    ss++;
//                }
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        for (int[] a : tests) {
            if (thirdElementIsThree(a)) {
                ss++;
            }
        }
        System.out.println(ss);
    }

    private static boolean thirdElementIsThree(int[] a) {
        return a.length >= 3 & a[2] == 3;
    }
}
