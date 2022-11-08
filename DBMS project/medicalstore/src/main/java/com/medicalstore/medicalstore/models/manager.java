package com.medicalstore.medicalstore.models;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.format.annotation.DateTimeFormat;

public class manager {
    @Id
    private int idmanager;
    private String manager_name;
    private String manager_sex;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date manager_dob;
    private String manager_aadhar_no;
    private String manager_phn_no;
    private String manager_state;
    private String manager_city;
    private int manager_pincode;
    private String manager_street;
    private String manager_house_no;
    private int salary;
    private int manager_userid;
    
    public manager() {
    }
    public int getIdmanager() {
        return idmanager;
    }
    public void setIdmanager(int idmanager) {
        this.idmanager = idmanager;
    }
    public String getManager_name() {
        return manager_name;
    }
    public void setManager_name(String manager_name) {
        this.manager_name = manager_name;
    }
    public String getManager_sex() {
        return manager_sex;
    }
    public void setManager_sex(String manager_sex) {
        this.manager_sex = manager_sex;
    }
    public Date getManager_dob() {
        return manager_dob;
    }
    public void setManager_dob(Date manager_dob) {
        this.manager_dob = manager_dob;
    }
    public String getManager_aadhar_no() {
        return manager_aadhar_no;
    }
    public void setManager_aadhar_no(String manager_aadhar_no) {
        this.manager_aadhar_no = manager_aadhar_no;
    }
    public String getManager_phn_no() {
        return manager_phn_no;
    }
    public void setManager_phn_no(String manager_phn_no) {
        this.manager_phn_no = manager_phn_no;
    }
    public String getManager_state() {
        return manager_state;
    }
    public void setManager_state(String manager_state) {
        this.manager_state = manager_state;
    }
    public String getManager_city() {
        return manager_city;
    }
    public void setManager_city(String manager_city) {
        this.manager_city = manager_city;
    }
    public int getManager_pincode() {
        return manager_pincode;
    }
    public void setManager_pincode(int manager_pincode) {
        this.manager_pincode = manager_pincode;
    }
    public String getManager_street() {
        return manager_street;
    }
    public void setManager_street(String manager_street) {
        this.manager_street = manager_street;
    }
    public String getManager_house_no() {
        return manager_house_no;
    }
    public void setManager_house_no(String manager_house_no) {
        this.manager_house_no = manager_house_no;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public int getManager_userid() {
        return manager_userid;
    }
    public void setManager_userid(int manager_userid) {
        this.manager_userid = manager_userid;
    }
    public manager(String manager_name, String manager_sex, Date manager_dob, String manager_aadhar_no,
            String manager_ph_no, String manager_state, String manager_city, int manager_pincode, String manager_street,
            String manager_house_no, int salary, int manager_userid) {
        this.manager_name = manager_name;
        this.manager_sex = manager_sex;
        this.manager_dob = manager_dob;
        this.manager_aadhar_no = manager_aadhar_no;
        this.manager_phn_no = manager_ph_no;
        this.manager_state = manager_state;
        this.manager_city = manager_city;
        this.manager_pincode = manager_pincode;
        this.manager_street = manager_street;
        this.manager_house_no = manager_house_no;
        this.salary = salary;
        this.manager_userid = manager_userid;
    }

    
    
    

}
