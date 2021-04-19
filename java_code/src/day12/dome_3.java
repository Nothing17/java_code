package day12;

public class dome_3 {
    public static void main(String[] args) {
//      方法重载：1 在一个类中 多个同名方法的定义 2 方法重载并没有减少代码量 只是减少相似方法的大量名
        /*
        * 在一个类中方法重载
        * 1 方法名必须相同
        * 2 参数必须不同
        *   1 参数的类型不同
        *   2 参数的数量不同
        *   3 顺序不同
        *
        * */
        addSum(12,"eee");
        addSum(12,10);
    }

/*   1 参数类型不同   */
    public static void addSum(int a , int b){
        System.out.println(a+b);
    }
    public static void addSum(int a, String b ){
        System.out.println(a+b);
    }

    /*2    参数个数不同*/
    public static void addSum(int a , int b,int c){
        System.out.println(a+b+c);
    }
    public static void addSum(int a, int b, int c, int d ){
        System.out.println(a+b+c+d);
    }
    /*3   参数顺序不同*/

    public static void addSum1(int a , int b){
        System.out.println(a+b);
    }
    public static void addSum1(String b,int a ){
        System.out.println(a+b);
    }

}
