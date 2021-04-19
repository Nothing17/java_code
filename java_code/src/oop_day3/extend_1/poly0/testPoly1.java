package oop_day3.extend_1.poly0;

import oop_day3.extend_1.extend2.Animal;
import oop_day3.extend_1.extend2.Cat;
import oop_day3.extend_1.extend2.Dog;

public class testPoly1 {
    public static void main(String[] args) {
        //基本类型
        //向上转型
        int a = 20;
        double b = a;
        System.out.println(b);
//
//        向下转型
        double c = 3.14;
        int d = (int) c; //需要强转 会损失精度
        System.out.println(d);



//        应用类型
//        向上转型  不能直接调用子类特有方法
        Animal an = new Dog();
        an.show();
        an.eat();
//        an.sleep();

//        向下转型 //需要强转对像 不会有损失
        Dog dog = (Dog)an;
        dog.show();
        dog.eat();
        dog.sleep();


//        instanceof

        System.out.println(an instanceof Animal);
        System.out.println(an instanceof Dog);
        System.out.println(an instanceof Object);
        System.out.println(an instanceof Cat);
//        System.out.println(an instanceof String);
//      变量 instanceof 对象   //instanceof 要在继承树上 与 它的父类或者子类作比较
    }
}
