package day11;

import java.lang.reflect.Array;
import java.util.Arrays;

public class dome_arr_2 {
    public static void main(String[] args) {

        int[] a={1,2,3,4,5,6,7,8,9};
        int[] b={11,22,33,44,55,66,77,88,99};
        int aLength = a.length;
        int bLength = b.length;
        int[] newArr = new int[aLength+bLength];
        for (int i = 0; i <aLength ; i++) {
            newArr[i] = a[i];
        }
        for (int i = 0; i <b.length ; i++) {
            newArr[aLength+i] =b[i];
        }

        System.out.println(Arrays.toString(newArr));
    }
}
