package oop_day4.finaldemo;

public class Test {
    public static void main(String[] args) {
//        final 修饰基本数据类型，值只能赋值一次，不可修改
//        final 修饰方法 子类不可重写 但可以重载方法
//        final 修饰类 子类不可继承
//        final 修饰引用类型 不可更改引用 但可以修改实例对象的属性


        final int NUM = 12;
        System.out.println(NUM);
//        NUM = 23; 不能再次赋值
        final Dog dog;

        dog = new Dog("www");
        dog.name = "rrr";
        System.out.println(dog.name);
//        dog = new Dog("ttt");
    }
}
