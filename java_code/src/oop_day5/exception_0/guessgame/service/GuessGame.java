package oop_day5.exception_0.guessgame.service;

import oop_day5.exception_0.guessgame.util.Constants;

public class GuessGame implements GameInterface{

    private UserPlay user;
    private ComputerPlayer cpp;
    private Judger judger;
    private int count;

    @Override
    public void initGame() {
//初始化
        user = new UserPlay("玩家");
        cpp = new ComputerPlayer("人机");
        judger = new Judger();
        count = 1;
    }

    @Override
    public void startGame() {
//        永真
        /*
        * 1 获取玩家数值
        * 2 获取人机数值
        * 3 显示双方数值
        * 4 裁判比较
        * 5 修改获胜者的比分
        * 6 显示本局结果
        * 7 结束游戏
        *
        *
        * */

        while (true){
            System.out.println("======================"+ count++ +"====================");
            int val1 = user.getInputValue();
            int val2 = cpp.getInputValue();
            System.out.println(user.getName()+":"+ Constants.NAME[val1]+"==="+user.getValue()+"  "+cpp.getName()+":"+Constants.NAME[val2]+"=="+cpp.getValue());
            int result = judger.compate1(val1,val2);
            System.out.println("结果："+result);
            modifyWinCount(result);
            showResult(result);

            if(user.getWinCount() == Constants.WIN_COUNT || cpp.getWinCount() == Constants.WIN_COUNT){
                break;
            }
        }

    }

    private void showResult(int result) {
        switch (result){
            case 0:
                System.out.println("本局：和局");
                break;
            case 1:
                System.out.println("本局"+user.getName()+"赢");
                break;
            case -1:
                System.out.println("本局"+cpp.getName()+"赢");
                 break;
        }

        //当前比分
        System.out.println("当前比分为 "
                +user.getName()+"    " +user.getWinCount() +":"
                +cpp.getWinCount()+"   " +cpp.getName());


    }

    private void modifyWinCount(int result) {
        if(result==1){
            user.setWinCount(user.getWinCount()+1);
        }else if(result == -1) {
            cpp.setWinCount(cpp.getWinCount()+1);
        }
    }

    @Override
    public void endGame() {
        System.out.println("==============end=============");
        System.out.println("最终为 "
                +user.getName()+" " +user.getWinCount() +":"
                +cpp.getName()+" " +cpp.getWinCount());

        if(user.getWinCount()>cpp.getWinCount()){
            System.out.println(user.getName()+"获胜");
        }else {
            System.out.println(cpp.getName()+"获胜");
        }

    }
}
