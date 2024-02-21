package com.example.reactproject.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class RegisterModel {
    
    @Id
    private int regId;
    private String userName;
    private String mobileNumber;
    private String email;
    private String password;
    private String confirmPassword;


    public RegisterModel() {
        
    }
    public RegisterModel(int regId, String userName, String mobileNumber, String email, String password,
            String confirmPassword) {
        this.regId = regId;
        this.userName = userName;
        this.mobileNumber = mobileNumber;
        this.email = email;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }
    public int getRegId() {
        return regId;
    }
    public void setRegId(int regId) {
        this.regId = regId;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getMobileNumber() {
        return mobileNumber;
    }
    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getConfirmPassword() {
        return confirmPassword;
    }
    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }
}
