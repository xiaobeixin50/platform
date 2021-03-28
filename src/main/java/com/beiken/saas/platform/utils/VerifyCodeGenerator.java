package com.beiken.saas.platform.utils;

import java.util.Random;

public class VerifyCodeGenerator {

    public static String generateVerifyCode(){
        int nextInt = new Random().nextInt(8999) + 1000;
        return String.valueOf(nextInt);
    }

    public static void main(String[] args) {
        String verifyCode = generateVerifyCode();
        System.out.println(verifyCode);
    }
}
