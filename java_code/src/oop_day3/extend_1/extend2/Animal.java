package oop_day3.extend_1.extend2;

public class Animal {
    private String name;
    private int age;
    public Animal(){}
    public Animal(String name,int age){
        this.name =name;
        this.age = age;
    }

    public void show(){
        System.out.println("=============Animal()============");
    }
    public void eat(){
        System.out.println("=============Animal-eat()============");
    }
    private void up(){
        System.out.println("=============Animal-up()============");
    }
}
