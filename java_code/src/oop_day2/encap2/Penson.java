package oop_day2.encap2;

/*
 *修饰符 - 包
 *  public 全部可看
 * default 同一个类 同一个包
 * protected 同一个类 同一个包 子类
 * private 同一个类
 *
 *
 * */
public class Penson {
    private String name;
    private int age;

    public Penson() {
    }

    public Penson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name){
        if(name.length()<0 || name.length()>5){
            this.name = name.substring(0,5);
        }else {
            this.name = name;
        }

    }
    public String getName(){

        return name;
    }

    public void  setAge(int age){
        if(age<0 || age>120){
            this.age = 18;
        }else {
            this.age = age;
        }

    }
    public int getAge(){
        return age;
    }


    public void show() {
        System.out.println("name: " + name + "age: " + age);
    }

}
