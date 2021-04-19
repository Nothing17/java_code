package oop_day4.abstractdome;


/*
*抽象类 不能 new 实例
* 抽象类必须有构造方法，子类创建时使用
*  抽象方法必须时在抽象类中
* 子类继承抽象类 子类必须重写抽象父类中的抽象方法
*
*
*
* */

public abstract class Animal {
    public String name;
    public Animal(){}
    public Animal(String name){
        this.name = name;
    }

    public abstract void shout(String str);
}
