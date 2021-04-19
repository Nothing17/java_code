package day12;

public class dome_1 {
    public static void main(String[] args) {
//        print99();
//        printFactorial(5);
//        int a = pow(2,4);//2 2 2 2
//        System.out.println(a);
        int[] arr ={1,2,3,4,5,6,7,8,9,5};
        int[] arr1 ={12,23,3,4,35,6,730,78,9};
//        int sum =getArrysSum(arr);
//        System.out.println(sum);
//        int val=getArrysMax(arr1);
//        int val1=getArrysmin(arr1);
//        System.out.println(val);
//        System.out.println(val1);
        int val2 = getArrysAvg(arr1);
        System.out.println(val2);
    }

    //乘法
    public static void print99(){
        for (int i = 1; i <=9 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(i+"*"+j+"="+i*j+"\t");
            }
            System.out.println();
        }
    }

//    定义一个方法 向控制台输出一个整数的阶乘
    public static void printFactorial(int n){
        int sum = 1;
        for (int i = n; i > 0 ; i--) {
            sum*=i;
        }
        System.out.println(sum);
    }

//    定义一个方法 返回a的b次方
//    有参数有返回值

    public static int pow(int a,int b){

        int temp = 1;
        for (int i = 1; i <=b ; i++) {
            temp*=a;
        }
        return temp;
    }

//    定义一个方法 返回一个整数数组的元素和
//    参数  一个整数数组
//    返回值 整数int
    public static int getArrysSum(int[] arr){
        int temp = 0;
        for (int i = 0; i <arr.length ; i++) {
            temp+=arr[i];
        }
        return temp;
    }

//    定义一个方法 返回一个整数数组的元素最大值

    public static int getArrysMax(int[] arr){
        int max = arr[0];
        for (int i = 0; i <arr.length ; i++) {
           if (max<arr[i]){
               max = arr[i];
           }
        }
        return max;
    }

//    定义一个方法 返回一个整数数组的元素最小值

    public static int getArrysmin(int[] arr){
        int min = arr[0];
        for (int i = 0; i <arr.length ; i++) {
           if (min>arr[i]){
               min = arr[i];
           }
        }
        return min;
    }

//    定义一个方法 返回一个整数数组的元素平均值
public static int getArrysAvg(int[] arr){
        int temp = getArrysSum(arr);
    System.out.println("和："+temp);
    System.out.println("个数："+arr.length);
        int sum = temp/arr.length;
        return sum;
}










}

