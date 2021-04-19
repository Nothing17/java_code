package oop_day1;

public class ComputerTest {
    public static void main(String[] args) {
        Computer c1 = new Computer();
        System.out.println(c1);
        Computer c2 = new Computer("华硕","inter");
        System.out.println(c2.CPU);
        System.out.println(c2.bord);
    }
}
