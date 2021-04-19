package oop_day4.interfacedemo1;

public class Book {
    private String bookName;
    private String author;
    private String publisher;
    private double price;

    public Book(){}

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookName() {
        return bookName;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPrice(double price) {
        if(price<10){
            System.out.println("价格不对");
            return;
        }else {
            this.price = price;
        }

    }

    public double getPrice() {
        return price;
    }

    public void showBook(){
        System.out.println("book: " +this.getBookName()+this.getAuthor()+this.getPublisher()+getPrice());
    }
}
