package com.dxsit.base.entity;
// default package

import java.util.Date;
import java.util.HashSet;
import java.util.Set;


/**
 * BlogCommment entity. @author MyEclipse Persistence Tools
 */

public class BlogComment  implements java.io.Serializable {


    // Fields    

     private Integer commentId;
     private Blog blog;
     private Integer userId;
     private Integer customId;
     private String content;
     private Date commentDate;
     private Set blogReplies = new HashSet(0);


    // Constructors

    /** default constructor */
    public BlogComment() {
    }

    
    /** full constructor */
    public BlogComment(Blog blog, Integer userId, Integer customId, String content, Date commentDate, Set blogReplies) {
        this.blog = blog;
        this.userId = userId;
        this.customId = customId;
        this.content = content;
        this.commentDate = commentDate;
        this.blogReplies = blogReplies;
    }

   
    // Property accessors

    public Integer getCommentId() {
        return this.commentId;
    }
    
    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    public Blog getBlog() {
        return this.blog;
    }
    
    public void setBlog(Blog blog) {
        this.blog = blog;
    }

    public Integer getUserId() {
        return this.userId;
    }
    
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getCustomId() {
        return this.customId;
    }
    
    public void setCustomId(Integer customId) {
        this.customId = customId;
    }

    public String getContent() {
        return this.content;
    }
    
    public void setContent(String content) {
        this.content = content;
    }

    public Date getCommentDate() {
        return this.commentDate;
    }
    
    public void setCommentDate(Date commentDate) {
        this.commentDate = commentDate;
    }

    public Set getBlogReplies() {
        return this.blogReplies;
    }
    
    public void setBlogReplies(Set blogReplies) {
        this.blogReplies = blogReplies;
    }
   








}