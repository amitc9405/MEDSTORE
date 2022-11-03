package com.medicalstore.medicalstore.models;

import org.springframework.data.annotation.Id;

public class cart {
    @Id
    private int idcart;
    private int no_of_med;
    private int customer_id;
    private int identification_id;
    public int getIdcart() {
        return idcart;
    }
    public void setIdcart(int idcart) {
        this.idcart = idcart;
    }
    public int getNo_of_med() {
        return no_of_med;
    }
    public void setNo_of_med(int no_of_med) {
        this.no_of_med = no_of_med;
    }
    public int getCustomer_id() {
        return customer_id;
    }
    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }
    public int getIdentification_id() {
        return identification_id;
    }
    public void setIdentification_id(int identification_id) {
        this.identification_id = identification_id;
    }
    
}
