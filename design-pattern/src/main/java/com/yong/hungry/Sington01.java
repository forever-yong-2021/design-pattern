package com.yong.hungry;
/**
 * 恶汉式单例实现
 */
public class Sington01 {
    public static void main(String[] args) {
        Sington sington01 = Sington.getInstance();
        Sington sington02 = Sington.getInstance();
        System.out.println(sington01 == sington02);
    }

}
/**
 * 静态变量实现
 */
class Sington {
    // 私有化构造器
    private Sington() {};
    
    private final static Sington sington = new Sington();

    public static Sington getInstance() {
        return sington;
        
    }
}
