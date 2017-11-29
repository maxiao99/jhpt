package com.tyj.jhpt.server.handler;

import org.testng.annotations.Test;

import java.math.BigInteger;

public class DeviceManagerServerHandlerTest {

    @Test
    public void main() {
        byte[] bytes = {0x00, 0x00, 0x16};
        BigInteger bigInteger = new BigInteger(bytes);
        System.out.println(bigInteger.intValue());
    }

    @Test
    public void test() {
        int i = 0;
        if (i == 0) {
            System.out.println(0);
            i = 1;
        } else if (i == 1) {
            System.out.println(1);
            i = 2;
        } else if (i == 2) {
            System.out.println(2);
            i = 3;
        }
    }
}