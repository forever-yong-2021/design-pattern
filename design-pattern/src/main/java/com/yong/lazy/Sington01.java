package com.yong.lazy;

public class Sington01 {
    public static void main(String[] args) {
        
    }
}

/**
 * 懒汉式:线程不安全，不能使用
 */
class Sington{
    private Sington(){}

    private static Sington instance;
    
    public static Sington getInstance() {
        if (instance == null) {
            instance = new Sington();s
        }

        return instance;
    }
}
