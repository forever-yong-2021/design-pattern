package com.yong.lazy;

public class Sington02 {
    public static void main(String[] args) {
        
    }
}

/**
 * 线程安全:synchronized
 * 
 * @return
 */
class Sington {
    private Sington() {
    }

    private static Sington instance;

    public static synchronized Sington getInstance() {
        if (instance == null) {
            instance = new Sington();
        }

        return instance;
    }
}
