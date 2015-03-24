package com.dxsit.base.entity;



/**
 * Tip entity. @author MyEclipse Persistence Tools
 */

public class Tip  implements java.io.Serializable {


    // Fields    

     private TipId id;


    // Constructors

    /** default constructor */
    public Tip() {
    }

    
    /** full constructor */
    public Tip(TipId id) {
        this.id = id;
    }

   
    // Property accessors

    public TipId getId() {
        return this.id;
    }
    
    public void setId(TipId id) {
        this.id = id;
    }
   








}