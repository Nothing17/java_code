package oop_day5.exception_0;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestException_1 {
    public static void main(String[] args) {
//        求平均分
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("输入总分：");
            int sum = sc.nextInt();

            System.out.println("输入人数：");
            int num = sc.nextInt();

            int result= sum / num;
            System.out.println("avg: "+result);
        }catch( Exception e){
           e.printStackTrace();
           return;
//           System.exit(0);
        }finally{
//            任何情况下finally 中的代码都会执行
            System.out.println("3q3q");
        }





        System.out.println("bye");
    }
}
