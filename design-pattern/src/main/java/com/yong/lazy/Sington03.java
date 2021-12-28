package com.yong.lazy;

public class Sington03 {
    public static void main(String[] args) {
        
    }
}
/**
 * 产生多个实例，不能用
 */
class Sington {
    private Sington() {
    }

    private static Sington instance;

    public static synchronized Sington getInstance() {
        if (instance == null) {
            synchronized (Sington.class) {
                instance = new Sington();
            }
        }

        return instance;
    }
}