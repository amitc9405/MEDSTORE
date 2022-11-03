package com.medicalstore.medicalstore.models;


import org.springframework.data.annotation.Id;

public class shop {
    @Id
    private int idshop;
    private String s_name;
    private String s_state;
    private String s_city;
    private String s_pincode;
    private String s_street;
    private String shop_no;
    private int emp_id;
    public int getIdshop() {
        return idshop;
    }
    public void setIdshop(int idshop) {
        this.idshop = idshop;
    }
    public String getS_name() {
        return s_name;
    }
    public void setS_name(String s_name) {
        this.s_name = s_name;
    }
    public String getS_state() {
        return s_state;
    }
    public void setS_state(String s_state) {
        this.s_state = s_state;
    }
    public String getS_city() {
        return s_city;
    }
    public void setS_city(String s_city) {
        this.s_city = s_city;
    }
    public String getS_pincode() {
        return s_pincode;
    }
    public void setS_pincode(String s_pincode) {
        this.s_pincode = s_pincode;
    }
    public String getS_street() {
        return s_street;
    }
    public void setS_street(String s_street) {
        this.s_street = s_street;
    }
    public String getShop_no() {
        return shop_no;
    }
    public void setShop_no(String shop_no) {
        this.shop_no = shop_no;
    }
    public int getEmp_id() {
        return emp_id;
    }
    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }
     
}
