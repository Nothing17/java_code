package day12;

import java.util.Arrays;

public class dome_5 {
    public static void main(String[] args) {
//冒泡排序
        int[] arr = {1,45,23,67,3,6,4};
        int[] s = SortArrays(arr);
        System.out.println(Arrays.toString(s));

    }

    public static int[] SortArrays(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 1; j <arr.length-i-1 ; j++) {
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
}