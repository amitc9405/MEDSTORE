package com.medicalstore.medicalstore.models;

import java.sql.Date;

import org.springframework.data.annotation.Id;

public class order {
    @Id
    private int idorder;
    private Date order_date;
    private String payment_status;
    private String delivery_status;
    private int customer;
    private int cart_id;
    public int getIdorder() {
        return idorder;
    }
    public void setIdorder(int idorder) {
        this.idorder = idorder;
    }
    public Date getOrder_date() {
        return order_date;
    }
    public void setOrder_date(Date order_date) {
        this.order_date = order_date;
    }
    public String getPayment_status() {
        return payment_status;
    }
    public void setPayment_status(String payment_status) {
        this.payment_status = payment_status;
    }
    public String getDelivery_status() {
        return delivery_status;
    }
    public void setDelivery_status(String delivery_status) {
        this.delivery_status = delivery_status;
    }
    public int getCustomer() {
        return customer;
    }
    public void setCustomer(int customer) {
        this.customer = customer;
    }
    public int getCart_id() {
        return cart_id;
    }
    public void setCart_id(int cart_id) {
        this.cart_id = cart_id;
    }
    
}
