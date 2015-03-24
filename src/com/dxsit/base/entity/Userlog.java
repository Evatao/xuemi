package com.dxsit.base.entity;

import java.sql.Timestamp;


/**
 * Userlog entity. @author MyEclipse Persistence Tools
 */

public class Userlog  implements java.io.Serializable {


    // Fields    

     private Integer logId;
     private Integer userId;
     private String descript;
     private Timestamp logDate;


    // Constructors

    /** default constructor */
    public Userlog() {
    }

    
    /** full constructor */
    public Userlog(Integer userId, String descript, Timestamp logDate) {
        this.userId = userId;
        this.descript = descript;
        this.logDate = logDate;
    }

   
    // Property accessors

    public Integer getLogId() {
        return this.logId;
    }
    
    public void setLogId(Integer logId) {
        this.logId = logId;
    }

    public Integer getUserId() {
        return this.userId;
    }
    
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getDescript() {
        return this.descript;
    }
    
    public void setDescript(String descript) {
        this.descript = descript;
    }

    public Timestamp getLogDate() {
        return this.logDate;
    }
    
    public void setLogDate(Timestamp logDate) {
        this.logDate = logDate;
    }
   








}