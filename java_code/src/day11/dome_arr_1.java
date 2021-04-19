package day11;

public class dome_arr_1 {
    public static void main(String[] args) {
        int[] arr={5,52,9,4,3,8,1,5,0};
//        第一次出现的下标值
        int  value = 52;
        int valueIndex = -1;
        int valueIndex1 = -1;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]==value){
                valueIndex = i;
                break;
            }

        }

//        最后一次出现的位置
        for (int i = arr.length-1; i >=0 ; i--) {
            if (arr[i]==value){
                valueIndex1 = i;
                break;
            }

        }
        if (valueIndex == valueIndex1){
            System.out.println("相同");
        }else {
            System.out.println("不同");
        }
    }

}
