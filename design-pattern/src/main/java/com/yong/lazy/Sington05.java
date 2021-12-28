package com.yong.lazy;

public class Sington05 {
    
}
/**
 * 静态内部类实现
 */
class Sington {
    private Sington() {
    }

    private  Sington instance;

    private static class SingtonInstance {
        private static final Sington Instace = new Sington();
    }

    public static Sington getInstance() {
        return SingtonInstance.Instace;
    }
}
