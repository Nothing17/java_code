package oop_day4.interfacedemo;

public class Plane implements Flyable{
    int num = NUM;
    @Override
    public void fly() {
        System.out.println("飞机飞");
        System.out.println(num);
    }


}
