package oop_day2.staticdmoe;

public class static_1_Students {
//    静态代码块

    private String name;
    private int age;
    {
        System.out.println("代码块-1");
    }

    public static_1_Students(){}
    public static_1_Students(String name){
        this.name = name;
    }
    {
        System.out.println("代码块—2");
    }
    public void show(){
        System.out.println(this.name);
        {
            System.out.println("代码块-3");
            System.out.println(age);
        }
    }

    public static void main(String[] args) {
        {
            System.out.println("代码块-4");
        }
        static_1_Students s = new static_1_Students("chanse");
        static_1_Students s1 = new static_1_Students("chanse2");
        s.age =23;
        s.show();
        {
            System.out.println("代码块-5");
        }
    }
}
