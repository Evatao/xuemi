package com.dxsit.base.entity;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;


/**
 * Admin entity. @author MyEclipse Persistence Tools
 */

public class Admin  implements java.io.Serializable {


    // Fields    

     private Integer adminId;
     private String adminName;
     private String password;
     private Short state;
     private Short level;
     private String email;
     private Timestamp createTime;
     private Set recommendations = new HashSet(0);


    // Constructors

    /** default constructor */
    public Admin() {
    }

    
    /** full constructor */
    public Admin(String adminName, String password, Short state, Short level, String email, Timestamp createTime, Set recommendations) {
        this.adminName = adminName;
        this.password = password;
        this.state = state;
        this.level = level;
        this.email = email;
        this.createTime = createTime;
        this.recommendations = recommendations;
    }

   
    // Property accessors

    public Integer getAdminId() {
        return this.adminId;
    }
    
    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public String getAdminName() {
        return this.adminName;
    }
    
    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }

    public Short getState() {
        return this.state;
    }
    
    public void setState(Short state) {
        this.state = state;
    }

    public Short getLevel() {
        return this.level;
    }
    
    public void setLevel(Short level) {
        this.level = level;
    }

    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    public Timestamp getCreateTime() {
        return this.createTime;
    }
    
    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public Set getRecommendations() {
        return this.recommendations;
    }
    
    public void setRecommendations(Set recommendations) {
        this.recommendations = recommendations;
    }
   








}