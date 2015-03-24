package com.dxsit.base.entity;



/**
 * FocusId entity. @author MyEclipse Persistence Tools
 */

public class FocusId  implements java.io.Serializable {


    // Fields    

     private Integer userId;
     private Integer otherId;


    // Constructors

    /** default constructor */
    public FocusId() {
    }

    
    /** full constructor */
    public FocusId(Integer userId, Integer otherId) {
        this.userId = userId;
        this.otherId = otherId;
    }

   
    // Property accessors

    public Integer getUserId() {
        return this.userId;
    }
    
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getOtherId() {
        return this.otherId;
    }
    
    public void setOtherId(Integer otherId) {
        this.otherId = otherId;
    }
   



   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof FocusId) ) return false;
		 FocusId castOther = ( FocusId ) other; 
         
		 return ( (this.getUserId()==castOther.getUserId()) || ( this.getUserId()!=null && castOther.getUserId()!=null && this.getUserId().equals(castOther.getUserId()) ) )
 && ( (this.getOtherId()==castOther.getOtherId()) || ( this.getOtherId()!=null && castOther.getOtherId()!=null && this.getOtherId().equals(castOther.getOtherId()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getUserId() == null ? 0 : this.getUserId().hashCode() );
         result = 37 * result + ( getOtherId() == null ? 0 : this.getOtherId().hashCode() );
         return result;
   }   





}