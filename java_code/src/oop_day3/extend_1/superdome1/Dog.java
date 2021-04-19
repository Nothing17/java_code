package oop_day3.extend_1.superdome1;

public class Dog extends Anmial {
    String name = "Dog name";
    public void getLocalName(){
        System.out.println(name);
    }
    public void getSuperName(){
        System.out.println(super.name);
    }
    public void method(){
        String name = "selfname";
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
    }

    public static void main(String[] args) {

        Dog d = new Dog();
        d.getLocalName();
        d.getSuperName();
        d.method();

    }


}
