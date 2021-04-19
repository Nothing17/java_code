package oop_day3.extend_1.eql;

public class test {
    public static void main(String[] args) {
        Dog d1 = new Dog("www", 34, "black");
        Dog d2 = new Dog("www", 34, "black");
        Anmial anmial1 = new Anmial("qqq",23);
        Anmial anmial2 = new Anmial("qqq",23);
        System.out.println(anmial1.equals(anmial2));
        int m1 = 10;
        int m2 = 10;
        System.out.println(m1==m2);
        System.out.println(d1 == d2);
        System.out.println(d1.equals(d2));


    }

}
