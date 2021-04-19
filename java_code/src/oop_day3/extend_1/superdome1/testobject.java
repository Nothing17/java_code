package oop_day3.extend_1.superdome1;

public class testobject {
    public static void main(String[] args) throws InterruptedException {
        Object b = new Object();
        b.toString();//把对象转换成字符串
        b.equals("");//对象的比较 与 ==不同
        b.hashCode();//哈希值
        b.notify();
        b.wait(324);

    }
}
