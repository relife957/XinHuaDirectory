package com.wangyi;

/**
 * 随便练习
 *
 * @author wangyi
 * @create 2018-08-23 2:53 PM
 **/
public class Test {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        System.out.println(runtime.availableProcessors());
        System.out.println(runtime.freeMemory());
        System.out.println(runtime.maxMemory());
    }
}
