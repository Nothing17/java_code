package oop_day5.exception_0.guessgame.service;

public class Judger {
    public int compare(int val1, int val2) {
        if (val1 == val2) {
            return 0;
        } else if (val1 == 0) {//石头
            if (val2 == 1) {//剪刀
                return 1;
            } else {
                return -1;
            }
        } else if (val1 == 1) {
            if (val2 == 0) {
                return -1;
            } else {
                return 1;
            }

        } else {
            if (val2 == 0) {
                return 1;

            } else {
                return -1;
            }
        }

    }

    public int compate1(int val1,int val2){
        if(val1 == val2){
            return 0;
        }else if(val1 == 0){//石头
            if(val2 == 1){//剪子
                return 1;
            }else {//布
                return -1;
            }

        }else if(val1 == 1){//剪子
            if(val2 == 0){//石头
                return -1;
            }else {//布
                return 1;
            }
        }else {//布
            if(val2 == 1){ //剪子
                return  -1;
            }else {//石头
                return 1;
            }
        }
    }
}
