package com.dxsit.base.entity;

import java.sql.Timestamp;


/**
 * Adminlog entity. @author MyEclipse Persistence Tools
 */

public class Adminlog  implements java.io.Serializable {


    // Fields    

     private Integer logId;
     private Integer adminId;
     private String descript;
     private Timestamp logDate;


    // Constructors

    /** default constructor */
    public Adminlog() {
    }

    
    /** full constructor */
    public Adminlog(Integer adminId, String descript, Timestamp logDate) {
        this.adminId = adminId;
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

    public Integer getAdminId() {
        return this.adminId;
    }
    
    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
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