package oop_day4.innerdemo_1;
import oop_day4.innerdemo_1.OutDemo.innerClass;
public class TestDemo {
    public static void main(String[] args) {
        OutDemo out = new OutDemo("ZZZ",80);

        out.outmethod();
        out.getVal();
        System.out.println("-----------------------------");
//        内部类变量 方法
//        要创建内部类  创建 new外部类.内部类
        OutDemo.innerClass innner = new OutDemo.innerClass("pink",890,"www");
        innner.innermethod();
        System.out.println("-------------------------");
        innner.show();
        System.out.println("-------------------------");
        innner.getVal();
        System.out.println("-------------------------");

        innerClass in = new innerClass();
        in.show();
    }
}
