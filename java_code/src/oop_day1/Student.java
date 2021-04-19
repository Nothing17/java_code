package oop_day1;

public class Student {
    String name;
    int age;
    String sex;
    int socre;
//    构造函数的重载
//    无参
    public Student(){}
//    有参
    public Student(String name, int age, String sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
//        this 指向的是当前实例对象
    }
//    有参 参数个数不同
    public Student(String name, int age, String sex,int socre){
//        this 区分使用哪个构造方法
        /*使用this 调用重载的构造方法，避免属性初始化重复，注意在构造方法中调用重载的构造方法this 必须放在第一条
        * */
//        this.socre = socre;  this 不是在第一条报错
        this(name,age,sex);
        this.socre = socre;
    }

//    this 调用成员方法 （全局方法）
    public void study(){
        System.out.println("studying!!");
    }

    public void show(){
        this.study();
    }
}
