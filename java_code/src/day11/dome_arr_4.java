package day11;

import java.util.Arrays;

public class dome_arr_4 {
    public static void main(String[] args) {
        int[] arr={12,4,5,6,85,54,74,95,65,82,26,34};
//        将上述数组中的奇数和偶数分别存放于不同的两个数组
            int odd = 0; //奇数
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2!=0){
                odd++;
            }
        }

        int[] oddArr = new int[odd];
        int[] evenArr = new int[arr.length-odd];
        int num1 =0;
        int num2 =0;
        for (int temp:arr
             ) {
            if (temp%2==0){
                evenArr[num1] = temp;
                num1++;
            }else {
                oddArr[num2] = temp;
                num2++;
            }

        }

        System.out.println(Arrays.toString(evenArr));
        System.out.println(Arrays.toString(oddArr));
    }
}
