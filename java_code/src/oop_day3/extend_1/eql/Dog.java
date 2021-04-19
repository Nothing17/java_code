package oop_day3.extend_1.eql;



public class Dog extends Anmial {
    String name = "Dog name";
    String color = "黑色";
    public Dog(){}
    public Dog(String name,int age,String color){
        super(name,age);
        this.color =color;

    }

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
