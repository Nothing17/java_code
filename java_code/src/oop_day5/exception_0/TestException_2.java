package oop_day5.exception_0;

import java.util.Scanner;

public class TestException_2  {
    public static void main(String[] args) throws Exception {
//        求平均分
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("输入总分：");
            int sum = sc.nextInt();

            System.out.println("输入人数：");
            int num = sc.nextInt();
            if (num<=0){
//                throw  new RuntimeException("人数不能是负数");
                throw new Exception("人数不能是负数");

            }


            int result= sum / num;
            System.out.println("avg: "+result);
        }catch( Exception e){
//           e.printStackTrace();
//           System.exit(0);
            throw e;
        }finally{
//            任何情况下finally 中的代码都会执行
            System.out.println("3q3q");
        }

        System.out.println("bye");
    }
}
