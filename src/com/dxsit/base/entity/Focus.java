package com.dxsit.base.entity;

import java.util.Date;


/**
 * Focus entity. @author MyEclipse Persistence Tools
 */

public class Focus  implements java.io.Serializable {


    // Fields    

     private FocusId id;
     private Userinfo userinfoByOtherId;
     private Userinfo userinfoByUserId;
     private String nickName;
     private String noteName;
     private Integer browseCount;
     private Date focusDate;


    // Constructors

    /** default constructor */
    public Focus() {
    }

	/** minimal constructor */
    public Focus(FocusId id, Userinfo userinfoByOtherId, Userinfo userinfoByUserId) {
        this.id = id;
        this.userinfoByOtherId = userinfoByOtherId;
        this.userinfoByUserId = userinfoByUserId;
    }
    
    /** full constructor */
    public Focus(FocusId id, Userinfo userinfoByOtherId, Userinfo userinfoByUserId, String nickName, String noteName, Integer browseCount, Date focusDate) {
        this.id = id;
        this.userinfoByOtherId = userinfoByOtherId;
        this.userinfoByUserId = userinfoByUserId;
        this.nickName = nickName;
        this.noteName = noteName;
        this.browseCount = browseCount;
        this.focusDate = focusDate;
    }

   
    // Property accessors

    public FocusId getId() {
        return this.id;
    }
    
    public void setId(FocusId id) {
        this.id = id;
    }

    public Userinfo getUserinfoByOtherId() {
        return this.userinfoByOtherId;
    }
    
    public void setUserinfoByOtherId(Userinfo userinfoByOtherId) {
        this.userinfoByOtherId = userinfoByOtherId;
    }

    public Userinfo getUserinfoByUserId() {
        return this.userinfoByUserId;
    }
    
    public void setUserinfoByUserId(Userinfo userinfoByUserId) {
        this.userinfoByUserId = userinfoByUserId;
    }

    public String getNickName() {
        return this.nickName;
    }
    
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getNoteName() {
        return this.noteName;
    }
    
    public void setNoteName(String noteName) {
        this.noteName = noteName;
    }

    public Integer getBrowseCount() {
        return this.browseCount;
    }
    
    public void setBrowseCount(Integer browseCount) {
        this.browseCount = browseCount;
    }

    public Date getFocusDate() {
        return this.focusDate;
    }
    
    public void setFocusDate(Date focusDate) {
        this.focusDate = focusDate;
    }
   








}