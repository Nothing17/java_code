package oop_day4.interfacedemo;

public class TestFlyable {
    public static void main(String[] args) {
        Flyable fy1 = new Bird();
        fy1.fly();
        Flyable fy2 = new Plane();
        fy2.fly();
        Flyable fy3 = new SuperMan();
        fy3.fly();

    }
}
