package oop_day4.innerdemo;

public class TestDemo {
    public static void main(String[] args) {
        OutDemo out = new OutDemo("ZZZ",80);
        OutDemo.innerClass in = out.new innerClass();
        out.outmethod();
        out.getVal();
        System.out.println("-----------------------------");
//        内部类变量 方法
//        要创建内部类 1 创建外部类 2 再创建内部类
        OutDemo.innerClass innner = new OutDemo().new innerClass("pink",890,"www");
        innner.innermethod();
        System.out.println("-------------------------");
        innner.show();
        System.out.println("-------------------------");
        innner.getVal();
    }
}
