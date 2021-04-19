package oop_day2.staticdmoe;
/*
* static 静态方法 静态变量
*
*
* */
//静态变量 第一次加载类的时侯  非静态 创建实例对象的时候


public class Students {
    private String name;
    private int age;
    private static String room; //静态变量

    public Students(){}
    public Students(String name,int age){
        this.name = name;
        this.age = age;
    }
    public Students(String name,int age, String room){
        this(name,age);
        this.room = room;
    }
    public void show(){

    }
    public static void study(){
        System.out.println("study!");
//        静态方法不能调用 非静态的方法和变量
//        show();
//        int a = this.age;
    }

    public static void setRoom(String room){
//     静态方法能调用非静态方法和变量
        Students.room = room;
    }
    public static void getRoom(){
        System.out.println(room);
    }



    public static void main(String[] args) {
//        static 静态变量只创建一次 全部成员共用
        System.out.println(Students.room);
        Students.room = "502";
        study(); //静态方法可以直接调用
        System.out.println(Students.room);
        Students s = new Students("chanse",23,"404");
        System.out.println(s.room);
        System.out.println(Students.room);
        s.study();
        System.out.println("11111111111111111111111111");
        setRoom("3435");
        getRoom();
    }
}
