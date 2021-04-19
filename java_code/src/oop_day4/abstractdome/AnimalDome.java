package oop_day4.abstractdome;

public class AnimalDome extends Animal{
    public AnimalDome(){}
    public AnimalDome(String str){
        super(str);
    }

    @Override
    public void shout(String str) {
        System.out.println("================="+str);
    }

    public static void main(String[] args) {
        Animal an= new AnimalDome("狗");
        System.out.println(an.name);
        an.shout("狗叫");

    }
}
