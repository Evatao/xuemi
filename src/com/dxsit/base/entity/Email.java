package com.dxsit.base.entity;



/**
 * Email entity. @author MyEclipse Persistence Tools
 */

public class Email  implements java.io.Serializable {


    // Fields    

     private EmailId id;


    // Constructors

    /** default constructor */
    public Email() {
    }

    
    /** full constructor */
    public Email(EmailId id) {
        this.id = id;
    }

   
    // Property accessors

    public EmailId getId() {
        return this.id;
    }
    
    public void setId(EmailId id) {
        this.id = id;
    }
   








}