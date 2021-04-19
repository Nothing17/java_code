package oop_day2.extentddome;

public class Cat extends Animal{
    private String color;
    private String eyes;
    public Cat(){}
    public Cat(String name, int age, String color,String eyes){
        super(name,age);
        this.color = color;
        this.eyes = eyes;
    }
//    public void show(){
//        System.out.println("cat show");
//    }

}
