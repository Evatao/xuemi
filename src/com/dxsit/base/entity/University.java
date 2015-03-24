package com.dxsit.base.entity;

import java.util.HashSet;
import java.util.Set;


/**
 * University entity. @author MyEclipse Persistence Tools
 */

public class University  implements java.io.Serializable {


    // Fields    

     private Integer universityId;
    private Integer sid;
    private Integer cid;
    private String universityName;
    private	 String intro;  
    private  Integer blogCount;
    private Set<Major> majors;

    // Constructors

    /** default constructor */
    public University() {
    }

    


   
    // Property accessors

    public University(Integer universityId, Integer sid, Integer cid,
			String universityName, String intro, Integer blogCount) {
		super();
		this.universityId = universityId;
		this.sid = sid;
		this.cid = cid;
		this.universityName = universityName;
		this.intro = intro;
		this.blogCount = blogCount;
	}





	public Integer getUniversityId() {
        return this.universityId;
    }
    
    public void setUniversityId(Integer universityId) {
        this.universityId = universityId;
    }

    public String getUniversityName() {
        return this.universityName;
    }
    
    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }





	public Set<Major> getMajors() {
		return majors;
	}





	public void setMajors(Set<Major> majors) {
		this.majors = majors;
	}





	public Integer getSid() {
		return sid;
	}





	public void setSid(Integer sid) {
		this.sid = sid;
	}





	public Integer getCid() {
		return cid;
	}





	public void setCid(Integer cid) {
		this.cid = cid;
	}





	public String getIntro() {
		return intro;
	}



	public void setIntro(String intro) {
		this.intro = intro;
	}





	public Integer getBlogCount() {
		return blogCount;
	}





	public void setBlogCount(Integer blogCount) {
		this.blogCount = blogCount;
	}





	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "University [universityId=" + universityId + ", sid=" + sid
				+ ", cid=" + cid + ", universityName=" + universityName
				+ ", intro=" + intro + ", blogCount=" + blogCount + ", majors="
				+ majors + "]";
	}



}