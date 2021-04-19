package oop_day2.extentddome;

public class Dog extends Animal{
    private String color;
    public Dog(){}
    public Dog(String name,int age,String color){
        super(name,age);
        this.color = color;
    }
    public void show(){
        System.out.println("dog show");
    }
    public void eat(){
        System.out.println("dog eat");
    }
}
