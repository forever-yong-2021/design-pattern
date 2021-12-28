package com.yong.lazy;

public class Sington04 {
    
}

class Sington {
    private Sington() {
    }

    private static volatile Sington instance;

    public static synchronized Sington getInstance() {
        if (instance == null) {
            synchronized (Sington.class) {
                if (instance == null) {
                    instance = new Sington();
                }
            }
        }

        return instance;
    }
}
