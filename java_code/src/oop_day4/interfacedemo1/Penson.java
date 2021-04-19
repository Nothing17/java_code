package oop_day4.interfacedemo1;

/*
*修饰符 - 包
*  public 全部可看
* default 同一个类 同一个包
* protected 同一个类 同一个包 子类
* private 同一个类
*
*
* */
  public  class Penson implements Comparable{
    private String name;
    private int  age;
    public Penson(){}
    public Penson(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void show(){
        System.out.println("name: "+name+"age: "+age);
    }


    @Override
    public int compareTo(Object obj) {
        /*
        * 如果年龄相同再比较名字
        * */
        Penson other = (Penson)obj;
        if(this.age == other.age){
           return this.name.compareTo(other.name);
        }else {
            return this.age -other.age;
        }
    }
}
