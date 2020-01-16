package com.company;

import java.util.Random;

public class Product {
    private String title;
    private int price;
    private int rating;
    Random random = new Random();

    public Product(String title) {
        this.title = title;
    }

    public Product() {
    }

    public void productPrice(){
        this.price = random.nextInt(50) + 50;
    }

    public int productRating(){
        this.rating = random.nextInt(10);
        return this.rating;
    }

    //region Getter and Setter
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
    //endregion
}
