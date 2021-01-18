package com.stephen.persionnal.spring.springbean;



public class Book {
    private String id;
    private String title;
    private String author;
    private String price;
    private String sales;

    public Book(){

    }

    public Book(String id, String title, String author, String price, String sales) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = price;
        this.sales = sales;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getSales() {
        return sales;
    }

    public void setSales(String sales) {
        this.sales = sales;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price='" + price + '\'' +
                ", sales='" + sales + '\'' +
                '}';
    }
}
