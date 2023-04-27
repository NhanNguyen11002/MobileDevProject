package com.example.nike_store.model;

public class BestSeller {
    private String name;
    private String type;
    private String imageurl;
    private String price;
    private String rating;

    public BestSeller() {
    }

    public BestSeller(String name, String type, String imageurl, String price, String rating) {
        this.name = name;
        this.type = type;
        this.imageurl = imageurl;
        this.price = price;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }
}
