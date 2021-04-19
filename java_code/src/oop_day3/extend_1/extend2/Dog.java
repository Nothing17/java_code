package oop_day3.extend_1.extend2;

public class Dog extends Animal {
    private String name;
    private int age;
    public Dog(){

    }
    public Dog(String name,int age){
        super(name,age);
    }

    @Override
    public void show() {
        System.out.println("============Dog()===========");
    }

    public void sleep(){
        System.out.println("============Dog sleep===========");
    }
}
