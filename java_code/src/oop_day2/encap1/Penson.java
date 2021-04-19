package oop_day2.encap1;

/*
*修饰符 - 包
*  public 全部可看
* default 同一个类 同一个包
* protected 同一个类 同一个包 子类
* private 同一个类
*
*
* */
  public  class Penson {
    public String name;
    int age;
    public Penson(){}
    public Penson(String name,int age){
        this.name = name;
        this.age = age;
    }

    public void show(){
        System.out.println("name: "+name+"age: "+age);
    }

    public static void main(String[] args) {
        Penson p = new Penson();
        p.name = "ccdc";
        p.age = 12;
        p.show();
    }
}
