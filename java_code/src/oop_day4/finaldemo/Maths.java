package oop_day4.finaldemo;

public final class Maths {
    private Maths(){}
    private static final double PI = 3.1415926;
    public static final double pow(int x,int y){
        double result = 1;
        for (int i = 0; i < y; i++) {
            result*=x;
        }
        return result;
    }

    public static final double abs(double num){
        if(num >= 0){
            return num;
        }else {
            return -num;
        }
    }

    public static void main(String[] args) {
        double pi = Maths.PI;
        System.out.println(pi);
    }
}
