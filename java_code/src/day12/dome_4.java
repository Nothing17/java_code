package day12;

public class dome_4 {
    public static void main(String[] args) {
/*
* 应用案例
定义一个方法  返回一个圆的周长   半径
定义一个方法  返回一个圆的面积   半径
定义一个方法  返回一个矩形的周长 长  宽
定义一个方法  返回一个矩形的面积 长  宽
定义一个方法  返回一个三角形的周长 三个边
定义一个方法  返回一个三角形的面积 三个边 海伦公式(百度)
要求 所有求周长的方法使用同一个方法名
	 所有求面积的方法使用同一个方法名

*
* */
        zhouChang(4);
        zhouChang(2,3);
        zhouChang(3,4,5);



        mianJi(4);
        mianJi(2,3);
        mianJi(3,4,5);




    }
//    园周长
    public static void zhouChang(int r){
        System.out.println("园周长:"+Math.PI*2*r);
    }
//    矩形周长
    public static void zhouChang(int a,int b){
        System.out.println("矩形周长:"+a*2+b*2);
    }
//    三角形周长
    public static void zhouChang(int a,int b,int c){
        int s = a+b+c;
        System.out.println("三角形周长:"+s);
    }
//    圆的面积
    public static void mianJi(int r){
        System.out.println("圆面积:"+Math.PI*(r*r));
    }
//    矩形的面积
    public static void mianJi(int a, int b){
        System.out.println("矩形面积:"+a*b);
    }
//    三角形的面积
    public static void mianJi(int a,int b,int c){
        int p = (a+b+c)/2;
        double s = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        System.out.println("三角形面积:"+s);
    }
}