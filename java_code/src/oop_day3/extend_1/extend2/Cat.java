package oop_day3.extend_1.extend2;

public class Cat extends Animal{
    private String name;
    private int age;
    public Cat(){}
    public Cat(String name,int age){
        super(name,age);
    }

    @Override
    public void show() {
        System.out.println("===========Cat()===============");
    }
}
