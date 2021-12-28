package com.yong.hungry;

public class Sington02 {
    public static void main(String[] args) {
        
    }
}
/**
 * 静态代码块
 */
class Sington {
    private static Sington sington;
    // 私有化构造器
    private Sington() {
    };
    static {
        sington = new Sington();
    }
    
    public static Sington getInstance() {
        return sington;

    }
}
