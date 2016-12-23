package com.zeng.test;

import org.junit.Test;

public class Mytest {

    @Test
    public void test() {
        try {
            String a = null;
            a.charAt(4);
        } catch (Exception e) {
            System.out.println(getExceptionMsg(e.getMessage()));
        }
    }

    public static String getExceptionMsg(String message) {
        message = message.toUpperCase();
        String result = message;
        if (message != null) {
            int index = message.lastIndexOf("exception");
            if (index != -1) {
                result = message.substring(index);
            }
        }
        return result;
    }
}
