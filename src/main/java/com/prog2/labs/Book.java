/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prog2.labs;

/**
 *
 * @author ahmad
 */
public class Book {
    String name;
    Author[]  authors;
    double price;
    int qty = 0;

    public String getName() {
        return name;
    }

   

    public Author[] getAuthors() {
        return authors;
    }

    public String getAuthorsName()
    {
        return authors
    }
    public void setAuthors(Author[] authors) {
        this.authors = authors;
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
    
    public Book(String name, Author[] authors, double price){
    
        this.name = name;
        this.authors = authors;
        this.price = price;
    }
    public Book(String name, Author[] authors, double price, int qty){
    
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }
}
