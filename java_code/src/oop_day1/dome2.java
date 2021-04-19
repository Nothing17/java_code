package oop_day1;

public class dome2 {


    public static void swap(Point p){
        int temp = p.x;
        p.x = p.y;
        p.y = temp;
    }
    public static void main(String[] args) {
//        应用类型参数 传的是引用地址

        int num1 = 10;
        int num2 = 20;
        Point p = new Point();
        p.x = num1;
        p.y = num2;
        System.out.println("before num1 num2 "+p.x+" "+p.y);
        swap(p);
        System.out.println("after num1 num2 "+p.x+" "+p.y);
    }
}
/*
* before num1 num2 10 20
after num1 num2 20 10
* 引用类型传引用地址  相当与复制自身的一份地址传入 所以两份地址都是指向同一块堆内存空间
*
* */