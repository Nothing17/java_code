package day11;

import java.util.Arrays;

public class dome_arr_3 {
    public static void main(String[] args) {
        int[] arr={5,9,7,3,4,6,8,2,1,12};
//删除数组中索引为6的元素
        int index = 6;
        int[] newArr = new int[arr.length-1];
        for (int i = 0; i <index; i++) {
            newArr[i] = arr[i];
        }
        for (int i = index; i < arr.length-1; i++) {
            newArr[i] = arr[i+1];
        }
        System.out.println(Arrays.toString(newArr));
    }
}
