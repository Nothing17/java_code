package oop_day4.interfacedemo;

import oop_day4.abstractdome.Animal;

public class Bird extends Animal implements Flyable {
    @Override
    public void shout(String str) {
//         继承animal
        System.out.println("鸟叫");
    }

    @Override
    public void fly() {
    //重写接口的方法
        System.out.println("鸟飞");
    }
}
