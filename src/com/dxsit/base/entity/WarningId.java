package com.dxsit.base.entity;

import java.sql.Timestamp;


/**
 * WarningId entity. @author MyEclipse Persistence Tools
 */

public class WarningId  implements java.io.Serializable {


    // Fields    

     private Integer wnId;
     private Integer adminId;
     private Integer wnUserId;
     private Timestamp wnDate;
     private String wnContent;
     private Short wnState;


    // Constructors

    /** default constructor */
    public WarningId() {
    }

    
    /** full constructor */
    public WarningId(Integer wnId, Integer adminId, Integer wnUserId, Timestamp wnDate, String wnContent, Short wnState) {
        this.wnId = wnId;
        this.adminId = adminId;
        this.wnUserId = wnUserId;
        this.wnDate = wnDate;
        this.wnContent = wnContent;
        this.wnState = wnState;
    }

   
    // Property accessors

    public Integer getWnId() {
        return this.wnId;
    }
    
    public void setWnId(Integer wnId) {
        this.wnId = wnId;
    }

    public Integer getAdminId() {
        return this.adminId;
    }
    
    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public Integer getWnUserId() {
        return this.wnUserId;
    }
    
    public void setWnUserId(Integer wnUserId) {
        this.wnUserId = wnUserId;
    }

    public Timestamp getWnDate() {
        return this.wnDate;
    }
    
    public void setWnDate(Timestamp wnDate) {
        this.wnDate = wnDate;
    }

    public String getWnContent() {
        return this.wnContent;
    }
    
    public void setWnContent(String wnContent) {
        this.wnContent = wnContent;
    }

    public Short getWnState() {
        return this.wnState;
    }
    
    public void setWnState(Short wnState) {
        this.wnState = wnState;
    }
   



   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof WarningId) ) return false;
		 WarningId castOther = ( WarningId ) other; 
         
		 return ( (this.getWnId()==castOther.getWnId()) || ( this.getWnId()!=null && castOther.getWnId()!=null && this.getWnId().equals(castOther.getWnId()) ) )
 && ( (this.getAdminId()==castOther.getAdminId()) || ( this.getAdminId()!=null && castOther.getAdminId()!=null && this.getAdminId().equals(castOther.getAdminId()) ) )
 && ( (this.getWnUserId()==castOther.getWnUserId()) || ( this.getWnUserId()!=null && castOther.getWnUserId()!=null && this.getWnUserId().equals(castOther.getWnUserId()) ) )
 && ( (this.getWnDate()==castOther.getWnDate()) || ( this.getWnDate()!=null && castOther.getWnDate()!=null && this.getWnDate().equals(castOther.getWnDate()) ) )
 && ( (this.getWnContent()==castOther.getWnContent()) || ( this.getWnContent()!=null && castOther.getWnContent()!=null && this.getWnContent().equals(castOther.getWnContent()) ) )
 && ( (this.getWnState()==castOther.getWnState()) || ( this.getWnState()!=null && castOther.getWnState()!=null && this.getWnState().equals(castOther.getWnState()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getWnId() == null ? 0 : this.getWnId().hashCode() );
         result = 37 * result + ( getAdminId() == null ? 0 : this.getAdminId().hashCode() );
         result = 37 * result + ( getWnUserId() == null ? 0 : this.getWnUserId().hashCode() );
         result = 37 * result + ( getWnDate() == null ? 0 : this.getWnDate().hashCode() );
         result = 37 * result + ( getWnContent() == null ? 0 : this.getWnContent().hashCode() );
         result = 37 * result + ( getWnState() == null ? 0 : this.getWnState().hashCode() );
         return result;
   }   





}