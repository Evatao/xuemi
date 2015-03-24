package com.dxsit.base.entity;



/**
 * Warning entity. @author MyEclipse Persistence Tools
 */

public class Warning  implements java.io.Serializable {


    // Fields    

     private WarningId id;


    // Constructors

    /** default constructor */
    public Warning() {
    }

    
    /** full constructor */
    public Warning(WarningId id) {
        this.id = id;
    }

   
    // Property accessors

    public WarningId getId() {
        return this.id;
    }
    
    public void setId(WarningId id) {
        this.id = id;
    }
   








}