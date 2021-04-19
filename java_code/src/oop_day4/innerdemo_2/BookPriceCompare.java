package oop_day4.innerdemo_2;

public class BookPriceCompare implements Comparator{
    @Override
    public int compare(Object obj1, Object obj2) {
       Book book1 = (Book) obj1;
       Book book2 = (Book) obj2;
       if(book1.getPrice()== book2.getPrice()){
           return 0;
       }else if(book1.getPrice()> book2.getPrice()){
           return 1;
       }else {
           return -1;
       }
    }
}
