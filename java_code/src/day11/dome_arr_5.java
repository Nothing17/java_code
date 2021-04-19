package day11;

import java.util.Arrays;

public class dome_arr_5 {
    public static void main(String[] args) {
        int[] arr={12,4,5,6,85,54,74,95,65,82,26,34};
        System.out.println(Arrays.toString(arr));
//        排序 sort
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr) );
        /*在数组中快速的查询给定元素出现的位置
     如果找到元素 返回元素索引 没找到返回一个负数
     Arrays.binarySearch在使用时,要求数组必须是升序的
      */
    int index = Arrays.binarySearch(arr,95);
        System.out.println(index);
        /*数组复制的功能*/
        //获得数组副本
    int[] arr1={1,2,3,4,5,6};
    int[] arr2 = Arrays.copyOf(arr1,arr1.length);
    arr1[0] =100;
    System.out.println(Arrays.toString(arr1));
    System.out.println(Arrays.toString(arr2));


    }
}
