package com.dxsit.base.entity;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;


/**
 * Blog entity. @author MyEclipse Persistence Tools
 */

public class Blog  implements java.io.Serializable {


    // Fields    

     private Integer blogId;
     private BlogCategory blogCategory;
     private String blogName;
     private Integer blogCatgory;
     private String blogConent;
     private Boolean isOriginal;
     private String blogLabel;
     private Integer user;
     private Integer browseCount;
     private Integer commmentCount;
     private Timestamp createTime;
     private Timestamp modifyTime;
     private Boolean deleteState;
     private Boolean isShield;
     private Timestamp shieldTime;
     private Set blogComments = new HashSet(0);


    // Constructors

    /** default constructor */
    public Blog() {
    }

    
    /** full constructor */
    public Blog(BlogCategory blogCategory, String blogName, Integer blogCatgory, String blogConent, Boolean isOriginal, String blogLabel, Integer user, Integer browseCount, Integer commmentCount, Timestamp createTime, Timestamp modifyTime, Boolean deleteState, Boolean isShield, Timestamp shieldTime, Set blogCommments) {
        this.blogCategory = blogCategory;
        this.blogName = blogName;
        this.blogCatgory = blogCatgory;
        this.blogConent = blogConent;
        this.isOriginal = isOriginal;
        this.blogLabel = blogLabel;
        this.user = user;
        this.browseCount = browseCount;
        this.commmentCount = commmentCount;
        this.createTime = createTime;
        this.modifyTime = modifyTime;
        this.deleteState = deleteState;
        this.isShield = isShield;
        this.shieldTime = shieldTime;
        this.blogComments = blogCommments;
    }

   
    // Property accessors

    public Integer getBlogId() {
        return this.blogId;
    }
    
    public void setBlogId(Integer blogId) {
        this.blogId = blogId;
    }

    public BlogCategory getBlogCategory() {
        return this.blogCategory;
    }
    
    public void setBlogCategory(BlogCategory blogCategory) {
        this.blogCategory = blogCategory;
    }

    public String getBlogName() {
        return this.blogName;
    }
    
    public void setBlogName(String blogName) {
        this.blogName = blogName;
    }

    public Integer getBlogCatgory() {
        return this.blogCatgory;
    }
    
    public void setBlogCatgory(Integer blogCatgory) {
        this.blogCatgory = blogCatgory;
    }

    public String getBlogConent() {
        return this.blogConent;
    }
    
    public void setBlogConent(String blogConent) {
        this.blogConent = blogConent;
    }

    public Boolean getIsOriginal() {
        return this.isOriginal;
    }
    
    public void setIsOriginal(Boolean isOriginal) {
        this.isOriginal = isOriginal;
    }

    public String getBlogLabel() {
        return this.blogLabel;
    }
    
    public void setBlogLabel(String blogLabel) {
        this.blogLabel = blogLabel;
    }

    public Integer getUser() {
        return this.user;
    }
    
    public void setUser(Integer user) {
        this.user = user;
    }

    public Integer getBrowseCount() {
        return this.browseCount;
    }
    
    public void setBrowseCount(Integer browseCount) {
        this.browseCount = browseCount;
    }

    public Integer getCommmentCount() {
        return this.commmentCount;
    }
    
    public void setCommmentCount(Integer commmentCount) {
        this.commmentCount = commmentCount;
    }

    public Timestamp getCreateTime() {
        return this.createTime;
    }
    
    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public Timestamp getModifyTime() {
        return this.modifyTime;
    }
    
    public void setModifyTime(Timestamp modifyTime) {
        this.modifyTime = modifyTime;
    }

    public Boolean getDeleteState() {
        return this.deleteState;
    }
    
    public void setDeleteState(Boolean deleteState) {
        this.deleteState = deleteState;
    }

    public Boolean getIsShield() {
        return this.isShield;
    }
    
    public void setIsShield(Boolean isShield) {
        this.isShield = isShield;
    }

    public Timestamp getShieldTime() {
        return this.shieldTime;
    }
    
    public void setShieldTime(Timestamp shieldTime) {
        this.shieldTime = shieldTime;
    }

    public Set getBlogComments() {
        return this.blogComments;
    }
    
    public void setBlogComments(Set blogCommments) {
        this.blogComments = blogCommments;
    }
   








}