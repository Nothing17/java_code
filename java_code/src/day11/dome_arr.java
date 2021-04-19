package day11;

import java.util.Scanner;

public class dome_arr {
    public static void main(String[] args) {
//        新建数组
//        int[] arr ={1,23,45,6,78,};
////        数组长度
//        int arrlength = arr.length;
//
////        for (int i = 0; i <arr.length ; i++) {
////            System.out.println(arr[i]);
////        }
//        for (int temp:arr
//             ) {
//            System.out.println(temp);
//        }
//        System.out.println(arr[1]);
////
//        System.out.println("数组长度"+arrlength);
        int[] arr = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i <10 ; i++) {
            arr[i] = sc.nextInt();
        }

//        最大值
        int maxMun = arr[0];
        int minNum = arr[0];
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i]>maxMun){
                maxMun=arr[i];
            }
            if(arr[i]<minNum){
                minNum = arr[i];
            }
        }

        System.out.println("最大值： "+maxMun);
        System.out.println("最小值： "+minNum);
    }


}
