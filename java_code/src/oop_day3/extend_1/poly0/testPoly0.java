package oop_day3.extend_1.poly0;

import oop_day3.extend_1.extend2.Animal;
import oop_day3.extend_1.extend2.Dog;

public class testPoly0 {
    public static void main(String[] args) {
        Animal an = new Animal();
        an.eat(); //继承
        an.show();
        System.out.println("===========================");
//        向上转型
//      编译时类型     运行时类型
        Animal an1 = new Dog();
        an1.show(); //重写
//        an1.up();
//       an1.sleep(); 调用不到子类特有的方法
//多态：1 有继承（Dog extendts Animal）2 父类作为编译时类型 父类引用指向子类实例对象 3 父类不能调用子类特有的方法

//        向下转型
        Dog an11 = (Dog) an1;
        an11.sleep();
    }
}
