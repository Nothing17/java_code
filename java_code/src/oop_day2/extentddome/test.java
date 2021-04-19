package oop_day2.extentddome;

public class test {
    public static void main(String[] args) {
        Dog d = new Dog("www", 34, "black");
        d.eat();
        d.sleep();
        d.show();
        System.out.println("------------------------------");
        Cat c = new Cat("ete",12,"pink","black");
        c.eat();
        c.sleep();
        c.show();
    }

}
