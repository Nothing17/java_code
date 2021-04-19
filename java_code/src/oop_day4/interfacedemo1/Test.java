package oop_day4.interfacedemo1;

public class Test {
    public static void main(String[] args) {
        Penson p1 = new Penson("zhangsan",30);
        Penson p2 = new Penson("zhang",50);
        int result = p1.compareTo(p2);
        System.out.println(result);
    }
}
