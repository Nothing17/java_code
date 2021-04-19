package oop_day1;

public class dome1 {
    public static void main(String[] args) {
//        基本类型值交换
        int num1 = 10;
        int num2 = 20;
        System.out.println("before num1 num2 "+num1+" "+num2);
        swap(num1,num2);
        System.out.println("after num1 num2 "+num1+" "+num2);
    }

    public static void swap(int num1,int num2){
        int temp =num1;
        num1 = num2;
        num2 = temp;
        System.out.println("on swap num1 num2: "+num1+"  "+num2);
    }

}

/*
* before num1 num2 10 20
on swap num1 num2: 20  10
after num1 num2 10 20
基本类型参数只传值  相当于对本身复制一份传入  对自身的值没有影响 值传递
*
* */
