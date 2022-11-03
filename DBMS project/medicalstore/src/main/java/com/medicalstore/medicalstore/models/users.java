package com.medicalstore.medicalstore.models;

import org.springframework.data.annotation.Id;


public class users {
    @Id
    private int user_id;
    private String username;
    private String password;
    private String role;
    private int enabled;

    public int getUser_id(){
        return user_id;
    }
    public void setUser_id(int user_id){
        this.user_id = user_id;
    }

    public String getUsername(){
        return username;
    }
    public void setUsername(String username){
        this.username = username;
    }

    public String getPasString(){
        return password;
    }
    public void setPassword(String password){
        this.password = password;
    }

    public String getRole(){
        return role;
    }
    public void setRole(String role){
        this.role = role;
    }

    public int getEnabled(){
        return enabled;
    }
    public void setEnabled(int enabled){
        this.enabled = enabled;
    }

    
      
}
