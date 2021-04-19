package oop_day3.extend_1.superdome;

public class Dog extends Animal {
    private String color;

    public Dog() {
        super();
    }
    public Dog(String name, int age) {
        super(name,age);
    }


    public Dog(String name, int age, String color) {
        this(name,age);
//        super(name, age);
        this.color = color;
    }


    public void show() {
        System.out.println("dog name:"+super.getName()+"  age:"+super.getAge()+"  color:"+color);

    }

    public void eat() {
        System.out.println("dog eat");
    }
}
