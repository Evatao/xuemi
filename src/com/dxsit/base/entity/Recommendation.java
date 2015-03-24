package com.dxsit.base.entity;

import java.sql.Timestamp;


/**
 * Recommendation entity. @author MyEclipse Persistence Tools
 */

public class Recommendation  implements java.io.Serializable {


    // Fields    

     private Integer recommentId;
     private Admin admin;
     private Integer majorId;
     private Integer blogId;
     private String blogName;
     private Short recomPosition;
     private Short recomAdminId;
     private Timestamp recomDate;


    // Constructors

    /** default constructor */
    public Recommendation() {
    }

    
    /** full constructor */
    public Recommendation(Admin admin, Integer majorId, Integer blogId, String blogName, Short recomPosition, Short recomAdminId, Timestamp recomDate) {
        this.admin = admin;
        this.majorId = majorId;
        this.blogId = blogId;
        this.blogName = blogName;
        this.recomPosition = recomPosition;
        this.recomAdminId = recomAdminId;
        this.recomDate = recomDate;
    }

   
    // Property accessors

    public Integer getRecommentId() {
        return this.recommentId;
    }
    
    public void setRecommentId(Integer recommentId) {
        this.recommentId = recommentId;
    }

    public Admin getAdmin() {
        return this.admin;
    }
    
    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    public Integer getMajorId() {
        return this.majorId;
    }
    
    public void setMajorId(Integer majorId) {
        this.majorId = majorId;
    }

    public Integer getBlogId() {
        return this.blogId;
    }
    
    public void setBlogId(Integer blogId) {
        this.blogId = blogId;
    }

    public String getBlogName() {
        return this.blogName;
    }
    
    public void setBlogName(String blogName) {
        this.blogName = blogName;
    }

    public Short getRecomPosition() {
        return this.recomPosition;
    }
    
    public void setRecomPosition(Short recomPosition) {
        this.recomPosition = recomPosition;
    }

    public Short getRecomAdminId() {
        return this.recomAdminId;
    }
    
    public void setRecomAdminId(Short recomAdminId) {
        this.recomAdminId = recomAdminId;
    }

    public Timestamp getRecomDate() {
        return this.recomDate;
    }
    
    public void setRecomDate(Timestamp recomDate) {
        this.recomDate = recomDate;
    }
   








}