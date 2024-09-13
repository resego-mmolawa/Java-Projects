/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.yourcompany.yourproject;

/**
 *
 * @author reseg
 */
public class Book {

    public String title;
    public String author;
    public double price;
    public int pages;

    public Book(String startTitle, String startAuthor, double startPrice, int startPages){
        title = startTitle;
        author = startAuthor;
        price = startPrice;
        pages = startPages;
    }

    public String getTitle(String startTitle){
        return title;
    }

    public String getAuthor(String startAuthor){
        return author;
    }

    public double getPrice(double getPrice){
        return price;
    }

    public int getPages(int getPages){
        return pages;
    }

    public void setPrice(double newPrice, double startPrice, double discount){
        newPrice = price + (price + discount);
    }

    public void displayBookDetails(String startTitle, String startAuthor, double startPrice, int startPages){
        
    }

    public static void main(String[] args) {
        String title = "Hamlet";
        String author = "William Shakespeare";
        double price = 349.99;
        int pages = 236;



    }
}
