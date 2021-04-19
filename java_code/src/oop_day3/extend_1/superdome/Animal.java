package oop_day3.extend_1.superdome;

public class Animal {
    private String name;
    private  int age;
    public Animal(){}
    public Animal(String name,int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void eat(){
        System.out.println("EATing");
    }

    public void sleep(){
        System.out.println("sleepping");
    }
    public void show(){
        System.out.println("name:  "+name+"  age:  "+age);
    }
}
