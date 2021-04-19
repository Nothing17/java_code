package day12;

public class dome_2 {
    public static void main(String[] args) {
//        可变参数
/* 1 可变参数 可以转入多个单独的数 2 可以是数组*/
//    /*注意：1 可变参数只能放在参数列表的最后的位置 2 一个方法的参数表列表只能有一个可变参数*/
    int a = 12;
    int b = 13;
    int c = 14;
    int d = 15;
    int[] arr ={12,56,87,4,79,34,678};

    showArray(a,b,c,d);
    showArray(arr);
    }

    public static void showArray(int ...arr){
        for (int temo:arr
             ) {
            System.out.println(temo);
        }
    }
}
