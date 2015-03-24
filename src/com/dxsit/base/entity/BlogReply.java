package com.dxsit.base.entity;
// default package

import java.sql.Timestamp;


/**
 * BlogReply entity. @author MyEclipse Persistence Tools
 */

public class BlogReply  implements java.io.Serializable {


    // Fields    

     private Integer replyId;
     private BlogComment blogComment;
     private Timestamp content;
     private Timestamp replyDate;
     private Integer toUser;


    // Constructors

    /** default constructor */
    public BlogReply() {
    }

	/** minimal constructor */
    public BlogReply(BlogComment blogComment) {
        this.blogComment = blogComment;
    }
    
    /** full constructor */
    public BlogReply(BlogComment blogComment, Timestamp content, Timestamp replyDate, Integer toUser) {
        this.blogComment = blogComment;
        this.content = content;
        this.replyDate = replyDate;
        this.toUser = toUser;
    }

   
    // Property accessors

    public Integer getReplyId() {
        return this.replyId;
    }
    
    public void setReplyId(Integer replyId) {
        this.replyId = replyId;
    }

    public BlogComment getBlogComment() {
        return this.blogComment;
    }
    
    public void setBlogComment(BlogComment blogComment) {
        this.blogComment = blogComment;
    }

    public Timestamp getContent() {
        return this.content;
    }
    
    public void setContent(Timestamp content) {
        this.content = content;
    }

    public Timestamp getReplyDate() {
        return this.replyDate;
    }
    
    public void setReplyDate(Timestamp replyDate) {
        this.replyDate = replyDate;
    }

    public Integer getToUser() {
        return this.toUser;
    }
    
    public void setToUser(Integer toUser) {
        this.toUser = toUser;
    }
   








}