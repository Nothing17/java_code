package oop_day4.innerdemo_2;

public class BookNameCompare implements Comparator{
    @Override
    public int compare(Object obj1, Object obj2) {
       Book book1 = (Book) obj1;
       Book book2 = (Book) obj2;
       return book1.getBookName().compareTo(book2.getBookName());
    }
}
