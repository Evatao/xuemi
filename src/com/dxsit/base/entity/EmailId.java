package com.dxsit.base.entity;

import java.sql.Timestamp;


/**
 * EmailId entity. @author MyEclipse Persistence Tools
 */

public class EmailId  implements java.io.Serializable {


    // Fields    

     private Integer emId;
     private Integer sendUserId;
     private String sendUserName;
     private Integer recieveUserId;
     private String recieveUserName;
     private String content;
     private Timestamp sendTime;
     private Timestamp readTime;
     private Boolean readed;


    // Constructors

    /** default constructor */
    public EmailId() {
    }

    
    /** full constructor */
    public EmailId(Integer emId, Integer sendUserId, String sendUserName, Integer recieveUserId, String recieveUserName, String content, Timestamp sendTime, Timestamp readTime, Boolean readed) {
        this.emId = emId;
        this.sendUserId = sendUserId;
        this.sendUserName = sendUserName;
        this.recieveUserId = recieveUserId;
        this.recieveUserName = recieveUserName;
        this.content = content;
        this.sendTime = sendTime;
        this.readTime = readTime;
        this.readed = readed;
    }

   
    // Property accessors

    public Integer getEmId() {
        return this.emId;
    }
    
    public void setEmId(Integer emId) {
        this.emId = emId;
    }

    public Integer getSendUserId() {
        return this.sendUserId;
    }
    
    public void setSendUserId(Integer sendUserId) {
        this.sendUserId = sendUserId;
    }

    public String getSendUserName() {
        return this.sendUserName;
    }
    
    public void setSendUserName(String sendUserName) {
        this.sendUserName = sendUserName;
    }

    public Integer getRecieveUserId() {
        return this.recieveUserId;
    }
    
    public void setRecieveUserId(Integer recieveUserId) {
        this.recieveUserId = recieveUserId;
    }

    public String getRecieveUserName() {
        return this.recieveUserName;
    }
    
    public void setRecieveUserName(String recieveUserName) {
        this.recieveUserName = recieveUserName;
    }

    public String getContent() {
        return this.content;
    }
    
    public void setContent(String content) {
        this.content = content;
    }

    public Timestamp getSendTime() {
        return this.sendTime;
    }
    
    public void setSendTime(Timestamp sendTime) {
        this.sendTime = sendTime;
    }

    public Timestamp getReadTime() {
        return this.readTime;
    }
    
    public void setReadTime(Timestamp readTime) {
        this.readTime = readTime;
    }

    public Boolean getReaded() {
        return this.readed;
    }
    
    public void setReaded(Boolean readed) {
        this.readed = readed;
    }
   



   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof EmailId) ) return false;
		 EmailId castOther = ( EmailId ) other; 
         
		 return ( (this.getEmId()==castOther.getEmId()) || ( this.getEmId()!=null && castOther.getEmId()!=null && this.getEmId().equals(castOther.getEmId()) ) )
 && ( (this.getSendUserId()==castOther.getSendUserId()) || ( this.getSendUserId()!=null && castOther.getSendUserId()!=null && this.getSendUserId().equals(castOther.getSendUserId()) ) )
 && ( (this.getSendUserName()==castOther.getSendUserName()) || ( this.getSendUserName()!=null && castOther.getSendUserName()!=null && this.getSendUserName().equals(castOther.getSendUserName()) ) )
 && ( (this.getRecieveUserId()==castOther.getRecieveUserId()) || ( this.getRecieveUserId()!=null && castOther.getRecieveUserId()!=null && this.getRecieveUserId().equals(castOther.getRecieveUserId()) ) )
 && ( (this.getRecieveUserName()==castOther.getRecieveUserName()) || ( this.getRecieveUserName()!=null && castOther.getRecieveUserName()!=null && this.getRecieveUserName().equals(castOther.getRecieveUserName()) ) )
 && ( (this.getContent()==castOther.getContent()) || ( this.getContent()!=null && castOther.getContent()!=null && this.getContent().equals(castOther.getContent()) ) )
 && ( (this.getSendTime()==castOther.getSendTime()) || ( this.getSendTime()!=null && castOther.getSendTime()!=null && this.getSendTime().equals(castOther.getSendTime()) ) )
 && ( (this.getReadTime()==castOther.getReadTime()) || ( this.getReadTime()!=null && castOther.getReadTime()!=null && this.getReadTime().equals(castOther.getReadTime()) ) )
 && ( (this.getReaded()==castOther.getReaded()) || ( this.getReaded()!=null && castOther.getReaded()!=null && this.getReaded().equals(castOther.getReaded()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getEmId() == null ? 0 : this.getEmId().hashCode() );
         result = 37 * result + ( getSendUserId() == null ? 0 : this.getSendUserId().hashCode() );
         result = 37 * result + ( getSendUserName() == null ? 0 : this.getSendUserName().hashCode() );
         result = 37 * result + ( getRecieveUserId() == null ? 0 : this.getRecieveUserId().hashCode() );
         result = 37 * result + ( getRecieveUserName() == null ? 0 : this.getRecieveUserName().hashCode() );
         result = 37 * result + ( getContent() == null ? 0 : this.getContent().hashCode() );
         result = 37 * result + ( getSendTime() == null ? 0 : this.getSendTime().hashCode() );
         result = 37 * result + ( getReadTime() == null ? 0 : this.getReadTime().hashCode() );
         result = 37 * result + ( getReaded() == null ? 0 : this.getReaded().hashCode() );
         return result;
   }   





}