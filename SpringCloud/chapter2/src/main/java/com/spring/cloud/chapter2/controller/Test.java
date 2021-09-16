package com.spring.cloud.chapter2.controller;

/**
 * @author spacetim
 * @date 2021/9/14
 * @description
 */
public class Test {
    public static void main(String[] args) {
        System.out.println(9999999999999l / 1000 / 60 / 60 / 24 / 365);

        long sum = 0l;
        sum = (long) Math.pow(2, 41);
        System.out.println((sum-1) / 1000 / 60 / 60 / 24 / 365);
        System.out.println(System.currentTimeMillis() / 1000 / 60 / 60 / 24 / 365);
    }
}
