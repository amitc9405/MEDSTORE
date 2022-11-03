package com.medicalstore.medicalstore.models;

import java.sql.Date;

import org.springframework.data.annotation.Id;

public class shop_expenditure {
    @Id
    private int idexpenditure;
    private int idshop;
    private int idmanager;
    private Date expenditure_date;
    private int exp_amount;
    private String expenditure_discription;
    public int getIdexpenditure() {
        return idexpenditure;
    }
    public void setIdexpenditure(int idexpenditure) {
        this.idexpenditure = idexpenditure;
    }
    public int getIdshop() {
        return idshop;
    }
    public void setIdshop(int idshop) {
        this.idshop = idshop;
    }
    public int getIdmanager() {
        return idmanager;
    }
    public void setIdmanager(int idmanager) {
        this.idmanager = idmanager;
    }
    public Date getExpenditure_date() {
        return expenditure_date;
    }
    public void setExpenditure_date(Date expenditure_date) {
        this.expenditure_date = expenditure_date;
    }
    public int getExp_amount() {
        return exp_amount;
    }
    public void setExp_amount(int exp_amount) {
        this.exp_amount = exp_amount;
    }
    public String getExpenditure_discription() {
        return expenditure_discription;
    }
    public void setExpenditure_discription(String expenditure_discription) {
        this.expenditure_discription = expenditure_discription;
    }
    

}
