package com.medicalstore.medicalstore.models;

import org.springframework.data.annotation.Id;

public class bill {
    @Id
    private int bill_no;
    private int cost;
    private int order_id;
    public int getBill_no() {
        return bill_no;
    }
    public void setBill_no(int bill_no) {
        this.bill_no = bill_no;
    }
    public int getCost() {
        return cost;
    }
    public void setCost(int cost) {
        this.cost = cost;
    }
    public int getOrder_id() {
        return order_id;
    }
    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }
    
}
