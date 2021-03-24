package com.company;

import java.util.Arrays;

public class Book {
    String name;
    Author[] authors = {};
    double price;
    int qty = 0;

    public Book(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public Book(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }



    public String getName() {
        return name;
    }

    public String getAuthors() {
        return Arrays.toString(authors);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "Book[" +
                "name='" + name + '\'' +
                ", authors=" + Arrays.toString(authors) +
                ", price=" + price +
                ", qty=" + qty +
                ']';
    }
    public String getAuthorNames(){
        String name = "";
        for (int i=0; i < authors.length; i++){
            if (i==0){
                name = authors[0].name;
            }
            else {
                name=name+" "+authors[i].name;
            }
        }
        return name;
    }
}
