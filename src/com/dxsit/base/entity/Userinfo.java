package com.dxsit.base.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;


/**
 * Userinfo entity. @author MyEclipse Persistence Tools
 */

public class Userinfo  implements java.io.Serializable {


    // Fields    

     private Integer userId;
     private University university;
     private Major major;
     private String nickName;
     private String trueName;
     private String password;
     private String email;
     private String userImage;
     private Integer innerSchoolYear;
     private Date registerDate;
     private Integer allBrowseCount;
     private String selfIntroduce;
     private String selfUrl;
     private String qq;
     private Integer level;
     private String address;
     private Boolean activeState=false;
     private Short userDoing;
     private Boolean isLock;
     private Date lockTime;
     private Set blogCategories = new HashSet(0);
     private Set focusesForUserId = new HashSet(0);
     private Set focusesForOtherId = new HashSet(0);


    // Constructors

    /** default constructor */
    public Userinfo() {
    }

    
    /** full constructor */
    public Userinfo(University university, Major major, String nickName, String trueName, String password, String email, String userImage, Integer innerSchoolYear, Date registerDate, Integer allBrowseCount, String selfIntroduce, String selfUrl, String qq, Integer level, String address, Boolean activeState, Short userDoing, Boolean isLock, Date lockTime, Set blogCategories, Set focusesForUserId, Set focusesForOtherId) {
        this.university = university;
        this.major = major;
        this.nickName = nickName;
        this.trueName = trueName;
        this.password = password;
        this.email = email;
        this.userImage = userImage;
        this.innerSchoolYear = innerSchoolYear;
        this.registerDate = registerDate;
        this.allBrowseCount = allBrowseCount;
        this.selfIntroduce = selfIntroduce;
        this.selfUrl = selfUrl;
        this.qq = qq;
        this.level = level;
        this.address = address;
        this.activeState = activeState;
        this.userDoing = userDoing;
        this.isLock = isLock;
        this.lockTime = lockTime;
        this.blogCategories = blogCategories;
        this.focusesForUserId = focusesForUserId;
        this.focusesForOtherId = focusesForOtherId;
    }

   
    // Property accessors

    public Integer getUserId() {
        return this.userId;
    }
    
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public University getUniversity() {
        return this.university;
    }
    
    public void setUniversity(University university) {
        this.university = university;
    }

    public Major getMajor() {
        return this.major;
    }
    
    public void setMajor(Major major) {
        this.major = major;
    }

    public String getNickName() {
        return this.nickName;
    }
    
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getTrueName() {
        return this.trueName;
    }
    
    public void setTrueName(String trueName) {
        this.trueName = trueName;
    }

    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserImage() {
        return this.userImage;
    }
    
    public void setUserImage(String userImage) {
        this.userImage = userImage;
    }



    public Integer getInnerSchoolYear() {
		return innerSchoolYear;
	}


	public void setInnerSchoolYear(Integer innerSchoolYear) {
		this.innerSchoolYear = innerSchoolYear;
	}


	public Date getRegisterDate() {
        return this.registerDate;
    }
    
    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    public Integer getAllBrowseCount() {
        return this.allBrowseCount;
    }
    
    public void setAllBrowseCount(Integer allBrowseCount) {
        this.allBrowseCount = allBrowseCount;
    }

    public String getSelfIntroduce() {
        return this.selfIntroduce;
    }
    
    public void setSelfIntroduce(String selfIntroduce) {
        this.selfIntroduce = selfIntroduce;
    }

    public String getSelfUrl() {
        return this.selfUrl;
    }
    
    public void setSelfUrl(String selfUrl) {
        this.selfUrl = selfUrl;
    }

    public String getQq() {
        return this.qq;
    }
    
    public void setQq(String qq) {
        this.qq = qq;
    }

    public Integer getLevel() {
        return this.level;
    }
    
    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getAddress() {
        return this.address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }

    public Boolean getActiveState() {
        return this.activeState;
    }
    
    public void setActiveState(Boolean activeState) {
        this.activeState = activeState;
    }

    public Short getUserDoing() {
        return this.userDoing;
    }
    
    public void setUserDoing(Short userDoing) {
        this.userDoing = userDoing;
    }

    public Boolean getIsLock() {
        return this.isLock;
    }
    
    public void setIsLock(Boolean isLock) {
        this.isLock = isLock;
    }

    public Date getLockTime() {
        return this.lockTime;
    }
    
    public void setLockTime(Date lockTime) {
        this.lockTime = lockTime;
    }

    public Set getBlogCategories() {
        return this.blogCategories;
    }
    
    public void setBlogCategories(Set blogCategories) {
        this.blogCategories = blogCategories;
    }

    public Set getFocusesForUserId() {
        return this.focusesForUserId;
    }
    
    public void setFocusesForUserId(Set focusesForUserId) {
        this.focusesForUserId = focusesForUserId;
    }

    public Set getFocusesForOtherId() {
        return this.focusesForOtherId;
    }
    
    public void setFocusesForOtherId(Set focusesForOtherId) {
        this.focusesForOtherId = focusesForOtherId;
    }


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Userinfo [userId=" + userId + ", university=" + university
				+ ", major=" + major + ", nickName=" + nickName + ", trueName="
				+ trueName + ", password=" + password + ", email=" + email
				+ ", userImage=" + userImage + ", innerSchoolYear=" + innerSchoolYear
				+ ", registerDate=" + registerDate + ", allBrowseCount="
				+ allBrowseCount + ", selfIntroduce=" + selfIntroduce
				+ ", selfUrl=" + selfUrl + ", qq=" + qq + ", level=" + level
				+ ", address=" + address + ", activeState=" + activeState
				+ ", userDoing=" + userDoing + ", isLock=" + isLock
				+ ", lockTime=" + lockTime + ", blogCategories="
				+ blogCategories + ", focusesForUserId=" + focusesForUserId
				+ ", focusesForOtherId=" + focusesForOtherId + "]";
	}
   








}