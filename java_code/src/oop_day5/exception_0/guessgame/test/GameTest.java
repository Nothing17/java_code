package oop_day5.exception_0.guessgame.test;

import oop_day5.exception_0.guessgame.service.ComputerPlayer;
import oop_day5.exception_0.guessgame.service.GameInterface;
import oop_day5.exception_0.guessgame.service.GuessGame;
import oop_day5.exception_0.guessgame.service.UserPlay;

import java.util.Random;

public class GameTest {

    public static int getRandom(int min,int max){
        return (int) (Math.random()*(max-min+1)+min);
    }
    public static void main(String[] args) {
//        Random random = new Random();
////        System.out.println(random.nextInt(3));
////        System.out.println(getRandom(0,2));
//        UserPlay user = new UserPlay();
//        ComputerPlayer cp = new ComputerPlayer();
//        System.out.println(cp.getInputValue());
////        System.out.println(user.getInputValue());

        GameInterface game = new GuessGame();
        game.initGame();
        game.startGame();
        game.endGame();

    }
}
