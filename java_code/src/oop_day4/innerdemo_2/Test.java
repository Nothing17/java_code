package oop_day4.innerdemo_2;

public class Test {
    public static void main(String[] args) {
        Book book1 = new Book("caa","zhangsan","biejing",80);
        Book book2 = new Book("baa","lisi","biejing",85);
       /* BookNameCompare b = new BookNameCompare();
        BookPriceCompare b1 = new BookPriceCompare();
        int compare = b.compare(book1, book2);
        System.out.println(compare);
        int compare1 = b1.compare(book1, book2);
        System.out.println(compare1);*/
//        Test.BookNameCompare bnc = new Test().new BookNameCompare();
//        int compare = bnc.compare(book1, book2);
//        System.out.println(compare);
        //    匿名内部类
        Comparator comparebcc1 = new Comparator() {

            @Override
            public int compare(Object obj1, Object obj2) {
                Book book1 = (Book) obj1;
                Book book2 = (Book) obj2;
                return book1.getBookName().compareTo(book2.getBookName());
            }
        };

        int compare = comparebcc1.compare(book1, book2);
        System.out.println(compare);



    }
//内部类
/*    class BookNameCompare implements Comparator{

        @Override
        public int compare(Object obj1, Object obj2) {
            Book book1 = (Book) obj1;
            Book book2 = (Book) obj2;
            return book1.getBookName().compareTo(book2.getBookName());
        }
    }*/


}
