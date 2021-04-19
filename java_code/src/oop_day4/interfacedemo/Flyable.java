package oop_day4.interfacedemo;

public interface Flyable {
    // int NUM = 5 变量 默认就是public static final
    public static final int NUM = 5; //
//    方法 默认就是public abstract
    public abstract void fly();
//默认方法
    public default void show(){

    }
//    静态方法
    public static void print(){

    }

 }
