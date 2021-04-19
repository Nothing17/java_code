package oop_day5.exception_0.guessgame.util;

import java.util.Random;

public class MyUtil {
    public MyUtil(){}
    public static int getRandom(int n){
        return new Random().nextInt(n+1);
    }

    /**
     * random() 随机生成[0,1)
     * @param min
     * @param max
     * @return
     */
    public static int getRandom(int min,int max){
        return (int) (Math.random()*(max-min+1)+min);
    }
}
