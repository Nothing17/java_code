package oop_day4.innerdemo_1;

public class OutDemo {
    private static String name = "tttt";
    private static int num = 10;

    public OutDemo() {
    }

    public OutDemo(String name, int num) {
        this.name = name;
        this.num = num;
    }

    public static void outmethod() {
        System.out.println("outclass");
    }

    public void getVal() {
        int a = 50;
        System.out.println(a);
    }

    //    内部类
    public static class innerClass {
        private String color;
        private String name;
        public double index;

        public innerClass() {
        }

        public innerClass(String color, double index, String name) {
            this.color = color;
            this.index = index;
            this.name = name;
        }

        public void innermethod() {
            System.out.println("innermethod");
            System.out.println(this.color + "======inner=====" + index);
        }

        public void show() {
            System.out.println("outclass name age " + name + num);
//            内部类调用与外部类同名变量
//            System.out.println();
            outmethod();
        }

        public void getVal() {
            int a = 400;
            System.out.println(a);

            System.out.println("访问外部name:"+ OutDemo.name);
        }
    }
}
