package oop_day1;

class Person {
    /*静态的特征：姓名、年龄、性别、住址
   动态的行为：eat、rest、work

    *
    *
    * */
//    成员变量
    public String name;
    public  int age;
    public  String sex;
    public String arrdess;
    
    public void eat(){
        System.out.println("吃");
    }
    public void rest(){
        System.out.println("休息");
    }
    public void work(String w){
        w = "11"; //局部变量
        System.out.println("工作"+w);
    }

}