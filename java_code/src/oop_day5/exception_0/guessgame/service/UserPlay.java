package oop_day5.exception_0.guessgame.service;

import java.util.Scanner;

public class UserPlay extends Player{
    public UserPlay() {
    }

    public UserPlay(String name) {
        super(name);
    }

    @Override
    public int getInputValue() {
        Scanner sc = new Scanner(System.in);
        System.out.println("输0-2的数 0为石头 1为剪刀 2为布 ");
        int num = sc.nextInt();
        super.setValue(num);
        return num;
    }
}
