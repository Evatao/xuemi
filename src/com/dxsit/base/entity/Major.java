package com.dxsit.base.entity;

/**
 * Major entity. @author MyEclipse Persistence Tools
 */

public class Major implements java.io.Serializable {

	// Fields

	private Integer majorId;
	private Integer sid;
	private String majorName;

	// Constructors

	/** default constructor */
	public Major() {
	}

	/** full constructor */
	public Major(Integer majorId, Integer sid, String majorName) {
		super();
		this.majorId = majorId;
		this.sid = sid;
		this.majorName = majorName;
	}

	// Property accessors

	public Integer getMajorId() {
		return this.majorId;
	}

	public Integer getSid() {
		return sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}

	public void setMajorId(Integer majorId) {
		this.majorId = majorId;
	}

	public String getMajorName() {
		return this.majorName;
	}

	public void setMajorName(String majorName) {
		this.majorName = majorName;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Major [majorId=" + majorId + ", sid=" + sid + ", majorName="
				+ majorName +  "]";
	}



}