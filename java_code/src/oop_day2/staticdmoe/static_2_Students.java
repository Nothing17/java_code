package oop_day2.staticdmoe;

public class static_2_Students {
//    静态代码块

    private String name;
    private int age;
    static{
        System.out.println("代码块-1");
    }

    public static_2_Students(){}
    public static_2_Students(String name){
        this.name = name;
    }
    static{
        System.out.println("代码块—2");
    }

    /**
     *
     */
    public void show(){
        System.out.println(this.name);
    }

    /**
     * 
     * @return
     */
    public int read(){
        int a = 200;
        System.out.println(this.name);
        return 100;
    }

    public static void main(String[] args) {
        static_2_Students s = new static_2_Students("chanse");
        static_2_Students s1 = new static_2_Students("chanse2");
        s.age =23;
        s.show();

    }
}
