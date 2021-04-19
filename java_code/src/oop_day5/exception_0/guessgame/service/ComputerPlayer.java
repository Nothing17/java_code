package oop_day5.exception_0.guessgame.service;

import oop_day5.exception_0.guessgame.util.MyUtil;

public class ComputerPlayer extends Player{
    public ComputerPlayer() {
    }

    public ComputerPlayer(String name) {
        super(name);
    }

    @Override
    public int getInputValue() {
        int num = MyUtil.getRandom(2);
        this.setValue(num);
        return num;

    }
}
