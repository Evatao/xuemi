package com.dxsit.base.entity;
// default package

import java.util.HashSet;
import java.util.Set;


/**
 * BlogCategory entity. @author MyEclipse Persistence Tools
 */

public class BlogCategory  implements java.io.Serializable {


    // Fields    

     private Integer categoryId;
     private Userinfo userinfo;
     private String categoryName;
     private Short blogsCount;
     private Short categoryIndex;
     private Set blogs = new HashSet(0);


    // Constructors

    /** default constructor */
    public BlogCategory() {
    }

    
    /** full constructor */
    public BlogCategory(Userinfo userinfo, String categoryName, Short blogsCount, Short categoryIndex, Set blogs) {
        this.userinfo = userinfo;
        this.categoryName = categoryName;
        this.blogsCount = blogsCount;
        this.categoryIndex = categoryIndex;
        this.blogs = blogs;
    }

   
    // Property accessors

    public Integer getCategoryId() {
        return this.categoryId;
    }
    
    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Userinfo getUserinfo() {
        return this.userinfo;
    }
    
    public void setUserinfo(Userinfo userinfo) {
        this.userinfo = userinfo;
    }

    public String getCategoryName() {
        return this.categoryName;
    }
    
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public Short getBlogsCount() {
        return this.blogsCount;
    }
    
    public void setBlogsCount(Short blogsCount) {
        this.blogsCount = blogsCount;
    }

    public Short getCategoryIndex() {
        return this.categoryIndex;
    }
    
    public void setCategoryIndex(Short categoryIndex) {
        this.categoryIndex = categoryIndex;
    }

    public Set getBlogs() {
        return this.blogs;
    }
    
    public void setBlogs(Set blogs) {
        this.blogs = blogs;
    }
   








}