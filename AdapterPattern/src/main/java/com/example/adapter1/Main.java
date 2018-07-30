package com.example.adapter1;

/**
 * 使用继承的适配器模式
 */
public class Main {
    public static void main(String[] args) {
        Print p = new PrintBanner("Hello");
        p.printWeak();
        p.printStrong();
    }
}
