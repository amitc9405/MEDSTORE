package com.medicalstore.medicalstore.models;

import java.sql.Date;

import org.springframework.data.annotation.Id;

public class transaction_history {
    @Id
    private int transaction_id;
    private String mode_of_tran;
    private int amount;
    private Date tran_date;
    private int customer_id;
    public int getTransaction_id() {
        return transaction_id;
    }
    public void setTransaction_id(int transaction_id) {
        this.transaction_id = transaction_id;
    }
    public String getMode_of_tran() {
        return mode_of_tran;
    }
    public void setMode_of_tran(String mode_of_tran) {
        this.mode_of_tran = mode_of_tran;
    }
    public int getAmount() {
        return amount;
    }
    public void setAmount(int amount) {
        this.amount = amount;
    }
    public Date getTran_date() {
        return tran_date;
    }
    public void setTran_date(Date tran_date) {
        this.tran_date = tran_date;
    }
    public int getCustomer_id() {
        return customer_id;
    }
    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }
    
}
