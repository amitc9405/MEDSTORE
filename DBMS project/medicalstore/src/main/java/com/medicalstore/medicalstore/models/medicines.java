package com.medicalstore.medicalstore.models;

import java.sql.Date;

import org.springframework.data.annotation.Id;

public class medicines {
    @Id
    private int identification_id;
    private String med_name;
    private String med_description;
    private Date mfg_date;
    private Date expiry_date;
    private int price;
    private int available_quantity;
    private int shop_id;
    public int getIdentification_id() {
        return identification_id;
    }
    public void setIdentification_id(int identification_id) {
        this.identification_id = identification_id;
    }
    public String getMed_name() {
        return med_name;
    }
    public void setMed_name(String med_name) {
        this.med_name = med_name;
    }
    public String getMed_description() {
        return med_description;
    }
    public void setMed_description(String med_description) {
        this.med_description = med_description;
    }
    public Date getMfg_date() {
        return mfg_date;
    }
    public void setMfg_date(Date mfg_date) {
        this.mfg_date = mfg_date;
    }
    public Date getExpiry_date() {
        return expiry_date;
    }
    public void setExpiry_date(Date expiry_date) {
        this.expiry_date = expiry_date;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public int getAvailable_quantity() {
        return available_quantity;
    }
    public void setAvailable_quantity(int available_quantity) {
        this.available_quantity = available_quantity;
    }
    public int getShop_id() {
        return shop_id;
    }
    public void setShop_id(int shop_id) {
        this.shop_id = shop_id;
    }
    
}
