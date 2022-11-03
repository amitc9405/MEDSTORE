package com.medicalstore.medicalstore.models;

import org.springframework.data.annotation.Id;

public class feedback {
    @Id
    private int idfeedback;
    private String comment;
    private int rating;
    private int shopid;
    public int getIdfeedback() {
        return idfeedback;
    }
    public void setIdfeedback(int idfeedback) {
        this.idfeedback = idfeedback;
    }
    public String getComment() {
        return comment;
    }
    public void setComment(String comment) {
        this.comment = comment;
    }
    public int getRating() {
        return rating;
    }
    public void setRating(int rating) {
        this.rating = rating;
    }
    public int getShopid() {
        return shopid;
    }
    public void setShopid(int shopid) {
        this.shopid = shopid;
    }
    
}
