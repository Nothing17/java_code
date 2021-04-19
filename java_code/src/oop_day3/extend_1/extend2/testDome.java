package oop_day3.extend_1.extend2;

public class testDome {
//    使用父类作为形参
    public void setObj(Animal a){
      a.show();
    }


    public static void main(String[] args) {


        testDome t = new testDome();
//        传入的子类对象的引用 动态的创建子类对象
        Animal a = new Cat();
        t.setObj(a);
        t.setObj(new Dog());

    }
}
