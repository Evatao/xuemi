package com.dxsit.base.entity;

import java.sql.Timestamp;


/**
 * TipId entity. @author MyEclipse Persistence Tools
 */

public class TipId  implements java.io.Serializable {


    // Fields    

     private Integer tipId;
     private Short tipType;
     private Integer userId;
     private Integer fromUserId;
     private String fromUserName;
     private Integer blogId;
     private String blogName;
     private Timestamp tipDate;


    // Constructors

    /** default constructor */
    public TipId() {
    }

    
    /** full constructor */
    public TipId(Integer tipId, Short tipType, Integer userId, Integer fromUserId, String fromUserName, Integer blogId, String blogName, Timestamp tipDate) {
        this.tipId = tipId;
        this.tipType = tipType;
        this.userId = userId;
        this.fromUserId = fromUserId;
        this.fromUserName = fromUserName;
        this.blogId = blogId;
        this.blogName = blogName;
        this.tipDate = tipDate;
    }

   
    // Property accessors

    public Integer getTipId() {
        return this.tipId;
    }
    
    public void setTipId(Integer tipId) {
        this.tipId = tipId;
    }

    public Short getTipType() {
        return this.tipType;
    }
    
    public void setTipType(Short tipType) {
        this.tipType = tipType;
    }

    public Integer getUserId() {
        return this.userId;
    }
    
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getFromUserId() {
        return this.fromUserId;
    }
    
    public void setFromUserId(Integer fromUserId) {
        this.fromUserId = fromUserId;
    }

    public String getFromUserName() {
        return this.fromUserName;
    }
    
    public void setFromUserName(String fromUserName) {
        this.fromUserName = fromUserName;
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

    public Timestamp getTipDate() {
        return this.tipDate;
    }
    
    public void setTipDate(Timestamp tipDate) {
        this.tipDate = tipDate;
    }
   



   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof TipId) ) return false;
		 TipId castOther = ( TipId ) other; 
         
		 return ( (this.getTipId()==castOther.getTipId()) || ( this.getTipId()!=null && castOther.getTipId()!=null && this.getTipId().equals(castOther.getTipId()) ) )
 && ( (this.getTipType()==castOther.getTipType()) || ( this.getTipType()!=null && castOther.getTipType()!=null && this.getTipType().equals(castOther.getTipType()) ) )
 && ( (this.getUserId()==castOther.getUserId()) || ( this.getUserId()!=null && castOther.getUserId()!=null && this.getUserId().equals(castOther.getUserId()) ) )
 && ( (this.getFromUserId()==castOther.getFromUserId()) || ( this.getFromUserId()!=null && castOther.getFromUserId()!=null && this.getFromUserId().equals(castOther.getFromUserId()) ) )
 && ( (this.getFromUserName()==castOther.getFromUserName()) || ( this.getFromUserName()!=null && castOther.getFromUserName()!=null && this.getFromUserName().equals(castOther.getFromUserName()) ) )
 && ( (this.getBlogId()==castOther.getBlogId()) || ( this.getBlogId()!=null && castOther.getBlogId()!=null && this.getBlogId().equals(castOther.getBlogId()) ) )
 && ( (this.getBlogName()==castOther.getBlogName()) || ( this.getBlogName()!=null && castOther.getBlogName()!=null && this.getBlogName().equals(castOther.getBlogName()) ) )
 && ( (this.getTipDate()==castOther.getTipDate()) || ( this.getTipDate()!=null && castOther.getTipDate()!=null && this.getTipDate().equals(castOther.getTipDate()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getTipId() == null ? 0 : this.getTipId().hashCode() );
         result = 37 * result + ( getTipType() == null ? 0 : this.getTipType().hashCode() );
         result = 37 * result + ( getUserId() == null ? 0 : this.getUserId().hashCode() );
         result = 37 * result + ( getFromUserId() == null ? 0 : this.getFromUserId().hashCode() );
         result = 37 * result + ( getFromUserName() == null ? 0 : this.getFromUserName().hashCode() );
         result = 37 * result + ( getBlogId() == null ? 0 : this.getBlogId().hashCode() );
         result = 37 * result + ( getBlogName() == null ? 0 : this.getBlogName().hashCode() );
         result = 37 * result + ( getTipDate() == null ? 0 : this.getTipDate().hashCode() );
         return result;
   }   





}