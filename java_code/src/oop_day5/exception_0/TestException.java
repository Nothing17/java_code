package oop_day5.exception_0;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestException {
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
        }catch( InputMismatchException e){
           e.printStackTrace();
        }




        System.out.println("3q3q");
        System.out.println("bye");
    }
}
