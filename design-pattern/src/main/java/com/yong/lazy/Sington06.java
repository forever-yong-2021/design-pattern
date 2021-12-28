package com.yong.lazy;

public class Sington06 {
    public static void main(String[] args) {
        Sington aa = Sington.INSTANCE;
    }
}
enum Sington{
    INSTANCE;
}
