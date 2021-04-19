package oop_day1;

public class Computer {
    public String bord;
    public String CPU;
//    空参构造函数
    public Computer(){
        System.out.println("Computer()");
    }
//    有参构造函数
    public Computer(String bord,String CPU){
        this.bord = bord;
        this.CPU = CPU;
    }
}
