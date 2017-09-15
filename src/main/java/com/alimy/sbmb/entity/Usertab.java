package com.alimy.sbmb.entity;

import java.io.Serializable;

public class Usertab implements Serializable{
    
    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    private String userId;

    private String username;

    private String gender;

    private String address;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    @Override
    public String toString() {
        return "Usertab [userId=" + userId + ", username=" + username + ", gender=" + gender + ", address=" + address
                + "]";
    }
    
    
}